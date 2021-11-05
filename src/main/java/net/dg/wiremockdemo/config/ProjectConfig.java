package net.dg.wiremockdemo.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "net.dg.wiremockdemo.proxy")
public class ProjectConfig {
}
