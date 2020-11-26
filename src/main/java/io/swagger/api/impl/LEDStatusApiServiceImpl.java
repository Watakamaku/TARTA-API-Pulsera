package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;
import io.swagger.api.impl.LED;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-26T21:48:20.880Z[GMT]")public class LEDStatusApiServiceImpl extends LEDStatusApiService {
    @Override
    public Response lEDStatusGet(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, LED.getInstance().getColor())).build();
    }
}