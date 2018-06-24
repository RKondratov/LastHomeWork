package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class MarketSteps {
    @Step("Выбран тип товара {0}")
    public void stepSelectItemOnPanelWithTypeOfGoods(String good) {
        new MarketPage(BaseSteps.getDriver()).selectItemOnPanelWithTypeOfGoods(BaseSteps.getDriver(), good);
    }

    @Step("Выбран подтип товара {0}")
    public void stepSelectItemOnElPanel(String good) {
        new MarketPage(BaseSteps.getDriver()).selectItemOnElPanel(BaseSteps.getDriver(), good);
    }

}
