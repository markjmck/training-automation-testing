import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SignOut {
    public void SignOut(WebDriver driver){
        WebElement profileButton = driver.findElement(By.cssSelector("span[class='gb_7a gbii']"));
        profileButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement signOutButton = driver.findElement(By.id("gb_71"));
        signOutButton.click();
    }
}
