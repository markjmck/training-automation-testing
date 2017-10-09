import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComposeEmail {
    public String[] composeEmail(WebDriver driver){
        String email = new String();
        String subject = new String();
        String body = new String();
        //1. Click Compose
        WebUtil.click(driver, By.cssSelector("div[role='button'][gh='cm']"));
        //1.1 add a wait
        WebUtil.implicitWait(driver);
        //2. fill in recipient
        email = "automationtestingtraining12@gmail.com";
        WebUtil.WriteText(driver, email, By.cssSelector("textarea[name='to']" ));
        //2.1 Add a wait
        WebUtil.implicitWait(driver);
        //3. Fill in subject
        subject = "Test Sending Email";
        WebUtil.WriteText(driver, subject, By.cssSelector("input[name='subjectbox']"));
        //3.1 Add a wait
        WebUtil.implicitWait(driver);
        //4. Fill in email body
        body = "Hello Testers!";
        WebUtil.WriteText(driver, body, By.cssSelector("div[aria-label='Message Body']") );
        //4.1 Add Wait
        WebUtil.implicitWait(driver);
        //5. Click Send
        WebUtil.click(driver, By.cssSelector("div[aria-label*=\"Send\"]"));
        String[] emailArray = new String[2];
        emailArray[0] = subject;
        emailArray[1] = body;
        return emailArray;
    }
}
