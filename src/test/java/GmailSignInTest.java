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
        usernameTextbox.sendKeys("markjmck3@gmail.com");
        //2.1 click next
        driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
        //2.2 Add a wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Fill in password
        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Bendunnegym321");
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
}