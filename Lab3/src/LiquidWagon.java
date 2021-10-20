<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
package Lab3;

import static Lab3.CheckFunctions.DoubleCheck;
import java.io.*;

<<<<<<< HEAD
/** 
 * Класс вагона с контейнерами со свойствами <b>container_count</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class LiquidWagon extends Wagon implements Serializable
{
    /** Поле объём жидкости */
    private double liquid_amount;
    
    /**
     * Процедура определения объёма жидкости {@link LiquidWagon#liquid_amount}
     * @param liquid_amount - объём жидкости
     */
=======
/**
 *
 * @author aleksandrtegin
 */
public class LiquidWagon extends Wagon implements Serializable{
    
    private double liquid_amount;
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setLiquidAmount(double liquid_amount_value)
    {
        this.liquid_amount = liquid_amount_value;
    }
    
<<<<<<< HEAD
    /**
     * Функция получения значения поля {@link LiquidWagon#liquid_amount}
     * @return возвращает объём жидкости
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public double getLiquidAmount()
    {   
        return liquid_amount;
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта
     * @see LiquidWagon#LiquidWagon(int, double)
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected LiquidWagon ()
    {
        super();
        System.out.println("\nВведите общий объём цистерн для жидкостей:\n");
        this.liquid_amount = DoubleCheck();
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @param liq_a_v - объём жидкости
     * @see LiquidWagon#LiquidWagon()
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected LiquidWagon (int num_v, double liq_a_v)
    {
        super(num_v);
        this.liquid_amount = liq_a_v;
    }
    
<<<<<<< HEAD
    /**
     * Процедура словесного описания данного типа вагона
     * @return возвращает словесное описание вагона
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    @Override
    public String toString()
    {
        return "Цистерны для жидкостей\nНомер вагона: " + super.getNumber() + "\n" + "Объём жиддкости: " + liquid_amount + "\n";
    }
}
