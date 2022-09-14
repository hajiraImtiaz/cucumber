package com.cydeo.step_definitions;

import io.cucumber.java.Before;/*
in the class we will be able to pass pre- and post- conditions to
each scenario and each step
 */

public class Hooks {

    //IMPORT FROM io.cucumer.java not from junit
    @Before
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before");

    }

}
