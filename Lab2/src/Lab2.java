/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.io.*;
import java.util.*;
/**
 *
 * @author aleksandrtegin
 */
public class Lab2 {
    /**
     * @param args the command line arguments
     */
    
    public static int IntCheck()
    {
        int number = 0;
        boolean CorrectValues = true;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            try 
            {
                CorrectValues = true;
                System.out.println("Введите целое число: ");
                number = sc.nextInt();
            }
            catch (InputMismatchException e)
                {
                    CorrectValues = false;
                    System.out.println("\nПопробуйте ещё раз\n");
                    sc.nextLine();
                }
        }
        while (!CorrectValues);
        
        return number;
    }
    
    public static double DoubleCheck()
    {
        double number = 0;
        boolean CorrectValues = true;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            try 
            {
                CorrectValues = true;
                System.out.println("Введите число с плавающей точкой: ");
                number = sc.nextDouble();
            }
            catch (InputMismatchException e)
                {
                    CorrectValues = false;
                    System.out.println("\nПопробуйте ещё раз\n");
                    sc.nextLine();
                }
        }
        while (!CorrectValues);
        
        return number;
    }
    
    public static String StringCheck()
    {
        String s = "";
        boolean CorrectValues = true;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            try 
            {
                CorrectValues = true;
                System.out.println("Введите строку: ");
                s = sc.next();
            }
            catch (InputMismatchException e)
                {
                    CorrectValues = false;
                    System.out.println("\nПопробуйте ещё раз\n");
                    sc.nextLine();
                }
        }
        while (!CorrectValues);
        
        return s;
    }
            
    public static void main(String args[]) {
        
        int global_count = -1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите количество вагонов и продуктов: ");
        
        do
        {
            global_count = IntCheck();
        }
        while (global_count <= 0 || global_count >= 20);
        
        Wagon[] wag = new Wagon[global_count];
        System.out.println("\n-------------------------------\n");
        System.out.println("\nЗаполним список вагонов: ");
        
        for (int i = 0; i < global_count; i++)
        {
            int case_num = -1;
            System.out.println("\n-------------------------------\n");
            System.out.println("\nКакого типа вагон " + (i+1) + "?\n");
            System.out.println("1 - Платформа для контейнеров \n");
            System.out.println("2 - Цистерна для жидкостей \n");
            System.out.println("3 - Цистерна для сыпучих грузов \n");
            System.out.println("4 - Автомобильная платформа \n");
            System.out.println("\n-------------------------------\n");
            
            do
            {
                case_num = IntCheck();
            }
            while (case_num <= 0 || case_num > 4);
            
            int num_num = 0;
            double dub_dub = 0;
                                            
            switch(case_num)
            {
                case 1:
                {
                    System.out.println("\n-------------------------------\n");
                    System.out.println("Введите количетсво контейнеров\n");
                    num_num = IntCheck();
                    wag[i] = new ContainerWagon(i+1, num_num);
                    break;
                }
                case 2:
                {
                    System.out.println("\n-------------------------------\n");
                    System.out.println("\nВведите общий объём цистерн для жидкостей:\n");
                    dub_dub = DoubleCheck();
                    wag[i] = new LiquidWagon(i+1, dub_dub);
                    break;
                }
                case 3:
                {
                    System.out.println("\n-------------------------------\n");
                    System.out.println("\nВведите общий объём цистерн для сыпучего груза:\n");
                    dub_dub = DoubleCheck();
                    wag[i] = new BulkCargoWagon(i+1, dub_dub);
                    break;
                }
                case 4:
                {
                    System.out.println("\n-------------------------------\n");
                    System.out.println("Введите допустимое для платформы кол-во машин:\n");
                    num_num = IntCheck();
                    wag[i] = new CarWagon(i+1, num_num);
                    break;
                }
            }
        }  
        
        System.out.println("\n-------------------------------\n");
        Train rzd_train = new Train("РЖД Грузовой", global_count, wag);
        System.out.println("\nСписок вагонов ж/д состава:\n");
        rzd_train.ListToString();
        System.out.println("\n-------------------------------\n");
        
        
        Product[] prod = new Product[global_count];
        System.out.println("Заполним список продукции: ");
        for (int i = 0; i < global_count; i++)
        {
            int case_num = -1;
            System.out.println("\n-------------------------------\n");
            System.out.println("\nКакого типа продукция? \n");
            System.out.println("1 - Контейнеры\n");
            System.out.println("2 - Жидкости \n");
            System.out.println("3 - Сыпучие грузы \n");
            System.out.println("4 - Автомобили \n");
            System.out.println("\n-------------------------------\n");
            
            do
            {
                case_num = IntCheck();
            }
            while (case_num <= 0 || case_num > 4);
            
            int num_num = 0;
            double dub_dub = 0.00;
            double dub_dub_dub = 0.00;
            String s_s = "";
            
            switch(case_num)
            {
                case 1:
                {
                    System.out.println("\n-------------------------------\n");
                    System.out.println("Введите количество товара:\n");
                    num_num = IntCheck();
                    System.out.println("\nВведите вес товара:\n");
                    dub_dub = DoubleCheck();
                    System.out.println("\nВведите тип контейнера:\n");
                    s_s = StringCheck();
                    System.out.println("\nВведите объём контейнеров:\n");
                    dub_dub_dub = DoubleCheck();
                    
                    prod[i] = new ProductContainer(num_num, dub_dub, s_s, dub_dub_dub);
                    break;
                }
                case 2:
                {
                    System.out.println("\n-------------------------------\n");
                    System.out.println("Введите количество товара:\n");
                    num_num = IntCheck();
                    System.out.println("\nВведите вес товара:\n");
                    dub_dub = DoubleCheck();
                    System.out.println("\nВведите тип жидксоти:\n");
                    s_s = StringCheck();
                    System.out.println("\nВведите кол-во литров:\n");
                    dub_dub_dub = DoubleCheck();
                    
                    prod[i] = new ProductLiquid(num_num, dub_dub, s_s, dub_dub_dub);
                    break;
                }
                case 3:
                {
                    System.out.println("\n-------------------------------\n");
                    System.out.println("Введите количество товара:\n");
                    num_num = IntCheck();
                    System.out.println("\nВведите вес товара:\n");
                    dub_dub = DoubleCheck();
                    System.out.println("\nВведите тип сыпучего груза:\n");
                    s_s = StringCheck();
                    System.out.println("\nВведите плотность материала:\n");
                    dub_dub_dub = DoubleCheck();
                    
                    prod[i] = new ProductBulkCargo(num_num, dub_dub, s_s, dub_dub_dub);
                    break;
                }
                case 4:
                {
                    String s_s_s = "";
                    int num_num_num = 0;
                    
                    System.out.println("\n-------------------------------\n");
                    System.out.println("Введите количество товара:\n");
                    num_num = IntCheck();
                    System.out.println("\nВведите вес товара:\n");
                    dub_dub = DoubleCheck();
                    System.out.println("\nВведите тип машины:\n");
                    s_s = StringCheck();
                    System.out.println("\nВведите название машины:\n");
                    s_s_s = StringCheck();
                    System.out.println("\nВведите цену машины (в рублях):\n");
                    num_num_num = IntCheck();
                    
                    prod[i] = new ProductCar(num_num, dub_dub, s_s, s_s_s, num_num_num);
                    break;
                }
            }
        }
        
        System.out.println("\n-------------------------------\n");
        Storage rzd_strg = new Storage("ул. Пушкина д. Колотушкина 29", 5425.75, prod);
        System.out.println("\nСписок продукции на складе:\n");
        System.out.println("\n-------------------------------\n");
        rzd_strg.ListToString();
        System.out.println("\n-------------------------------\n");
        
        rzd_train.SetWagonAndProduct(wag, prod);
        rzd_train.WagonAndProductToString();
    }
}