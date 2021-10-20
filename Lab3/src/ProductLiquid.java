<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
package Lab3;

import static Lab3.CheckFunctions.*;
import java.io.*;

<<<<<<< HEAD
/** 
 * Класс продукта со свойствами <b>liquid_type</b> и <b>liquid_liters</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class ProductLiquid extends Product implements Serializable
{    
    /** Поле типа жиджкости */
    private String liquid_type;
    /** Поле объема жидкости */
    private double liquid_liters;
    
    /**
     * Процедура определения типа жиджкости {@link ProductLiquid#liquid_type}
     * @param liquid_type - тип жиджкости
     */
=======
/**
 *
 * @author aleksandrtegin
 */
public class ProductLiquid extends Product implements Serializable{
    
    private String liquid_type;
    private double liquid_liters;
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setLiquidTupe(String liquid_type_value)
    {
        this.liquid_type = liquid_type_value;
    }
    
<<<<<<< HEAD
        /**
     * Процедура определения объема жидкости  {@link ProductLiquid#liquid_liters}
     * @param liquid_liters - объем жидкости 
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setLiquidLiters(double liquid_liters_value)
    {   
        this.liquid_liters = liquid_liters_value;
    }
    
<<<<<<< HEAD
    /**
     * Функция получения значения поля {@link ProductLiquid#container_type}
     * @return возвращает тип жиджкости
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public String getLiquidType()
    {   
        return liquid_type;
    }
    
<<<<<<< HEAD
        /**
     * Функция получения значения поля {@link ProductLiquid#container_type}
     * @return возвращает объем жидкости 
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public double getLiquidLiters()
    {
        return liquid_liters;
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта
     * @see ProductLiquid#ProductLiquid(int, double, String,  double)
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected ProductLiquid ()
    {
        super();
        System.out.println("\nВведите тип жидксоти:\n");
        liquid_type = StringCheck();
        System.out.println("\nВведите кол-во литров:\n");
        liquid_liters = DoubleCheck();
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param spec_id_v - ID продукта
     * @param prod_w_v - вес продукта
     * @param liquid_type - тип жиджкости
     * @param liquid_liters - объем жидкости 
     * @see ProductLiquid#ProductLiquid()
     */
    protected ProductLiquid (int spec_id_v,double prod_w_v, String liq_t_v, double liq_l_v)
    {
        super(spec_id_v, prod_w_v);
=======
    protected ProductLiquid (int count_v,double prod_w_v, String liq_t_v, double liq_l_v)
    {
        super(count_v, prod_w_v);
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
        this.liquid_type = liq_t_v;
        this.liquid_liters = liq_l_v;
    }
    
<<<<<<< HEAD
    /**
     * Процедура словесного описания данного продукта
     */
    @Override
    public String toString()
    {
        return "Жидкость\nID товара: " + super.getSpecialID()+ " Вес товара: " + super.getProdWeight() + "\n" + "Тип жиджкости: " + liquid_type + " Количество литров: " + liquid_liters + "\n";
    }
}
=======
    @Override
    public String toString()
    {
        return "Жидкость\nКоличество товара: " + super.getCount() + " Вес товара: " + super.getProdWeight() + "\n" + "Тип жиджкости: " + liquid_type + " Количество литров: " + liquid_liters + "\n";
    }
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
