package helpers;

import org.openqa.selenium.WebDriver;

public abstract class Page extends Component {
    public DynamicDriverManager driverManager;
    private WebDriver driver;

    public Page(DynamicDriverManager driverManager) {
        super(driverManager);
    }

}
