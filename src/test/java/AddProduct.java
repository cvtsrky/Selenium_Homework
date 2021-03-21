import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProduct extends PageObject
{

    @FindBy(id = "add-to-basket")
    private WebElement add_to_basket;
    @FindBy(css = "#add-to-basket")
    private WebElement addtobasket;
    @FindBy(xpath = "//*[@id=\"cart-item-464633180\"]/div[2]/div[4]/div/div[2]/select/option[2]")
    private WebElement add_item;
    @FindBy(xpath = "//body/div[@id='main-content']/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/a[1]")
    private WebElement delete_item;

    public AddProduct(WebDriver driver)
    {
        super(driver);
    }

    public void addToBasket()
    {
        this.add_to_basket.click();
    }
    public void addItem()
    {
        this.add_item.click();
    }
    public void deleteItem()
    {
        this.delete_item.click();
    }
}
