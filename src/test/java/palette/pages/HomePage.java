package palette.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='categoryDropDown departments']")
    public WebElement departmentDropDown;

    @FindBy(xpath = "(//ul[@class='categoryDropDownListContainer'])[1]//li[@class='dropDownOption']")
    public List<WebElement> dropDownOptions;

}
