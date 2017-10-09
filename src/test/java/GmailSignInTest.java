import org.junit.Test;
import org.openqa.selenium.WebDriver;

/** Created by Mark on 03/10/2017
 *
 */
public class GmailSignInTest {
    @Test
    public void gmailLoginShouldBeSuccessful() {
        //1. Go to Gmail Website
        LaunchGmail test = new LaunchGmail();
        WebDriver driver = test.launchWebsite();
        //2. Fill in details and sign in
        SignIn testingSignIn = new SignIn();
        testingSignIn.signIn(driver);
        //3. Sign out
        SignOut testingSignOut = new SignOut();
        testingSignOut.SignOut(driver);
        //4. Verify user did sign out
        VerifySignOut testVerifySigningOut = new VerifySignOut();
        testVerifySigningOut.verifySignOut(driver);
    }

    @Test
    public void gmailSendAndReceiveEmailTest(){
        //1. Launch Gmail and sign in
        LaunchGmail goToWebsite = new LaunchGmail();
        WebDriver driver = goToWebsite.launchWebsite();
        //2. Sign In and Verify
        SignIn signIn = new SignIn();
        signIn.signIn(driver);
        //3. Compose Email
        ComposeEmail compose = new ComposeEmail();
        compose.composeEmail(driver);
        //4. Click Inbox again
        ClickInbox inboxClick = new ClickInbox();
        inboxClick.clickInboxAgain(driver);
        //5. Click email
        ClickNewEmail clickEmail = new ClickNewEmail();
        clickEmail.clickEmail(driver);
        //6. Verify the email subject and email body is correct
        VerifySubAndBody verifyEmailSubAndBody = new VerifySubAndBody();
        verifyEmailSubAndBody.verify(driver);
        //7. Back To Inbox
        ClickInbox returnToInbox = new ClickInbox();
        returnToInbox.backToInbox(driver);
        //8.Sign out
        SignOut signOut = new SignOut();
        signOut.SignOut(driver);
        //9.Verify User Did Sign Out
        VerifySignOut verifySignOut = new VerifySignOut();
        verifySignOut.verifySignOut(driver);
    }
}