package com.example.demo11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VersionProperty {
    @Value("${app.name}")
    public String AppName;

    @Value("${app.version}")
    public String AppVersion;

    @Value("${app.description}")
    public String AppDescription;

    @Value("${app.springboot.version}")
    public String SpringBootVersion;
    
}