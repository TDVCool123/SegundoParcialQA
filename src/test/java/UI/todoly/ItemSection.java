package UI.todoly;

import optimized.controls.Button;
import optimized.controls.Icon;
import optimized.controls.Label;
import optimized.controls.TextBox;
import org.openqa.selenium.By;

public class ItemSection {
    public TextBox itemtext = new TextBox(By.id("NewItemContentInput"));
    public Button addItemButton = new Button(By.id("NewItemAddButton"));
    public Icon menuItemIcon = new Icon(By.xpath("//img[@style=\"display: none;\"]"));
    public TextBox nameProjectEditTxtBox = new TextBox(By.xpath("//td[@class='ItemContent']//div//textarea[@id='ItemEditTextbox']"));
    public Icon editSave = new Icon(By.xpath("//td[@class='ItemContent']//div//div[@id=\"ItemEditDiv\"]//img[@id='ItemEditSubmit']"));

    public Label getItemLabel(String name){
        return new Label(By.xpath("//div[text()='"+name+"' and @class] "));
    }
    public void addItem(String text){
        itemtext.clearSetText(text);
        addItemButton.click();
    }
    public void editItem(String name,String text){
        getItemLabel(name).click();
        nameProjectEditTxtBox.clearSetText(text);
        editSave.click();
    }


}
