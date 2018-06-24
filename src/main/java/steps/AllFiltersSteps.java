package steps;

import pages.AllFitersPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 24.06.2018.
 */
public class AllFiltersSteps {
    @Step("Нажали на кнопку {0}")
    public void stepPushButton() {
        new AllFitersPage(BaseSteps.getDriver()).pushButton();
    }
}
