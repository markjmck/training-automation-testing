import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOut {
    public void SignOut(WebDriver driver){
        WebUtil.click(driver, By.cssSelector("span[class='gb_7a gbii']") );
        WebUtil.implicitWait(driver);
        WebUtil.click(driver, By.id("gb_71"));
    }
}
