package com.coffeemachine;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class CoffeeMachineTest {format = {"pretty", "html:target/Destination", "json:report/cucumber.json"}
}