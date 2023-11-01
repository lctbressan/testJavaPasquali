package com.test.client;


import com.test.config.DataGeneratorClientConfiguration;
import com.test.datagenerator.Carrier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(value = "data-generator", url = "${app.data_generator.host}", configuration =  DataGeneratorClientConfiguration.class)

public interface DataGeneratorClient {

    @GetMapping("/search-terms/")
    List<Carrier> getSearch(@RequestParam("jeans") String  searchName);
}
