import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ComposeEmail {
    public void composeEmail(WebDriver driver){
        //2. Click Compose
        WebElement composeButton = driver.findElement(By.cssSelector("div[role='button'][gh='cm']"));
        composeButton.click();
        //2.1 add a wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //3. fill in recipient
        WebElement recipient = driver.findElement(By.cssSelector("textarea[name='to']"));
        recipient.clear();
        recipient.sendKeys("automationtestingtraining12@gmail.com");
        //3.1 Add a wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //4. Fill in subject
        WebElement subjectBox = driver.findElement(By.cssSelector("input[name='subjectbox']"));
        final String subject = "Test Sending Email";
        subjectBox.clear();
        subjectBox.sendKeys(subject);
        //4.1 Add a wait
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //5. Fill in email body
        WebElement bodyText= driver.findElement(By.cssSelector("div[aria-label='Message Body']"));
        final String emailBody = "Hello Testers!";
        bodyText.sendKeys(emailBody);
        //5.1 Add Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //6. Click Send
        WebElement sendButton= driver.findElement(By.cssSelector("div[aria-label*=\"Send\"]"));
        sendButton.click();
    }
}
