package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import testRunner.Driver;


public class AddRemove extends Driver {



    @When("I select AddRemove")
    public void iSelectAddRemove() {


        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(2) > a")).click();
    }

    @And("I select add element")
    public void iSelectAddElement() {
        driver.findElement(By.cssSelector("#content > div > button")).click();
    }

    @And("I select delete")
    public void iSelectDelete() {
        driver.findElement(By.cssSelector("#elements > button")).click();
    }

    @Then("i close window")
    public void iCloseWindow() {
        driver.quit();

    }
}
