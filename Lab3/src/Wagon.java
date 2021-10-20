package Lab3;

import java.io.*;
import static Lab3.CheckFunctions.*;

/** 
 * Класс вагона со свойствами <b>serialVersionUID</b> и <b>number</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public abstract class Wagon implements Serializable 
{
    /** Поле ID для успешной серриализации */
    private static final long serialVersionUID = 1L;

    /** Поле номера вагона */
    private int number;
    
    /**
     * Процедура определения номера вагона {@link Wagon#number}
     * @param number - номер вагона
     */
    public void setNumber(int number_value)
    {
        this.number = number_value;
    }
    
    /**
     * Функция получения значения поля {@link Wagon#number}
     * @return номер вагона
     */
    public int getNumber()
    {   
        return number;
    }
    
    /** 
     * Конструктор - создание нового объекта
     * @see Wagon#Wagon(int)
     */
    protected Wagon ()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите номер вагона\n");
        this.number = IntCheck();
    }
    
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @see Wagon#Wagon()
     */
    protected Wagon (int num_v)
    {
        this.number = num_v;
    }
    
    /**
     * Процедура словесного описания данного продукта
     * Абстрактный метод
     */
    @Override
    public abstract String toString();
}