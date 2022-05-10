package pageobjects;

import helpers.DynamicDriverManager;
import helpers.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ProductPage extends Page {

    @FindBy(id = "productTitle")
    public WebElement productTitle;

    @FindBy(xpath = "//span[contains(@class,'a-button-selected')]//a[@class='a-button-text']//span")
    public List<WebElement> selectedProductTypeList;

    @FindBy(id = "img-canvas")
    public WebElement productBadge;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToBasketButton;

    @FindBy(xpath = "//span[contains(@class,'sw-atc-text')]")
    public WebElement notificationText;

    @FindBy(className = "sc-without-multicart")
    public WebElement itemCountProceed;

    @FindBy(id = "sw-subtotal-item-count")
    public WebElement itemCountBasket;

    @FindBy(xpath = "//a[contains(string(), 'Go to basket')]")
    public WebElement goToBasketButton;

    public ProductPage(DynamicDriverManager driverManager) {
        super(driverManager);
    }

}
