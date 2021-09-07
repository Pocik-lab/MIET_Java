/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.*; //Подключаем пакеты java.io
import java.util.*; //Подключаем пакеты java.util

/**
 *
 * @author aleksandrtegin
 */
public class Lab1 
{
/**
* C метода main начинается выполнение программы
* @param args аргументы командной сроки
*/   
    public static void main(String[] args)
    {
        System.out.println("Приступим к решению квадратного уравнения типа ax^2 + bx + c = 0 \n");
        
        
        /**
        * @param CorrectValuse переменная булевского типа для проверки корректного ввода данных
        * @param a коэффициент при x^2  
        * @param b коэффициент при x
        * @param c свободный член уравнения
        * @param diskr дискриминант квадратного уравнения
        * @param x1 первый корень квадратного уравнения 
        * @param x2 второй корень квадратного уравенния 
        */
        
        boolean CorrectValues;
        int a = 0;
        int b = 0;
        int c = 0;
        
        int diskr = 0;
        
        double x1 = 0;
        double x2 = 0;
        
        /**
        * В данном блоке проходит проверка на корректный ввод данных
        * @exception InputMismatchException При вводе данных неверного типа.
        * @see InputMismatchException
        */
        
        do
        {
            try 
            {
                CorrectValues = true;
                System.out.println("Введите коэфициенты a,b и c :");
                Scanner sc = new Scanner(System.in);
                System.out.println("a -> ");
                a = sc.nextInt();
                System.out.println("b -> ");
                b = sc.nextInt();
                System.out.println("c -> ");
                c = sc.nextInt();
            }
            catch (InputMismatchException e)
                    {
                        CorrectValues = false;
                        System.out.println("\nВводить необходимо только цифры! \nПопробуйте ещё раз\n");
                    }
        }
        while (!CorrectValues);
        
        // Вычисление дискриминанта 
        diskr = (b*b) - 4*(a*c);
        System.out.print("\nДискриминант D = " + diskr + "\n");
       
        // Блок if-else вычисления корней квадратных уравнений
        if (diskr < 0 || a == 0)
        {
            System.out.println("\nУ квадратного уравнения с данными коэффициентами нет корней");
        }
        else
        {
            System.out.println("\nКорни квадратного уравнения : \n");
            x1 = (-b  + Math.sqrt(diskr)) / (2*a); 
            x2 = (-b  - Math.sqrt(diskr)) / (2*a);
            System.out.println("x1 = " + x1 + " \t x2 = " + x2);
        }
    }
}
