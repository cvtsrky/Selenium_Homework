import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject
{
    private  String Search_Key = "bilgisayar";

    @FindBy(xpath = "//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input")
    private WebElement search_place;
    @FindBy(xpath = "//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button")
    private WebElement search_button;
    @FindBy(xpath = "//*[@id=\"item-info-block-666552516\"]/p/img")
    private WebElement select_product;

    public SearchPage(WebDriver driver)
    {
        super(driver);
    }

    public void enterSearchKey()
    {
        this.search_place.sendKeys(Search_Key);
    }
    public void pressSubmitButton()
    {
        this.search_button.click();
    }

    public void selectProduct()
    {
        this.select_product.click();
    }
}
