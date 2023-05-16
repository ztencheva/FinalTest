import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPragmaticPage {

    @FindBy(xpath = "//*[@class='caret'] /..")
    private static WebElement myAccountButton;

    @FindBy(xpath = "//*[text()='Register']")
    private static WebElement registerButton;

    static {
        PageFactory.initElements(Browser.getDriver(),ShopPragmaticPage.class);
    }


    public static void goTo() {
        Browser.getDriver().get("http://shop.pragmatic.bg");
    }


    public static void clickOfMyAccountButton() {
        myAccountButton.click();
    }


    public static void clickOfRegistrationButton() {
        registerButton.click();
    }


}
