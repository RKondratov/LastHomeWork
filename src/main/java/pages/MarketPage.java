package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by Кондратов on 23.06.2018.
 */
public class MarketPage {

    @FindBy(xpath ="//ul[@class='topmenu__list']")
    WebElement panelWithTypeOfGoods;

    @FindBy(xpath = "//*[@class='button2 button2_size_m button2_theme_action button2_width_max n-region-notification__actions-btn n-region-notification__ok']")
    WebElement regionYesButton;

    public MarketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectItemOnPanelWithTypeOfGoods (WebDriver driver, String item){
        regionYesButton.click();
        WebElement element = panelWithTypeOfGoods.findElement(By.xpath(".//*[@class='link topmenu__link'][text()='" + item + "']"));
        new Actions(driver).moveToElement(element).build().perform();
    }

    public void selectItemOnElPanel(WebDriver driver, String item){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='"+item+"'][@class='link topmenu__subitem']")))).click();
    }
}