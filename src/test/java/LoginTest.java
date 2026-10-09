import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("LoginTest class started");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Preparing for login test");
    }

    @Test
    public void validLoginTest() {
        String username = "admin";
        String password = "admin123";

        boolean loginSuccessful =
                username.equals("admin")
                && password.equals("admin123");

        Assert.assertTrue(
                loginSuccessful,
                "Valid login should succeed"
        );
    }

    @Test
    public void invalidLoginTest() {
        String username = "admin";
        String password = "wrong";

        boolean loginSuccessful =
                username.equals("admin")
                && password.equals("admin123");

        Assert.assertFalse(
                loginSuccessful,
                "Invalid password should not log in"
        );
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Login test completed");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("LoginTest class finished");
    }
}