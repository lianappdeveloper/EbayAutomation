import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

public class LoginElements extends ChromeDriverSetup {


    public class SignInPage {
        private By usernameBy = By.id("userid");
        private By passwordBy = By.id("pass");
        private By continueToPass = By.id("signin-continue-btn");
        private By confirmPass = By.id("sgnBt");


        /**
         * Login as valid user
         *
         * @param userName lianlevidev@gmail.com
         * @param password l9i9a9n9
         */
        public void login(String userName, String password) {


                driver.get("https://signin.ebay.com/signin/");
                if (driver.getCurrentUrl() != "https://signin.ebay.com/signin/" ) {
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    driver.get("https://signin.ebay.com/signin/");
                }

            try {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(usernameBy).sendKeys(userName);
                driver.findElement(continueToPass).click();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.findElement(passwordBy).sendKeys(password);
                driver.findElement(confirmPass).sendKeys(password);
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.findElement(By.id("signin-error-msg"));
            }

        }
    }
}
