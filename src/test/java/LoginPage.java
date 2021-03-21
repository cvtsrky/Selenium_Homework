import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject
{
    private final String USER_NAME = "User_Name";
    private final String PASSWORD = "Password";

    @FindBy(id = "L-UserNameField")
    private WebElement user_name;

    @FindBy(id = "L-PasswordField")
    private WebElement password;

    @FindBy(id = "gg-login-enter")
    private WebElement login_button;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(){
        this.user_name.sendKeys(USER_NAME);
    }

    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void pressSubmitButton(){
        this.login_button.click();
    }
}
