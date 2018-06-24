package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Кондратов on 23.06.2018.
 */
public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    AdvancedSearchSteps advancedSearchSteps = new AdvancedSearchSteps();
    TVSteps tvSteps = new TVSteps();
    AllFiltersSteps allFiltersSteps = new AllFiltersSteps();

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectItemOnPanelWithItems(String item){
        mainSteps.stepSelectItemOnPanelWithItems(item);
    }
    @When("^выбран тип товара \"(.*)\"$")
    public void stepSelectItemOnPanelWithTypeOfGoods(String good){
        marketSteps.stepSelectItemOnPanelWithTypeOfGoods(good);
    }
    @When("^выбран подтип товара \"(.*)\"$")
    public void stepSelectItemOnElPanel(String good){
        marketSteps.stepSelectItemOnElPanel(good);
    }

    @When("^устанавлена минимальная цена \"(.*)\"$")
    public void stepSetFromPrice(String minPrice){
        advancedSearchSteps.stepSetFromPrice(minPrice);
    }

    @When("^выбраны производители:")
    public void stepChooseTVMaker(DataTable fields){
        fields.asList(String.class).forEach(
                (k) -> advancedSearchSteps.stepChooseTVMakers(k)
        );
    }

    @When("^нажали на кнопку фильтры")
    public void stepPushGoToAllFilters(){
        advancedSearchSteps.stepPushGoToAllFilters();
    }

    @When("^нажали на кнопку \"Показать подходящие\"")
    public void stepPushButton(){
        allFiltersSteps.stepPushButton();
    }

    @Then("^проверяем, что количество моделей телевизоров на странице равно 48")
    public void stepCountAndCheckModelsOnPage(){
        advancedSearchSteps.stepCountAndCheckModelsOnPage();
    }

    @Then("^проверяем, что количество моделей наушников на странице равно 21")
    public void stepCountAndCheckModelsOfhHeadphonesOnPage(){
        advancedSearchSteps.stepCountAndCheckModelsOfhHeadphonesOnPage();
    }

    @When("^ввели в поиск модель из первой позиции телевизора")
    public void stepEnterFirstElementOfTv(){
        advancedSearchSteps.stepEnterFirstElementOfTv();
    }

    @When("^ввели в поиск модель из первой позиции наушников")
    public void stepEnterFirstElementOfHeadPhones(){
        advancedSearchSteps.stepEnterFirstElementOfHeadPhones();
    }

    @Then("^проверяем, что модель ТВ соответсвует искомой")
    public void stepCheckModel(){
        tvSteps.stepCheckModel();
    }

    @Then("^проверяем, что модель наушников соответсвует искомой")
    public void stepCheckModelHeadPhone(){
        advancedSearchSteps.stepCheckModelHeadPhone();
    }

}
