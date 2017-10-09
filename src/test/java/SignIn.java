import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
    public void signIn(WebDriver driver) {
        String textToWrite = new String();
        //1. Enter email address
        textToWrite = "automationtestingtraining12@gmail.com";
        WebUtil.WriteText(driver, textToWrite, By.id("identifierId") );
        //1.1 click next
        WebUtil.click(driver,By.cssSelector("span.RveJvd.snByac") );
        //1.2 Add a wait
        WebUtil.implicitWait(driver);
        //2. Fill in password
        textToWrite = "testingPurposes";
        WebUtil.WriteText(driver, textToWrite, By.xpath("//*[@id='password']/div[1]/div/div[1]/input") );
        //2.1 Add await
        WebUtil.implicitWait(driver);
        //3. Click Sign in
        WebUtil.waitForElementVisible(driver, By.cssSelector("span.RveJvd.snByac"));
        WebUtil.click(driver, By.cssSelector("span.RveJvd.snByac") );
        WebUtil.implicitWait(driver);
        //4. Verify user did sign in
        Assert.assertTrue("Inbox should exist", driver.findElements(By.partialLinkText("Inbox")).size() > 0);
    }
}
