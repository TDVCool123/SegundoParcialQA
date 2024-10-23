package ui.pages.todoist;

import ui.controls.Button;
import ui.controls.Label;
import ui.controls.TextBox;
import org.openqa.selenium.By;

public class TasksSection {
    public Button addNewTaskButton = new Button(By.xpath("//button[@type='button']//span[@class='icon_add']"));

    public TextBox taskNameTxtBox = new TextBox(By.xpath("//p[@data-placeholder='Nombre de la tarea']"));

    public Button addTaskButton = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"));

    public void createTask(String name){
        addNewTaskButton.click();
        taskNameTxtBox.setText(name);
        addTaskButton.click();
    }


    public String getTaskLabel(String name){
        Label taskNameLabel = new Label(By.xpath("//div[text()='"+name+"']"));
        return taskNameLabel.getText();
    }
}
