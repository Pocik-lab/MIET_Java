package Lab3;

import java.util.*;

/** 
 * Класс спец функций на проверку типажей.
 * @author Тегин Александр
 * @version 1.0
*/
public class CheckFunctions {
    
    /**
     * Процедура проверки на int
     * @return number - корректный int
     */
    public static int IntCheck()
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
     * @return number - корректный double
     */
    public static double DoubleCheck()
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
     * @return s - корректный string
     */
    public static String StringCheck()
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
                    CorrectValues = false;
                    System.out.println("\nПопробуйте ещё раз\n");
                    sc.nextLine();
                }
        }
        while (!CorrectValues);
        
        return s;
    }
}
