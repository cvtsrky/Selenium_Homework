import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.util.concurrent.TimeUnit.SECONDS;
public class TestPage
{
    public WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(200, SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest()
    {
        Log4j.startLog("Test  is Starting");
        driver.get(Utils.LOGIN_URL);
        LoginPage login = new LoginPage(driver);
        login.enterUserName();
        login.enterPassword();
        login.pressSubmitButton();
    }
    @Test
    public void searchTest()
    {
        Log4j.startLog("Test  is Starting");
        driver.get(Utils.BASE_URL);
        SearchPage searchPage = new SearchPage(driver);
        searchPage.enterSearchKey();
        searchPage.pressSubmitButton();
        driver.get(Utils.SEARCH_URL);
        searchPage.selectProduct();
    }
    @Test
    public void addsItem()
    {
        Log4j.startLog("Test  is Starting");
        driver.get(Utils.ADD_URL);
        AddProduct addProduct = new AddProduct(driver);
        addProduct.addToBasket();
        addProduct.addItem();
        addProduct.deleteItem();
    }

    @After
    public void cleanUp(){
        Log4j.endLog("Test is Ending");
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
