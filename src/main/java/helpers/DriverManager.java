package helpers;

import org.openqa.selenium.WebDriver;

/**
 *  Driver manager interface
 */
public interface DriverManager {

    /**
     * Creates WebDriver instance for a specified browser
     */
    void createDriver();

    /**
     * @return the created WebDriver instance
     */
    WebDriver getDriver();

    /**
     * Maximizes the browser window
     */
    default void maximizeDriver() {
      getDriver().manage().window().maximize();
    }

    /**
     *  Quits the driver, closing every associated window
     */
    default void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }

}
