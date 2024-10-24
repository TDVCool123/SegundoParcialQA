package ui.pages.todoist;

import ui.controls.Button;
import ui.controls.Label;
import org.openqa.selenium.By;

public class LeftMenuSection {
    public Button profileButton = new Button(By.id(":r0:"));

    public Button createProjectIconButton = new Button(By.id(":r1:"));

    public Button createProjectButton = new Button(By.xpath("//div[@role='menuitem']"));

    public Label getProjectLabel(String name){
        Label projectLabel = new Label(By.xpath("//span[text()='"+name+"']"));
        return projectLabel;
    }



}