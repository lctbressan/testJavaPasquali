package com.test.config;


import com.test.utils.AddHeaderFeignInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

//@Configuration
public class DataGeneratorClientConfiguration {

    @Value("${app.data_generator.client_id}")
    private String clientId;

    @Value("${app.data_generator.access_token}")
    private String accessToken;

    @Bean
    public AddHeaderFeignInterceptor addHeaderFeignInterceptor() {
        final AddHeaderFeignInterceptor interceptor = new AddHeaderFeignInterceptor();
        interceptor.addHeader("client_id", clientId);
        interceptor.addHeader("access_token", accessToken);
        return interceptor;
    }

}
