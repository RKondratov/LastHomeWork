package steps;

import pages.TVPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class TVSteps {
    @Step("Проверяем, что модель телевизора соответсвует искомой")
    public void stepCheckModel() {
        new TVPage(BaseSteps.getDriver()).checkModel();
    }
}
