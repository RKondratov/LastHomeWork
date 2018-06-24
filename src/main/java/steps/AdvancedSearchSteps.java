package steps;


import pages.AdvancedSearchPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class AdvancedSearchSteps {
    @Step("Устанавливаем минимальную цену {0}")
    public void stepSetFromPrice(String minPrice) {
        new AdvancedSearchPage(BaseSteps.getDriver()).setFromPrice(minPrice);
    }

    @Step("Выбираем производителя {0}")
    public void stepChooseTVMakers (String maker) {
        new AdvancedSearchPage(BaseSteps.getDriver()).chooseTVMaker(maker);
    }

    @Step("Нажимаем на кнопку фильтры")
    public void stepPushGoToAllFilters() {
        new AdvancedSearchPage(BaseSteps.getDriver()).pushGoToAllFilters();
    }

    @Step("Проверяем, что количество моделей телевизоров на странице равно 48")
     public void stepCountAndCheckModelsOnPage() {
        new AdvancedSearchPage(BaseSteps.getDriver()).countAndCheckModelsOnPage();
    }

    @Step("Проверяем, что количество моделей наушников на странице равно 21")
    public void stepCountAndCheckModelsOfhHeadphonesOnPage() {
        new AdvancedSearchPage(BaseSteps.getDriver()).countAndCheckModelsOfhHeadphonesOnPage();
    }

    @Step("Вводим в поиск модель первой позиции телевизора")
    public void stepEnterFirstElementOfTv() {
        new AdvancedSearchPage(BaseSteps.getDriver()).enterFirstElementOfTv();
    }

    @Step("Вводим в поиск модель первой позиции наушников")
     public void stepEnterFirstElementOfHeadPhones() {
        new AdvancedSearchPage(BaseSteps.getDriver()).enterFirstElementOfHeadPhones();
    }

    @Step("Проверяем, что модель наушников соответсвует искомой")
    public void stepCheckModelHeadPhone() {
        new AdvancedSearchPage(BaseSteps.getDriver()).checkModelHeadPhone();
    }


}
