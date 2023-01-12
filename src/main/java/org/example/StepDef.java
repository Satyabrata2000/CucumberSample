package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {
    WebDriver driver = new ChromeDriver();
     //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (J)\\CucumberSample\\chromedriver.exe");
    @Given("User navigates to the website amazon.com")
    public void user_navigates_to_the_website_amazon_com() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
       driver.navigate().to("http://wwww/amazon.com/");
        Thread.sleep(2000);
    }
    @Given("User logs in through Login window by using Username as {string} and Password as {string}")
    public void user_logs_in_through_login_window_by_using_username_as_and_password_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Login should be successful")
    public void login_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
