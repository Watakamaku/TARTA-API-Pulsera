package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.LEDStatusApiService;
import io.swagger.api.factories.LEDStatusApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/LEDStatus")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-26T22:46:09.007Z[GMT]")public class LEDStatusApi  {
   private final LEDStatusApiService delegate;

   public LEDStatusApi(@Context ServletConfig servletContext) {
      LEDStatusApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LEDStatusApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LEDStatusApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = LEDStatusApiServiceFactory.getLEDStatusApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Devuelve el estado actual del LED", description = "Devuelve el estado actual del LED, indicando el color que tiene actualmente (verde, amarillo o rojo) en función del estado de la persona (bien, febrícula, fiebre)", tags={ "Pulsera" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Devuelve el color del LED", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Error de conexión entre la pulsera y el servidor") })
    public Response lEDStatusGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.lEDStatusGet(securityContext);
    }
}
