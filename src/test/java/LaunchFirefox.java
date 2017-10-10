import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
    @Test
    public void testFireFoxDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://gmail.com");
    }
}