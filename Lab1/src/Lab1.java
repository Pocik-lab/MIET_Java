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
  * Метод model принимает количсетво метров и сантиметров и вычисляет кол-во футов и дюймов
  * @param m_value колличество метров посчитанного в методе controller
  * @param sm_value колличество сантиметров посчитанного в методе controller
  */

	public static void model(double m_value)
	{

    /**
    * @param Result итоговая строка
    * @param valueOfsm общее количество сантиметров
    * @param sm колличество введенных сантиметров
    * @param m колличество введенных метров
    * @param ft колличество футов
    * @param dm колличество дюймов
    */
		String Result;

		double m = m_value;

		double valueOfsm = 0;

		double ft = 0;
		double dm = 0; 

		valueOfsm = (m * 100);

	    dm = valueOfsm / 2.54;

	    do 
	    {
	    	dm = dm - 12;
	    	ft++;
	    }
	    while ( (dm/12)  >= 1);   

	    Result = "\n Ft: " + ft + "\t Dm: " + dm + "\n";
	    view(Result);
	}

  /**
  * Метод view - выводит на устройство вывода строку
  * @param Result передаем строку для печати
  */
	public static void view(String Result) 
	{
		System.out.println(Result);
	}

  /**
  * Метод controller - получает данные из командной строки и проверяет их на корректность введенного типа данных  
  * @param args аргументы командной строки
  */

	public static void controller()
	{
     /**
    * @param CorrectValues аргумент булевского типа для проверки введенного значения на корректный тип
    * @param sm колличество введенных сантиметров
    * @param m колличество введенных метров
    */
    boolean CorrectValues;

        Scanner sc = new Scanner(System.in);
        String Result;

        double m = 0;

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
                view("Введите колличество м и см для перевода величины :");
                view("M -> ");
                m = sc.nextDouble();
            }
            catch (InputMismatchException e)
            {
                        CorrectValues = false;
                        view("\nВводить необходимо только цифры! \nПопробуйте ещё раз\n");
                        sc.nextLine();
            }
        }
            while (!CorrectValues);

        model(m);
  }

	public static void main(String[] args)
	{
	controller();
	}
}