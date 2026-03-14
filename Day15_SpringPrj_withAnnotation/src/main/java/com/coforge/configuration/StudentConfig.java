package com.coforge.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.coforge")
@PropertySource("studentInfo.properties")
public class StudentConfig {

}
