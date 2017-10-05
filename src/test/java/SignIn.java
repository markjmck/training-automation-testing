import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SignIn {
    public void signIn(WebDriver driver) {
        //1. Enter email address
        WebElement usernameTextbox = driver.findElement(By.id("identifierId"));
        usernameTextbox.clear();
        usernameTextbox.sendKeys("automationtestingtraining12@gmail.com");
        //1.1 click next
        driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
        //1.2 Add a wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Fill in password
        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("testingPurposes");
        //2.1 Add await
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Click Sign in
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.RveJvd.snByac")));
        driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //4. Verify user did sign in
        Assert.assertTrue("Inbox should exist", driver.findElements(By.partialLinkText("Inbox")).size() > 0);
    }
}
