package src;

import java.io.*; //Подключаем пакеты java.io
import java.util.*; //Подключаем пакеты java.util

/**
*
* @author Александр
* @version 0.0.1
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
        @exception InputMismatchException введен некорректный тип данных 
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
                        view("\nВводить необходимо только цифры! \nПопробуйте ещё раз\n");
                        sc.nextLine();
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
