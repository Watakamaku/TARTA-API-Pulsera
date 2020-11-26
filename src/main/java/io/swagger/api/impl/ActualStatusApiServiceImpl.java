package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.TomaTemperatura;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import java.util.Random;
import java.util.Date;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-26T21:48:20.880Z[GMT]")public class ActualStatusApiServiceImpl extends ActualStatusApiService {
    @Override
    public Response actualStatusGet(final SecurityContext securityContext) throws NotFoundException {

        final Date timestamp = new Date();

        final Random rng = new Random();
        final int randomValue = rng.nextInt(100);
        boolean feber = false;
        boolean littlefeber = false;

        if (randomValue < 10) {
            feber = true;
        } else if (randomValue >= 10 && randomValue <= 15) {
            littlefeber = true;
        }

        final double[] tempList = new double[5];

        final int notFebberValue = 34 + rng.nextInt(2);

        for (int i = 0; i < tempList.length; i++) {
            if (littlefeber) {
                tempList[i] = 37 + rng.nextDouble();
            } else if (feber) {
                tempList[i] = 38 + rng.nextDouble();
            } else {
                tempList[i] = notFebberValue + rng.nextDouble();
            }
        }

        final double avgTemp = (tempList[0] + tempList[1] + tempList[2] + tempList[3] + tempList[4]) / 5;

        boolean exercice = false;

        if (rng.nextInt(100) < 20) {
            exercice = true;
        }

        final int[] pulseList = new int[5];

        for (int i = 0; i < pulseList.length; i++) {
            if (exercice) {
                pulseList[i] = 80 + rng.nextInt(40);
            } else {
                pulseList[i] = 80 + rng.nextInt(20);
            }
        }

        final int avgPulse = (pulseList[0] + pulseList[1] + pulseList[2] + pulseList[3] + pulseList[4]) / 5;

        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "00:00:00:00:00:01/" + avgTemp + "/" + avgPulse + "/" + timestamp)).build();
    }
}

