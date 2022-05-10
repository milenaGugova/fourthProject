package helpers;

import io.cucumber.java.en.And;

public class CommonSteps {
    public DynamicDriverManager driverManger;

    public CommonSteps(DynamicDriverManager driverManager){
        this.driverManger = driverManager;
    }

    @And("^I start the browser$")
    public void startBrowser() {
        driverManger.createDriver();
        driverManger.maximizeDriver();
    }

    @And("^I stop the browser$")
    public void stopBrowser() {
        driverManger.quitDriver();
    }

}
