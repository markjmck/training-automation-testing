import org.junit.Test;
import org.openqa.selenium.WebDriver;

/** Created by Mark on 03/10/2017
 *
 */
public class GmailSignInTest extends LaunchGmailAndSignIn {
    WebDriver driver;
    @Test
    public void gmailLoginShouldBeSuccessful() {
        //1. Launch gmail and sign in
        driver = launchAndSignIn();
        //2. Sign Out
        SignOut testingSignOut = new SignOut();
        testingSignOut.SignOut(driver);
        //3`. Verify user did sign out
        VerifySignOut testVerifySigningOut = new VerifySignOut();
        testVerifySigningOut.verifySignOut(driver);
    }

    @Test
    public void gmailSendAndReceiveEmailTest(){
        String[] emailArray = new String[2];
        //1. Launch Gmail and Sign In
        driver = launchAndSignIn();
        //2. Compose Email
        ComposeEmail compose = new ComposeEmail();
        emailArray = compose.composeEmail(driver);
        //3. Click Inbox again
        ClickInbox inboxClick = new ClickInbox();
        inboxClick.clickInboxAgain(driver);
        //4. Click email
        ClickNewEmail clickEmail = new ClickNewEmail();
        clickEmail.clickEmail(driver);
        //5. Verify the email subject and email body is correct
        VerifySubAndBody verifyEmailSubAndBody = new VerifySubAndBody();
        verifyEmailSubAndBody.verify(driver, emailArray);
        //6. Back To Inbox
        ClickInbox returnToInbox = new ClickInbox();
        returnToInbox.backToInbox(driver);
        //7.Sign out
        SignOut signOut = new SignOut();
        signOut.SignOut(driver);
        //8.Verify User Did Sign Out
        VerifySignOut verifySignOut = new VerifySignOut();
        verifySignOut.verifySignOut(driver);
    }
}