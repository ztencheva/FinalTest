import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    @FindBy(id = "input-firstname")
    private static WebElement firstNameInputFiled;

    @FindBy(id = "input-lastname")
    private static WebElement lastNameInputField;

    @FindBy(id = "input-email")
    private static WebElement emailInputField;

    @FindBy(id = "input-telephone")
    private static WebElement phoneNumberInputFiled;

    @FindBy(id = "input-password")
    private static WebElement passwordInputFiled;

    @FindBy(id = "input-confirm")
    private static WebElement confirmPasswordInputFiled;

    @FindBy(name = "agree")
    private static WebElement privacyPolicyBox;

    @FindBy(css = "[value='Continue']")
    private static WebElement continueButton;

    static {
        PageFactory.initElements(Browser.getDriver(), RegisterPage.class);
    }


    public static void writeInTheFirstnameInputField(String firstname) {

        firstNameInputFiled.sendKeys(firstname);
    }


    public static void writeInTheLastnameInputField(String lastname) {
        lastNameInputField.sendKeys(lastname);
    }


    public static void writeEmail(String randomMail) {
        emailInputField.sendKeys(randomMail);
    }


    public static void writePhoneNumber(String randomNumber) {
        phoneNumberInputFiled.sendKeys(randomNumber);
    }


    public static void writePassword(String pass) {
        passwordInputFiled.sendKeys(pass);
    }


    public static void confirmPassword(String pass) {
        confirmPasswordInputFiled.sendKeys(pass);
    }


    public static void checkPrivacyPolicyBox() {
        if(privacyPolicyBox.isSelected());
        privacyPolicyBox.click();
    }


    public static void clickOfTheContinueButton() {
        continueButton.click();
    }
}
