import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class WebUtil {

    final static int WAIT_TIME_OUT = 30;
    public static void click(WebDriver driver, By by){
        WebElement element = driver.findElement(by);
        element.click();
    }

    public static void waitForElementVisible(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME_OUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void implicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static String WriteText(WebDriver driver, String text, By by){
        WebElement element = driver.findElement(by);
        //element.clear();
        element.sendKeys(text);
        return text;
    }
}
