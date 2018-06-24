package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class AllFitersPage {
    @FindBy(xpath ="//*[@class='button button_size_l button_theme_pseudo i-bem button_action_show-filtered n-filter-panel-extend__controll-button_size_big button_js_inited']")
    WebElement showButton;

    public AllFitersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void pushButton(){
        showButton.click();
    }


}
