package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;

import javax.validation.Valid;
import java.util.logging.Logger;

@Validated
@Controller("api/products")
public class NamingStrategyController {
    @Get("/{?queryParams*}")
    public void getProducts(@Valid BaseQueryParams queryParams) {
        Logger.getLogger("TEST").info(queryParams.toString());
    }
}
