<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
package Lab3;

import java.util.*;

<<<<<<< HEAD
/** 
 * Класс спец функций на проверку типажей.
 * @autor Тегин Александр
 * @version 1.0
*/
public class CheckFunctions {
    
    /**
     * Процедура проверки на int
     * @return number - корректный int
     */
=======
/**
 *
 * @author aleksandrtegin
 */
public class CheckFunctions {
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public static int IntCheck()
    {
        int number = 0;
        boolean CorrectValues;
        Scanner sc = new Scanner(System.in);
        
<<<<<<< HEAD
        /**
         * В данном блоке проходит проверка на корректный ввод данных
         * @exception InputMismatchException введен некорректный тип данных 
         */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
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
    
<<<<<<< HEAD
    /**
     * Процедура проверки на double
     * @return number - корректный double
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public static double DoubleCheck()
    {
        double number = 0;
        boolean CorrectValues;
        Scanner sc = new Scanner(System.in);
        
<<<<<<< HEAD
        /**
         * В данном блоке проходит проверка на корректный ввод данных
         * @exception InputMismatchException введен некорректный тип данных 
         */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
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
    
<<<<<<< HEAD
    /**
     * Процедура проверки на string
     * @return number - корректный string
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public static String StringCheck()
    {
        String s = "";
        boolean CorrectValues;
        Scanner sc = new Scanner(System.in);
        
<<<<<<< HEAD
        /**
         * В данном блоке проходит проверка на корректный ввод данных
         * @exception InputMismatchException введен некорректный тип данных 
         */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
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
<<<<<<< HEAD
}
=======
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
