package steps;

import org.openqa.selenium.WebDriver;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class MainSteps {
    @Step("Выбран пункт меню {0}")
    public void stepSelectItemOnPanelWithItems(String item) {
        new MainPage(BaseSteps.getDriver()).selectItemOnPanelWithItems(item);
    }
}
