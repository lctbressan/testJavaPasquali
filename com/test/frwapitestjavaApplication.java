package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

//import java.util.logging.Logger;

/*@EnableFeignClients
@ComponentScan(basePackages = "com.trendalytics",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
                DataGeneratorClientConfiguration.class
       }))*/

/*@RestController
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})


public class frwapitestjavaApplication {

        private static final Logger logger = (Logger) LogManager.getLogger(frwapitestjavaApplication.class);

        public static void main(String[] args) {

                final ConfigurableApplicationContext context = SpringApplication.run(frwapitestjavaApplication.class, args);

                final AtomicInteger counter = new AtomicInteger(0);
                logger.info("**************** START: Total Bean Objects: {} ******************", context.getBeanDefinitionCount());

                Arrays.asList(context.getBeanDefinitionNames())
                        .forEach(beanName -> {
                                logger.info("{}) Bean Name: {} ", counter.incrementAndGet(), beanName);
                        });

                logger.info("**************** END: Total Bean: {} ******************", context.getBeanDefinitionCount());
                SpringApplication.run(frwapitestjavaApplication.class, args);




                *//*System.setProperty("spring.config.name", "application");
                SpringApplication application = new SpringApplication(frwapitestjavaApplication.class);
                application.setBannerMode(Banner.Mode.OFF);
                application.run(args);*//*
        }*/


//@EnableFeignClients
/*@ComponentScan(basePackages = "com.trendalytics",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
                DataGeneratorClientConfiguration.class
        }))*/
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class frwapitestjavaApplication {

        public static void main(String[] args) {
                SpringApplication.run(frwapitestjavaApplication.class, args);
        }
}
