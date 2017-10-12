import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifySubAndBody {
    public void verify(WebDriver driver, String[] emailArray){
        WebElement subjectText = driver.findElement(By.cssSelector("h2[class='hP']"));
        Assert.assertEquals("Subject should match", emailArray[0], subjectText.getText());
        WebElement bodyTextReceived = driver.findElement(By.cssSelector("div[class='nH aHU'] div[dir='ltr'"));
        Assert.assertEquals("Subject should match", emailArray[1], bodyTextReceived.getText());
    }
}
