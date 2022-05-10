package pageobjects;

import helpers.DynamicDriverManager;
import helpers.Page;
import helpers.PropertiesCache;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    @FindBy(id = "a-page")
    public WebElement homePageDiv;

    @FindBy(xpath = "//span[@class='nav-logo-locale']")
    public WebElement logoLocale;

    @FindBy(name = "accept")
    public WebElement acceptCookiesButton;

    @FindBy(xpath = "//a[text()='Books']")
    public WebElement booksSection;

    @FindBy(xpath = "//h1")
    public WebElement pageTitle;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchSubmitButton;

    public HomePage(DynamicDriverManager driverManager) {
        this(driverManager, false);
    }

    public HomePage(DynamicDriverManager driverManager, Boolean navigateToUrl) {
        super(driverManager);

        if (navigateToUrl) {
            driverManager.getDriver().navigate().to(PropertiesCache.getInstance().getProperty("base.url"));
        }
    }
}
