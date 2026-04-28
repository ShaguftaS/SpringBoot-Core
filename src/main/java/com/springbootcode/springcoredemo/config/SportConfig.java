package com.springbootcode.springcoredemo.config;

import com.springbootcode.springcoredemo.common.Coach;
import com.springbootcode.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
