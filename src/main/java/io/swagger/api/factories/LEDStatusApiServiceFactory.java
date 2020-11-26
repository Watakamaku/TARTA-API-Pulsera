package io.swagger.api.factories;

import io.swagger.api.LEDStatusApiService;
import io.swagger.api.impl.LEDStatusApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-26T22:46:09.007Z[GMT]")public class LEDStatusApiServiceFactory {
    private final static LEDStatusApiService service = new LEDStatusApiServiceImpl();

    public static LEDStatusApiService getLEDStatusApi() {
        return service;
    }
}
