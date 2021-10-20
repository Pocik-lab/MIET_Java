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
 * Класс продукта со свойствами <b>serialVersionUID</b> и <b>special_id</b> и <b>prod_weight</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public abstract class Product implements Serializable 
{
    /** Поле ID для успешной серриализации */
    private static final long serialVersionUID = 2L;
    
     /** Поле ID */
    private int special_id;
     /** Поле вес продукта */
    private double prod_weight;
    
    /**
     * Процедура определения ID {@link Product#special_id}
     * @param special_id - ID
     */
    public void setSpecialID(int special_id_value)
    {
        this.special_id = special_id_value;
    }
    
    /**
     * Процедура определения веса продукта {@link Product#prod_weight}
     * @param prod_weight - вес продукта
     */
=======
/**
 *
 * @author aleksandrtegin
 */
public abstract class Product implements Serializable {
    
    private static final long serialVersionUID = 2L;
    
    private int count;
    private double prod_weight;
    
    public void setCount(int count_value)
    {
        this.count = count_value;
    }
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setProdWeight(double prod_weight_value)
    {   
        this.prod_weight = prod_weight_value;
    }
    
<<<<<<< HEAD
    /**
     * Функция получения значения поля {@link Product#special_id}
     * @return возвращает ID
     */
    public int getSpecialID()
    {   
        return special_id;
    }
    
    /**
     * Функция получения значения поля {@link Product#prod_weight}
     * @return возвращает вес товара
     */
=======
    public int getCount()
    {   
        return count;
    }
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public double getProdWeight()
    {
        return prod_weight;
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта
     * @see Product#Product(int, double)
     */
    protected Product ()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите ID товара:\n");
        special_id = IntCheck();
=======
    protected Product ()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите количество товара:\n");
        count = IntCheck();
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
        System.out.println("\nВведите вес товара:\n");
        prod_weight= DoubleCheck();
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param spec_id_v - ID продукта
     * @param prod_w_v - вес продукта
     * @see Product#Product()
     */
    protected Product (int spec_id_v, double prod_w_v)
    {
        this.special_id = spec_id_v;
        this.prod_weight = prod_w_v;
    }
    
    /**
     * Процедура словесного описания данного продукта
     * Абстрактный метод
     */
    @Override
    public abstract String toString();
}
=======
    protected Product (int count_v, double prod_w_v)
    {
        this.count = count_v;
        this.prod_weight = prod_w_v;
    }
    
    @Override
    public abstract String toString();
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
