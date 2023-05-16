import org.testng.annotations.Test;

public class PragmaticPageTest {

    @Test
    public void titlePageManipulation(){
        ShopPragmaticPage.goTo();
        ShopPragmaticPage.clickOfMyAccountButton();
        ShopPragmaticPage.clickOfRegistrationButton();
    }

    public void writeInRegisterAccountPage(){
        RegisterPage.writeInTheFirstnameInputField("Zornitsa");
        RegisterPage.writeInTheLastnameInputField("Ivanova");
        RegisterPage.writeEmail("webtest@pragmatic.bg");
        RegisterPage.writePhoneNumber("0888111222");
        RegisterPage.writePassword("password123");
        RegisterPage.confirmPassword("password123");
        RegisterPage.checkPrivacyPolicyBox();
        RegisterPage.clickOfTheContinueButton();
    }

    public void checkWithAssert(){
        AssertFieldPage.AssertIfAccountIsCreated();
    }
}
