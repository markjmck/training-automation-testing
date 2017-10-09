import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickInbox {
    public void backToInbox(WebDriver driver){
        WebUtil.click(driver, By.cssSelector("div[class='ar6 T-I-J3 J-J5-Ji']"));
    }
    public void clickInboxAgain(WebDriver driver){
        WebUtil.waitForElementVisible(driver,By.linkText("Inbox (1)") );
        WebUtil.click(driver, By.linkText("Inbox (1)"));
    }
}
