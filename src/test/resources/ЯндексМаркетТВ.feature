#language: ru
Функционал: Выбор оборудования в Яндекс.Маркете
  Сценарий: №1 "Телевизор"
    Когда выбран пункт меню "Маркет"
    И выбран тип товара "Электроника"
    И выбран подтип товара "Телевизоры"
    И устанавлена минимальная цена "20000"
    И выбраны производители:
    |Samsung|
    |LG|
    И нажали на кнопку фильтры
    И нажали на кнопку "Показать подходящие"
    Тогда проверяем, что количество моделей телевизоров на странице равно 48
    Когда ввели в поиск модель из первой позиции телевизора
    Тогда проверяем, что модель ТВ соответсвует искомой