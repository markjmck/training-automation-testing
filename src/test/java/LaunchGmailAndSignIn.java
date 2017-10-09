import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunchGmailAndSignIn {
    public static WebDriver launchAndSignIn(){
        //1. Go to Gmail Website
        LaunchGmail launch = new LaunchGmail();
        WebDriver driver = launch.launchWebsite();
        //2. Fill in details and sign in
        SignIn testingSignIn = new SignIn();
        testingSignIn.signIn(driver);
        return driver;
    }
}
