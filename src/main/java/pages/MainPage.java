package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class MainPage {

    @FindBy(xpath ="//div[@class='home-arrow__tabs']")
    WebElement panelWithItems;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectItemOnPanelWithItems(String item){
        panelWithItems.findElement(By.xpath(".//*[text() = '" + item + "']")).click();
    }
}
