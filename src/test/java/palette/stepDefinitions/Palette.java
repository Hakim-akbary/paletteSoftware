package palette.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import palette.pages.BasePage;
import palette.pages.HomePage;
import palette.utilities.BrowserUtils;
import palette.utilities.ConfigurationReader;
import palette.utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class Palette {

    @Given("the user navigates to the homepage of the application")
    public void the_user_navigates_to_the_homepage_of_the_application() {
        Driver.get().get(ConfigurationReader.get("url"));
    }



    @When("the user clicks on {string}")
    public void the_user_clicks_on(String targetDropdown) {

        BasePage basePage = new HomePage();
        basePage.cookiesHandlingButton.click();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(basePage.languagesButton);
        List<String> languagesDropDown = BrowserUtils.getElementsText(basePage.languagesDropDown);


    }


    @Then("the user should be able to see:")
    public void the_user_should_be_able_to_see(List<String> expected) {
        BasePage basePage = new HomePage();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(basePage.languagesButton);
        List<String> languagesDropDown = BrowserUtils.getElementsAttribute(basePage.languagesDropDown);


        Assert.assertEquals(expected, languagesDropDown);

    }

    @Then("the user can switch the language from {string} to {string}")
    public void the_user_can_switch_the_language_from_to(String currentLanguage, String desiredLanguage) {

        BasePage basePage = new HomePage();

        basePage.cookiesHandlingButton.click();
        //Actions actions = new Actions(Driver.get());
        //WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        //String En = BrowserUtils.waitForVisibility(basePage.languagesButton, 10).getText();
        String En = BrowserUtils.waitForVisibility(Driver.get().findElement(By.xpath("//*[@id='menu-item-8640']/a")), 5).getText();
        //String str = BrowserUtils.waitForVisibility(Driver.get().findElement(By.xpath("//*[@id='menu-item-8640']/a")), 5).getAttribute("textContent");
        System.out.println("EN =" + En);
        //wait.until(ExpectedConditions.elementToBeClickable(basePage.languagesButton));
        //actions.moveToElement(basePage.languagesButton);


        //List<String> languagesDropDown = BrowserUtils.getElementsAttribute(basePage.languagesDropDown);
        //System.out.println("languagesDropDown = " + languagesDropDown);
        //actions.moveToElement(basePage.danishLanguage).click();




    }




}
