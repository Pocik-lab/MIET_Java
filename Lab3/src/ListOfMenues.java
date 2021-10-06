/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author aleksandrtegin
 */
public class ListOfMenues {
        
    public static void userMenu()
    {
        System.out.println("1 - Дополнить ж/д состав \n");
        System.out.println("2 - Сохранить ж/д состав \n");
        System.out.println("3 - Загрузка ж/д состава \n");
        System.out.println("4 - Печать ж/д состава \n");
        System.out.println("5 - Выход \n");
        System.out.println("\n-------------------------------\n");
    }
    
    public static void rootMenu()
    {
        System.out.println("1 - Дополнить ж/д состав \n");
        System.out.println("2 - Сохранить ж/д состав \n");
        System.out.println("3 - Загрузка ж/д состава \n");
        System.out.println("4 - Печать ж/д состава \n");
        System.out.println("5 - Выход \n");
        System.out.println("6 - Режим дебага \n");
        System.out.println("7 - Режим автотестов \n");
        System.out.println("\n-------------------------------\n");
    }
    
    public static void wagonLoadMenu()
    {
        System.out.println("1 - Платформа для контейнеров \n");
        System.out.println("2 - Цистерна для жидкостей \n");
        System.out.println("3 - Цистерна для сыпучих грузов \n");
        System.out.println("4 - Автомобильная платформа \n");
        System.out.println("\n-------------------------------\n");
    }
    
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
