package com.test.utils;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.HashMap;
import java.util.Map;

public class AddHeaderFeignInterceptor implements RequestInterceptor {

    private Map<String, String> headers = new HashMap<>();

    public void addHeader(final String headerName, final String value) {
        headers.put(headerName, value);
    }

    @Override
    public void apply(final RequestTemplate template) {
        headers.forEach(template::header);
    }
}
