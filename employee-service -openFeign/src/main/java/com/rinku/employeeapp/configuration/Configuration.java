package com.rinku.employeeapp.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;

@org.springframework.context.annotation.Configuration
@EnableFeignClients( basePackages = { "com.rinku" } )
public class Configuration {


}
