package com.coffeemachine;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/Destination", "json:report/cucumber.json"})
public class CoffeeMachineTest {
}