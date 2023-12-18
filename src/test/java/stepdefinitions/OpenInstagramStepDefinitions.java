package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.Assert.assertTrue;

public class OpenInstagramStepDefinitions {

    private WebDriver driver;

    @Given("I open the Microsoft Edge browser")
    public void iOpenTheMicrosoftEdgeBrowser() {
        System.setProperty("webdriver.edge.driver", "C:/Users/satya/Downloads/Compressed/msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @When("I navigate to the Instagram page")
    public void iNavigateToTheInstagramPage() {
        driver.get("https://www.instagram.com/");
    }

    @Then("I should see the Instagram login page")
    public void iShouldSeeTheInstagramLoginPage() {
        assertTrue(driver.findElement(By.id("loginForm")).isDisplayed());
        driver.quit();
    }
}
