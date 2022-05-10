package pageobjects;

import helpers.DynamicDriverManager;
import helpers.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingBasket extends Page {

    @FindBy(xpath = "//span[@class='a-truncate-cut']")
    public WebElement bookTitle;

    @FindBy(xpath = "//span[contains(@class, 'sc-product-binding')]")
    public WebElement printType;

    @FindBy(xpath = "//span[contains(@class, 'sc-product-price')]")
    public WebElement bookPrice;

    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    public WebElement bookQuantity;

    @FindBy(xpath = "//span[@id='sc-subtotal-amount-activecart']//span")
    public WebElement totalPrice;

    public ShoppingBasket(DynamicDriverManager driverManager) {
        super(driverManager);
    }

}
