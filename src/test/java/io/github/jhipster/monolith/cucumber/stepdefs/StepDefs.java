package io.github.jhipster.monolith.cucumber.stepdefs;

import io.github.jhipster.monolith.JhipsterSampleMonolithApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterSampleMonolithApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
