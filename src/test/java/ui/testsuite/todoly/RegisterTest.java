package ui.testsuite.todoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest extends BaseTestTodoLy{
    @Test
    public void verifyLoginSuccessfully(){
        mainPage.registerButton.click();
        registerSection.register("Luis","luis_todoly@123.com","12345");

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR! the login was failed");
    }
}