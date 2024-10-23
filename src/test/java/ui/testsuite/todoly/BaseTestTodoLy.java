package ui.testsuite.todoly;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ui.pages.todoly.LoginSection;
import ui.pages.todoly.MainPage;
import ui.pages.todoly.MenuSection;
import ui.pages.todoly.RegisterSection;
import ui.session.Session;

public class BaseTestTodoLy {

    protected MainPage mainPage = new MainPage();
    protected LoginSection loginSection = new LoginSection();
    protected MenuSection menuSection = new MenuSection();

    protected RegisterSection registerSection = new RegisterSection();


    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}