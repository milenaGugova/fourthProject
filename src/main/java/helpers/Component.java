package helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    public DynamicDriverManager driverManager;
    private WebDriver driver;

    private int waitIntervalElement = 5;
    private int waitIntervalPage = 10;

    public Component(DynamicDriverManager driverManager) {
        this.driverManager = driverManager;
        driver = driverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void waitForElement(WebElement element) {
        waitForElement(element, waitIntervalElement);
    }

    public void waitForPage(WebElement element) {
        waitForElement(element, waitIntervalPage);
    }

    private void waitForElement(WebElement element, int waitIntervalTime) {
        WebDriverWait wait = new WebDriverWait(driver, waitIntervalTime);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public List<String> getElementsText(List<WebElement> elements) {
        List<String> elementsText = new ArrayList<>();
        for (WebElement element : elements) {
            elementsText.add(element.getText());
        }
        return elementsText;
    }

    public WebElement getElementByText(List<WebElement> elements, String text) {
        List<String> elementsText = getElementsText(elements);
        try {
            return elements.get(elementsText.indexOf(text));
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format("Cannot find element with text %s in the list %s", text, elementsText));
        }
    }

    public void typeWithClear(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public void scrollToView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollToEndOfThePage() {
    ((JavascriptExecutor) driver)
            .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

}
