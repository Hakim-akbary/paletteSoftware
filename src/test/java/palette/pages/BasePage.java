package palette.pages;

import palette.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public abstract class BasePage {

    public BasePage (){ PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//button[@class='mgbutton moove-gdpr-infobar-allow-all']")
    public WebElement cookiesHandlingButton;

    @FindBy(xpath = "//i[@class='ubermenu-sub-indicator fas fa-angle-down']")
    public WebElement solutionsKey;

   @FindBy(xpath = "//*[@id='menu-item-8640']/a")
    public WebElement languagesButton;

   @FindBy(xpath = "(//ul[@class='sub-menu'])[1]/li")
    public List<WebElement> languagesDropDown;

    @FindBy(xpath = "//ul[@class='sub-menu']//li[@id='menu-item-8645']/a")
    public WebElement danishLanguage;


}
