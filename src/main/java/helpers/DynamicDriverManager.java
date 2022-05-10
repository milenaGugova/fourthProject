package helpers;

import org.openqa.selenium.WebDriver;

public class DynamicDriverManager implements DriverManager {

    private final DriverManager driverManager;

    public DynamicDriverManager() {
        String browserType = PropertiesCache.getInstance().getProperty("browser");
        switch (browserType.toLowerCase()) {
            case "chrome":
                driverManager = new ChromeDriverManager();
                break;
            default:
                throw new RuntimeException("Unsupported browser");
        }
    }

    @Override
    public void createDriver() {
        driverManager.createDriver();
    }

    @Override
    public WebDriver getDriver() {
        return driverManager.getDriver();
    }

    @Override
    public void quitDriver() {
        driverManager.quitDriver();
    }
}
