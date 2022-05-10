package pageobjects;

import helpers.DynamicDriverManager;
import helpers.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ResultsPage extends Page {

    @FindBy(xpath = "//div[@class= 'a-section']//span[contains(@class, 'a-size-medium')]")
    public List<WebElement> booksTitleList;

    @FindBy(xpath = "//div[contains(@class, 'a-section')]//img[@class='s-image']")
    public List<WebElement> booksBadgeList;

    @FindBy(xpath = "//a[contains(text(),'Back to results')]")
    public WebElement backToResultsButton;

    @FindBy(xpath = "//div[contains(@class, 's-price-instructions-style')]//a[contains(@class,'a-text-bold')]")
    public List<WebElement> selectedTypeList;

    @FindBy(xpath = "//span[@class='a-price']")
    public List<WebElement> priceList;

    public ResultsPage(DynamicDriverManager driverManager) {
        super(driverManager);
    }

}
