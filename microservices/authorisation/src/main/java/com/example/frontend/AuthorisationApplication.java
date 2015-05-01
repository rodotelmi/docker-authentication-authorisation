package com.example.frontend;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class AuthorisationApplication extends Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new AuthorisationApplication().run(args);
    }

    @Override
    public String getName() {
        return "example-application";
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
    }

    @Override
    public void run(Configuration configuration, Environment environment) {
        //final PersonResource personResource = new PersonResource();

        //environment.jersey().register(personResource);
    }
}