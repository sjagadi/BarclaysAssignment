package com.google.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/com/google/features",
        glue = "com.google.stepDefinitions"
)
public class GoogleSearchTestRunner {}