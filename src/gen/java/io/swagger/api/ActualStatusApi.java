package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ActualStatusApiService;
import io.swagger.api.factories.ActualStatusApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.TomaTemperatura;

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


@Path("/actualStatus")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-26T22:46:09.007Z[GMT]")public class ActualStatusApi  {
   private final ActualStatusApiService delegate;

   public ActualStatusApi(@Context ServletConfig servletContext) {
      ActualStatusApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ActualStatusApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ActualStatusApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ActualStatusApiServiceFactory.getActualStatusApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Devuelve la temperatura en el momento actual del usuario", description = "Devuelve la temperatura del usuario en el momento en que se solicita", tags={ "Pulsera" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Toma de temperatura en este instante del usuario.", content = @Content(schema = @Schema(implementation = TomaTemperatura.class))),
        
        @ApiResponse(responseCode = "400", description = "Error en la solicitud de la temperatura.") })
    public Response actualStatusGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.actualStatusGet(securityContext);
    }
}
