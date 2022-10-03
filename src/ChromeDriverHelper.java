import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChromeDriverHelper {

    private final ChromeDriver driver;
    public static ChromeDriverHelper driverHelper;

    private ChromeDriverHelper() {
        driver = new ChromeDriver();
    }

    public static ChromeDriverHelper getInstance() {
        System.setProperty("webdriver.chrome.driver", Const.PATH_DRIVER);
        if (driverHelper == null) driverHelper = new ChromeDriverHelper();
        return driverHelper;
    }

    public void getUrl(String url) {
        driver.get(url);
    }

    public WebElement getElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement getElementByCsSelector(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }

    public List<WebElement> getElementsByXpath(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }

    public List<WebElement> getElementsByCsSelector(String cssSelector) {
        return driver.findElements(By.cssSelector(cssSelector));
    }

    public ChromeDriver getDriver() {
        return driver;
    }
}
