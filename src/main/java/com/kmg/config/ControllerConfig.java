package com.kmg.config;

import com.kmg.controller.TestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Bean
    public TestController testController() {
        return new TestController();
    }

}
