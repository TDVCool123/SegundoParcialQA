package ui.pages.todoly;

import org.openqa.selenium.By;
import ui.controls.Button;
import ui.controls.TextBox;

public class RegisterSection {
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public TextBox nameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public  Button agreeButton = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));

    public  Button registerButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));



    public void register(String name, String email, String pwd){
        this.nameTxtBox.setText(name);
        this.emailTxtBox.setText(email);
        this.pwdTxtBox.setText(pwd);
        this.agreeButton.click();
        this.registerButton.click();
    }
}