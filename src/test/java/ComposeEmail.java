import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComposeEmail {
    public void composeEmail(WebDriver driver){
        //1. Click Compose
        WebUtil.click(driver, By.cssSelector("div[role='button'][gh='cm']"));
        //1.1 add a wait
        WebUtil.implicitWait(driver);
        //2. fill in recipient
        WebElement recipient = driver.findElement(By.cssSelector("textarea[name='to']"));
        recipient.clear();
        recipient.sendKeys("automationtestingtraining12@gmail.com");
        //2.1 Add a wait
        WebUtil.implicitWait(driver);
        //3. Fill in subject
        WebElement subjectBox = driver.findElement(By.cssSelector("input[name='subjectbox']"));
        final String subject = "Test Sending Email";
        subjectBox.clear();
        subjectBox.sendKeys(subject);
        //3.1 Add a wait
        WebUtil.implicitWait(driver);
        //4. Fill in email body
        WebElement bodyText= driver.findElement(By.cssSelector("div[aria-label='Message Body']"));
        final String emailBody = "Hello Testers!";
        bodyText.sendKeys(emailBody);
        //4.1 Add Wait
        WebUtil.implicitWait(driver);
        //5. Click Send
        WebUtil.click(driver, By.cssSelector("div[aria-label*=\"Send\"]"));
    }
}
