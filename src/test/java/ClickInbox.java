import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickInbox {
    public void backToInbox(WebDriver driver){
        WebElement backToInbox = driver.findElement(By.cssSelector("div[class='ar6 T-I-J3 J-J5-Ji']"));
        backToInbox.click();
    }
    public void clickInboxAgain(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Inbox (1)")));
        WebElement inboxButton= driver.findElement(By.linkText("Inbox (1)"));
        inboxButton.click();
    }
}
