package ui.pages.todoist;

import ui.controls.Button;
import ui.controls.TextBox;
import org.openqa.selenium.By;

public class RegisterSection {
    public TextBox email = new TextBox(By.id("element-4"));
    public TextBox pass = new TextBox(By.id("element-6"));

    public Button registerButton = new Button(By.xpath("//span[text()='Registrarme con mi email']"));


}