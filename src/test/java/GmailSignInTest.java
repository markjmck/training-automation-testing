import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

/** Created by Mark on 03/10/2017
 *
 */

//commit to test my ssh key
public class GmailSignInTest {
    @Test
    public void gmailLoginShouldBeSuccessful() {
        //1. Go to Gmail Website
        System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.gmail.com");
        //2. Fill in Username
        WebElement usernameTextbox = driver.findElement(By.id("identifierId"));
        usernameTextbox.clear();
        usernameTextbox.sendKeys("automationtestingtraining12@gmail.com");
        //2.1 click next
        driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
        //2.2 Add a wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Fill in password
        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("testingPurposes");
        //3.1 Add await
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //4. Click Sign in
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.RveJvd.snByac")));
        driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //5. Verify user did sign in
        Assert.assertTrue("Inbox should exist",driver.findElements(By.partialLinkText("Inbox")).size() > 0);
        //6. Sign out
        WebElement profileButton = driver.findElement(By.cssSelector("span[class='gb_7a gbii']"));
        profileButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement signOutButton = driver.findElement(By.id("gb_71"));
        signOutButton.click();
        //7. Verify user did sign out
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")));
        Assert.assertTrue("Sign in button should exist", driver.findElements(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).size() > 0);
    }

    @Test
    public void gmailSendAndReceiveEmailTest(){
        //1. Launch Gmail and sign in
        System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.gmail.com");
        WebElement usernameTextbox = driver.findElement(By.id("identifierId"));
        usernameTextbox.clear();
        usernameTextbox.sendKeys("automationtestingtraining12@gmail.com");
        driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("testingPurposes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.RveJvd.snByac")));
        driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue("Inbox should exist",driver.findElements(By.partialLinkText("Inbox")).size() > 0);
        //2. Click Compose
        WebElement composeButton = driver.findElement(By.cssSelector("div[role='button'][gh='cm']"));
        composeButton.click();
        //2.1 add a wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. fill in recipient
        WebElement recipient = driver.findElement(By.cssSelector("textarea[name='to']"));
        recipient.clear();
        recipient.sendKeys("automationtestingtraining12@gmail.com");
        //3.1 Add a wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //4. Fill in subject
        WebElement subjectBox = driver.findElement(By.cssSelector("input[name='subjectbox']"));
        final String subject = "Test Sending Email";
        subjectBox.clear();
        subjectBox.sendKeys(subject);
        //5. Fill in email body
        WebElement bodyText= driver.findElement(By.cssSelector("div[aria-label='Message Body']"));
        final String emailBody = "Hello Testers!";
        bodyText.clear();
        bodyText.sendKeys(emailBody);
        //5.1 Add Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //6. Click Send
        WebElement sendButton= driver.findElement(By.cssSelector("div[aria-label*=\"Send\"]"));
        sendButton.click();
//      7. Click Inbox again
//        WebElement inboxButton= driver.findElement(By.cssSelector());
//        inboxButton.click();
//        //8. Click email
//        WebElement newEmail = driver.findElement(By.cssSelector());
//        newEmail.click();
//        //9. Verify the email subject and email body is correct
//        WebElement subjectText = driver.findElement(By.cssSelector());
//        Assert.assertEquals("Subject should match", subject, subjectText.getText());
//        WebElement bodyTextReceived = driver.findElement(By.cssSelector());
//        Assert.assertEquals("Subject should match", emailBody, bodyTextReceived.getText());
//        //10.Sign out
    }
}