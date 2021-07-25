package com.cybertek.step_definitions;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_StepDefinitions {
    LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
    @Given("user is on Cybertek Library App Login page")
    public void user_is_on_cybertek_library_app_login_page() {
        String libraryLoginUrl=ConfigurationReader.getProperty("libraryLoginPage");
        Driver.getDriver().get(libraryLoginUrl);
    }
        @When("librarian enters correct credentials")
    public void librarian_enters_correct_credentials() {
        libraryLoginPage.emailInput.sendKeys("librarian13@library");
        libraryLoginPage.passwordInput.sendKeys("9rf6axdD");
    }
    @When("clicks sign in button")
    public void clicks_sign_in_button() {
        libraryLoginPage.signIn.click();
    }
    @Then("librarian dashboard should be displayed")
    public void librarian_dashboard_should_be_displayed() {
        WebElement usersTab=Driver.getDriver().findElement(By.xpath("//span[.='Users']"));
        boolean isDisplayed=usersTab.isDisplayed();
        Assert.assertTrue("Librarian Dashboard is not displayed",isDisplayed);
    }

    @When("student enters correct credentials")
    public void student_enters_correct_credentials() {
        libraryLoginPage.emailInput.sendKeys("student11@library");
        libraryLoginPage.passwordInput.sendKeys("tScBPCUr");
    }
    @Then("student dashboard should be displayed")
    public void student_dashboard_should_be_displayed() {
        WebElement booksText=Driver.getDriver().findElement(By.xpath("//h3[.='Book Management']"));
        boolean textIsDisplayed=booksText.isDisplayed();
        Assert.assertTrue("Student Dashboard is not displayed",textIsDisplayed);
    }
}
