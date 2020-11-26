package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ChangeLEDApiService;
import io.swagger.api.factories.ChangeLEDApiServiceFactory;

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


@Path("/changeLED")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-26T22:46:09.007Z[GMT]")public class ChangeLEDApi  {
   private final ChangeLEDApiService delegate;

   public ChangeLEDApi(@Context ServletConfig servletContext) {
      ChangeLEDApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ChangeLEDApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ChangeLEDApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ChangeLEDApiServiceFactory.getChangeLEDApi();
      }

      this.delegate = delegate;
   }

    @PUT
    
    @Consumes({ "text/plain" })
    
    @Operation(summary = "Cambia el color del LED", description = "Cambia el color del LED a uno de los colores (verde, amarillo o rojo) en función del estado de la persona", tags={ "Pulsera" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Color cambiado"),
        
        @ApiResponse(responseCode = "400", description = "Color incorrecto"),
        
        @ApiResponse(responseCode = "409", description = "Ese color ya está definido") })
    public Response changeLEDPut(@Parameter(in = ParameterIn.DEFAULT, description = "" ) String body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.changeLEDPut(body,securityContext);
    }
}
