import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifySignOut {
    public void verifySignOut(WebDriver driver) {
        WebUtil.waitForElementVisible(driver, By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
        Assert.assertTrue("Sign in button should exist", driver.findElements(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).size() > 0);
    }
}