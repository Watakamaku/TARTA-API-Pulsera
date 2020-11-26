package io.swagger.api.factories;

import io.swagger.api.ActualStatusApiService;
import io.swagger.api.impl.ActualStatusApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-26T22:46:09.007Z[GMT]")public class ActualStatusApiServiceFactory {
    private final static ActualStatusApiService service = new ActualStatusApiServiceImpl();

    public static ActualStatusApiService getActualStatusApi() {
        return service;
    }
}
