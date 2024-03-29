package testRunner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {
                "Features/ABTesting.feature",
                "Features/AddRemove.feature",
                "Features/Auth.feature",
                "Features/Challenging_DOM.feature",
                "Features/Checkboxes.feature",
                "Features/Context.feature",
                "Features/D_Element.feature",
                "Features/Dropdown.feature",
                "Features/Dynamic.feature",
                "Features/Dynamic_Controls.feature",
                "Features/Dynamic_Loading.feature",
                "Features/Floating_Menu.feature",
                "Features/Forgot_Password.feature",
                "Features/Form_Authentication.feature",
                "Features/HA_main.feature"
        },
        plugin = {"pretty","json:target/report.json", "html:target/cucumber-reports"},

        glue = "stepDefinitions"


)

public class TestRunner {
}
