<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
package Lab3;

import java.io.*;
import static Lab3.CheckFunctions.*;
<<<<<<< HEAD

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
=======
/**
 *
 * @author aleksandrtegin
 */
public abstract class Wagon implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int number;
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setNumber(int number_value)
    {
        this.number = number_value;
    }
    
<<<<<<< HEAD
    /**
     * Функция получения значения поля {@link Wagon#number}
     * @return номер вагона
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public int getNumber()
    {   
        return number;
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта
     * @see Wagon#Wagon(int)
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected Wagon ()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите номер вагона\n");
        this.number = IntCheck();
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @see Wagon#Wagon()
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected Wagon (int num_v)
    {
        this.number = num_v;
    }
    
<<<<<<< HEAD
    /**
     * Процедура словесного описания данного продукта
     * Абстрактный метод
     */
    @Override
    public abstract String toString();
}
=======
    @Override
    public abstract String toString();
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
