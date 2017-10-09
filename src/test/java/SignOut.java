import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SignOut {
    public void SignOut(WebDriver driver){
        WebUtil.click(driver, By.cssSelector("span[class='gb_7a gbii']") );
        WebUtil.implicitWait(driver);
        WebUtil.click(driver, By.id("gb_71"));
    }
}
