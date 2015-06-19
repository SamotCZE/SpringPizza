package com.springinaction.pizza.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hudectom on 24.4.2015.
 */
@Configuration
@ComponentScan(basePackages = { "com.springinaction.pizza" })
public class RootConfig {
}
