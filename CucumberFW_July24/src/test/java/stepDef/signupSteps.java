package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
public class signupSteps extends config {
    @Given("^student click on create new account button$")
    public void studentClickOnCreateNewAccountButton() {
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/div/div/div/a")).click();
    }

    @And("^student enter their first name$")
    public void studentEnterTheirFirstName() {
    }

    @And("^student enter their last name$")
    public void studentEnterTheirLastName() {
    }

    @And("^student enter their email address$")
    public void studentEnterTheirEmailAddress() {
    }

    @And("^student enter their password$")
    public void studentEnterTheirPassword() {
    }

    @And("^student confirm their password$")
    public void studentConfirmTheirPassword() {
    }

    @And("^student select their date of birth month$")
    public void studentSelectTheirDateOfBirthMonth() {
    }

    @And("^student select their date of birth day$")
    public void studentSelectTheirDateOfBirthDay() {
    }

    @And("^select their date of birth year$")
    public void selectTheirDateOfBirthYear() {
    }

    @And("^student select their gender$")
    public void studentSelectTheirGender() {
    }

    @And("^student agree to terms and condition$")
    public void studentAgreeToTermsAndCondition() {
    }

    @When("^student click on Create my account$")
    public void studentClickOnCreateMyAccount() {
    }

    @Then("^student should successfully create their student account$")
    public void studentShouldSuccessfullyCreateTheirStudentAccount() {
    }
}

