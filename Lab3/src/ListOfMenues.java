package Lab3;

/** 
 * Класс вариаций меню.
 * @autor Тегин Александр
 * @version 1.0
*/
public class ListOfMenues {
        
    /**
     * Меню для user
     */
    public static void userMenu()
    {
        System.out.println("1 - Дополнить ж/д состав \n");
        System.out.println("2 - Сохранить ж/д состав \n");
        System.out.println("3 - Загрузка ж/д состава \n");
        System.out.println("4 - Печать ж/д состава \n");
        System.out.println("5 - Изменение объектов в ж/д составе \n");
        System.out.println("6 - Удаление объектов в ж/д составе \n");
        System.out.println("7 - Выход \n");
        System.out.println("\n-------------------------------\n");
    }
    
    /**
     * Меню для root
     */
    public static void rootMenu()
    {
        System.out.println("1 - Дополнить ж/д состав \n");
        System.out.println("2 - Сохранить ж/д состав \n");
        System.out.println("3 - Загрузка ж/д состава \n");
        System.out.println("4 - Печать ж/д состава \n");
        System.out.println("5 - Изменение объектов в ж/д составе \n");
        System.out.println("6 - Удаление объектов в ж/д составе \n");
        System.out.println("7 - Выход \n");
        System.out.println("8 - Режим дебага \n");
        System.out.println("9 - Режим автотестов \n");
        System.out.println("\n-------------------------------\n");
    }
    
    /**
     * Меню для загрузки вагонов
     */
    public static void wagonLoadMenu()
    {
        System.out.println("1 - Платформа для контейнеров \n");
        System.out.println("2 - Цистерна для жидкостей \n");
        System.out.println("3 - Цистерна для сыпучих грузов \n");
        System.out.println("4 - Автомобильная платформа \n");
        System.out.println("\n-------------------------------\n");
    }
    
     /**
     * Меню для загрузки продуктов
     */
    public static void productLoadMenu()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("\nКакого типа продукция? \n");
        System.out.println("1 - Контейнеры\n");
        System.out.println("2 - Жидкости \n");
        System.out.println("3 - Сыпучие грузы \n");
        System.out.println("4 - Автомобили \n");
        System.out.println("\n-------------------------------\n");
    }
}