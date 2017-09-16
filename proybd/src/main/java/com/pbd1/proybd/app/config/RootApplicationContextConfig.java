package com.pbd1.proybd.app.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Carlos Cubur
 * @since 29/08/16
 */

@Configuration
//@EnableAutoConfiguration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.pbd1.proybd")
@Import({WebSecurityConfig.class})

public class RootApplicationContextConfig {

    /*private static final Logger LOG = LoggerFactory.getLogger(RootApplicationContextConfig.class);

    @Autowired
    private Environment env;

    *//**
     * Application custom initialization code.
     * <p/>
     * Spring profiles can be configured with a system property
     * -Dspring.profiles.active=javaee
     * <p/>
     *//*
    @PostConstruct
    public void initApp() {
        LOG.debug("Looking for Spring profiles...");
        if (env.getActiveProfiles().length == 0) {
            LOG.info("No Spring profile configured, running with default configuration.");
        } else {
            for (String profile : env.getActiveProfiles()) {
                LOG.info("Detected Spring profile: {}", profile);
            }
        }
    }*/
}