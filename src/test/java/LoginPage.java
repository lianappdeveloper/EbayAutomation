
import org.testng.annotations.Test;


public class LoginPage extends LoginElements {
    SignInPage signInPage = new SignInPage();

    @Test
    public void Login() {

    signInPage.login("lianlevidev@gmail.com","l9i9a9n9");
    }
    @Test
    public void InvalidPassword() {
        signInPage.login("lianlevidev@gmail.com","1234");

    }
    @Test
    public void InvalidUsername() {
        signInPage.login("lianle3245videv@gmail.com","l9i9a9n9");
    }
    @Test
    public void InvalidUsernameAndPassword() {
        signInPage.login("lianle3245videv@gmail.com","l3249i9a9n9");
    }
}
