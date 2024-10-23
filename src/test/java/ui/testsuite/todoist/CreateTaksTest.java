package ui.testsuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ui.pages.todoist.CreateProjectSection;
import ui.pages.todoist.TasksSection;

public class CreateTaksTest extends BaseTestTodoist {
    TasksSection tasksSection = new TasksSection();
    CreateProjectSection createProjectSection = new CreateProjectSection();

    @Test
    public void verifyRegisterSuccessfully(){
        String taskName = "First Task";
        String projectName = "Luis Project";

        CreateProjectSection createProjectSection = new CreateProjectSection();

        //logguearse
        mainPage.loginButton.click();
        loginSection.login("luisandypp@gmail.com ","Qwerty12345");
        //crear proyecto
        leftMenuSection.createProjectIconButton.click();
        leftMenuSection.createProjectButton.click();
        createProjectSection.createProject(projectName);

        //crear task
        tasksSection.createTask(taskName);


        Assertions.assertEquals(taskName,tasksSection.getTaskLabel(taskName),
                "ERROR! the was was not created");
    }
}