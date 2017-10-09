import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickNewEmail {
    public void clickEmail(WebDriver driver){
        WebUtil.click(driver, By.cssSelector("div[class='y6'] span[id] b"));
    }
}
