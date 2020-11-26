package io.swagger.api.factories;

import io.swagger.api.ChangeLEDApiService;
import io.swagger.api.impl.ChangeLEDApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-26T22:46:09.007Z[GMT]")public class ChangeLEDApiServiceFactory {
    private final static ChangeLEDApiService service = new ChangeLEDApiServiceImpl();

    public static ChangeLEDApiService getChangeLEDApi() {
        return service;
    }
}
