package ui.testsuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ui.pages.todoist.LeftMenuSection;
import ui.pages.todoist.LoginSection;
import ui.pages.todoist.MainPage;
import ui.session.Session;

public class BaseTestTodoist {

    protected MainPage mainPage = new MainPage();
    protected LoginSection loginSection = new LoginSection();
    protected LeftMenuSection leftMenuSection = new LeftMenuSection();



    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://todoist.com/es");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}