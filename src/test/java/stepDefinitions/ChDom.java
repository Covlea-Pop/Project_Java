package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import testRunner.Driver;


public class ChDom extends Driver {
    @When("when i click on DOM")
    public void when_i_click_on_dom() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a")).click();
    }

    @When("i click on blue")
    public void i_click_on_blue() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[1]")).click();
    }

    @When("i click on red")
    public void i_click_on_red() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]")).click();
    }

    @When("i click on green")
    public void i_click_on_green() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[3]")).click();
    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

}
