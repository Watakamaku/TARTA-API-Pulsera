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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-26T22:46:09.007Z[GMT]")public class ChangeLEDApiServiceImpl extends ChangeLEDApiService {
    @Override
    public Response changeLEDPut(String body, SecurityContext securityContext) throws NotFoundException {
        LED.getInstance().setColor(body);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, LED.getInstance().getColor())).build();
    }
}
