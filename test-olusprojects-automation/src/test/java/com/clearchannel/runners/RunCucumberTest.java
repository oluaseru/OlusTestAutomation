package com.clearchannel.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@search",
        features = "src/test/java/com/clearchannel",
        glue = "com/clearchannel/steps",
        plugin = {"pretty", "html:src/test/java/com/reports", "junit:src/test/java/com/reports/junit_report.xml"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        strict = true
)
public class RunCucumberTest {
}
