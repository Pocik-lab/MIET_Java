/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.*;

/**
 *
 * @author aleksandrtegin
 */
public class CheckFunctions {
    
    public static int IntCheck()
    {
        int number = 0;
        boolean CorrectValues;
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
        boolean CorrectValues;
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
        boolean CorrectValues;
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
}
