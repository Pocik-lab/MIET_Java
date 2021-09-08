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
        System.out.println("Приступим к переводу м и см в фут и дюймы \n");
        
        
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

        String temp;
        Scanner sc = new Scanner(System.in);
        String Result;

        double sm = 0;
        double m = 0;

        double valueOfsm = 0;

        double ft = 0;
        double dm = 0; 
        
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
                System.out.println("Введите колличество м и см для перевода величины :");
                System.out.println("M -> ");
                m = sc.nextDouble();
                System.out.println("Sm -> ");
                sm = sc.nextDouble();
            }
            catch (InputMismatchException e)
                    {
                        CorrectValues = false;
                        System.out.println("\nВводить необходимо только цифры! \nПопробуйте ещё раз\n");
                    }
        }
        while (!CorrectValues);

        valueOfsm = (m * 100) + sm;
        

        dm = valueOfsm / 2.54;
        
        do 
        {
        	dm = dm -12;
        	ft++;
        }
        while ( (dm/12)  >= 1);   

        Result = "\n Ft: " + ft + "\t Dm: " + dm + "\n";
        System.out.println(Result);
    }
}
