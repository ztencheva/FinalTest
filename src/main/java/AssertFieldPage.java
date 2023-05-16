import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertFieldPage {

    @FindBy(css = "[id=content] h1")
    private static WebElement assertInfoField;

    static {
        PageFactory.initElements(Browser.getDriver(), AssertFieldPage.class);
    }

    public static void AssertIfAccountIsCreated() {


    }
}
