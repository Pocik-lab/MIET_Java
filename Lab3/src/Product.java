package Lab3;

import static Lab3.CheckFunctions.*;
import java.io.*;

/** 
 * Класс продукта со свойствами <b>serialVersionUID</b> и <b>special_id</b> и <b>prod_weight</b>.
 * @author Тегин Александр
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
     * @param special_id_value - ID
     */
    public void setSpecialID(int special_id_value)
    {
        this.special_id = special_id_value;
    }
    
    /**
     * Процедура определения веса продукта {@link Product#prod_weight}
     * @param prod_weight_value - вес продукта
     */
    public void setProdWeight(double prod_weight_value)
    {   
        this.prod_weight = prod_weight_value;
    }
    
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
    public double getProdWeight()
    {
        return prod_weight;
    }

    /** 
     * Конструктор - создание нового объекта
     * @see Product#Product(int, double)
     */
    protected Product ()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите ID товара:\n");
        special_id = IntCheck();
        System.out.println("\nВведите вес товара:\n");
        prod_weight= DoubleCheck();
    }

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
     * Процедура текстового описания данного продукта
     * Абстрактный метод
     */
    @Override
    public abstract String toString();
}
