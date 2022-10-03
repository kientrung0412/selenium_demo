import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {
        ChromeDriverHelper driverHelper = ChromeDriverHelper.getInstance();
        driverHelper.getUrl("");

        driverHelper
                .getElementByXpath("/html/body/div/main/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]")
                .click();

        driverHelper
                .getElementByXpath("/html/body/div/main/div[2]/div/div[1]/div/div/section/main/div[1]/div/div[1]/div[2]/a[1]")
                .click();

        new Actions(driverHelper.getDriver())
                .scrollToElement(driverHelper.getElementByXpath("/html/body/div/main/div[2]/center[2]"))
                .perform();
    }

}