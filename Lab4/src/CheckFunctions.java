package lab4;

import java.util.*;

/** 
 * Класс спец функций на проверку типажей.
 * @author Тегин Александр
 * @version 1.0
 */
public class CheckFunctions {
    
    /**
     * Процедура проверки на int
     * @param myerr_v - лог, записывающий ошибки
     * @return number - корректный int
     */
    public static int IntCheck(ErrMsgLog myerr_v)
    {
        int number = 0;
        boolean CorrectValues;
        Scanner sc = new Scanner(System.in);
        
        /**
         * В данном блоке проходит проверка на корректный ввод данных
         * @exception InputMismatchException введен некорректный тип данных 
         */
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
                    myerr_v.addErrWithLog(e); //Добавляем ошибку в список и пишем в лог без отображения в консоли
                    myerr_v.showErrText(e); //Отображаем ошибку
                    CorrectValues = false;
                    System.out.println("\nПопробуйте ещё раз\n");
                    sc.nextLine();
                }
        }
        while (!CorrectValues);
        
        return number;
    }
    
    /**
     * Процедура проверки на double
     * @param myerr_v - лог, записывающий ошибки
     * @return number - корректный double
     */
    public static double DoubleCheck(ErrMsgLog myerr_v)
    {
        double number = 0;
        boolean CorrectValues;
        Scanner sc = new Scanner(System.in);
        
        /**
         * В данном блоке проходит проверка на корректный ввод данных
         * @exception InputMismatchException введен некорректный тип данных 
         */
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
                    myerr_v.addErrWithLog(e); //Добавляем ошибку в список и пишем в лог без отображения в консоли
                    myerr_v.showErrText(e); //Отображаем ошибку
                    CorrectValues = false;
                    System.out.println("\nПопробуйте ещё раз\n");
                    sc.nextLine();
                }
        }
        while (!CorrectValues);
        
        return number;
    }
    
    /**
     * Процедура проверки на string
     * @param myerr_v - лог, записывающий ошибки
     * @return s - корректный string
     */
    public static String StringCheck(ErrMsgLog myerr_v)
    {
        String s = "";
        boolean CorrectValues;
        Scanner sc = new Scanner(System.in);
        
        /**
         * В данном блоке проходит проверка на корректный ввод данных
         * @exception InputMismatchException введен некорректный тип данных 
         */
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
                    myerr_v.addErrWithLog(e); //Добавляем ошибку в список и пишем в лог без отображения в консоли
                    myerr_v.showErrText(e); //Отображаем ошибку
                    CorrectValues = false;
                    System.out.println("\nПопробуйте ещё раз\n");
                    sc.nextLine();
                }
        }
        while (!CorrectValues);
        
        return s;
    }
}

