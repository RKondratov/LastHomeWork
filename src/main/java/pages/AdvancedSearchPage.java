package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class AdvancedSearchPage {
    static String text;

    @FindBy(xpath ="//*[@name='Цена от']")
    WebElement from;

    @FindBy(xpath="//fieldset[@data-autotest-id='7893318']")
    WebElement makers;

    @FindBy(xpath ="//*[text()='Перейти ко всем фильтрам']")
    WebElement goToAllFilters;

    @FindBy(xpath = "//span[@id ='market-search']//input[@id='header-search']")
    WebElement searcher;

    public AdvancedSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setFromPrice(String item){
        fillField(from, item);
    }

    public void chooseTVMaker(String maker){
       makers.findElement(By.xpath(".//*[text()='"+maker+"']")).click();
    }

    public void pushGoToAllFilters (){
        goToAllFilters.click();
    }


    public void countAndCheckModelsOnPage(){
        Object[]array = BaseSteps.getDriver().findElements(By.xpath("//*[contains(@data-id,'model')]")).toArray();
        int count = array.length;
        assertEquals(count, 48);
    }

    public void countAndCheckModelsOfhHeadphonesOnPage(){
        Object[]array = BaseSteps.getDriver().findElements(By.xpath("//*[contains(@data-id,'model')]")).toArray();
        int count = array.length;
        assertEquals(count, 21);
    }

    public void enterFirstElementOfTv(){
        List<WebElement> array = BaseSteps.getDriver().findElements(By.xpath("//*[contains(@data-id,'model')]"));
        text = array.get(0).findElement(By.xpath("//*[@class='n-snippet-card2__title']/a")).getAttribute("title");
        fillField(searcher,text);
        searcher.sendKeys(Keys.ENTER);
    }

    public void enterFirstElementOfHeadPhones(){
        List<WebElement> array = BaseSteps.getDriver().findElements(By.xpath("//*[contains(@data-id,'model')]"));
        text = array.get(0).findElement(By.xpath(".//*[@class='image']")).getAttribute("title");
        fillField(searcher,text);
        searcher.sendKeys(Keys.ENTER);
    }

    public void checkModelHeadPhone(){
        List<WebElement> array = BaseSteps.getDriver().findElements(By.xpath("//*[contains(@data-id,'model')]"));
        String findText = array.get(0).findElement(By.xpath(".//*[@class='image']")).getAttribute("title");
        Assert.assertEquals(AdvancedSearchPage.text, findText);
    }

    private void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}
