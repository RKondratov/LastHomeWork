package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class TVPage {

    @FindBy(xpath ="//h1[@class ='title title_size_28 title_bold_yes']")
    WebElement nameOfModel;

    public TVPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkModel(){
        assertEquals(AdvancedSearchPage.text, nameOfModel.getText());
    }
}
