import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifySubAndBody {
    public void verify(WebDriver driver){
        WebElement subjectText = driver.findElement(By.cssSelector("h2[class='hP']"));
        Assert.assertEquals("Subject should match", "Test Sending Email", subjectText.getText());
        WebElement bodyTextReceived = driver.findElement(By.cssSelector("div[class='nH aHU'] div[dir='ltr'"));
        Assert.assertEquals("Subject should match", "Hello Testers!", bodyTextReceived.getText());
    }

}
