package in.reqres.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@GetUser",
        glue = "in.reqres.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
