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
 * Класс продукта со свойствами <b>container_type</b> и <b>container_amount</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class ProductContainer extends Product implements Serializable
{
    /** Поле типа контейнера */
    private String container_type;
    /** Поле объема контейнера */
    private double container_amount;
    
    /**
     * Процедура определения типа контейнера {@link ProductContainerCargo#bulk_cargo_type}
     * @param bulk_cargo_type - тип контейнера
     */
=======
/**
 *
 * @author aleksandrtegin
 */
public class ProductContainer extends Product implements Serializable{
    
    private String container_type;
    private double container_amount;
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setContainerType(String container_type_value)
    {
        this.container_type = container_type_value;
    }
    
<<<<<<< HEAD
    /**
     * Процедура определения объёма контейнера {@link ProductContainerCargo#container_amount}
     * @param bulk_cargo_type - объем контейнера
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setContainerAmount(double container_amount_value)
    {   
        this.container_amount = container_amount_value;
    }
<<<<<<< HEAD
        
    /**
     * Функция получения значения поля {@link ProductContainer#container_type}
     * @return возвращает тип контейнера
     */
=======
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public String getContainerType()
    {   
        return container_type;
    }
<<<<<<< HEAD
        
    /**
     * Функция получения значения поля {@link ProductContainer#container_amount}
     * @return возвращает объем контейнера
     */
=======
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public double getContainerAmount()
    {
        return container_amount;
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта
     * @see ProductContainer#ProductContainer(int, double, String,  double)
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected ProductContainer ()
    {
        super();
        System.out.println("\nВведите тип контейнера:\n");
        container_type = StringCheck();
        System.out.println("\nВведите объём контейнеров:\n");
        container_amount = DoubleCheck();
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param spec_id_v - ID продукта
     * @param prod_w_v - вес продукта
     * @param container_type - тип контейнера
     * @param сontainer_amount - объем контейнера
     * @see ProductContainer#ProductContainer()
     */
    protected ProductContainer (int spec_id_v,double prod_w_v, String cont_t_v, double cont_a_v)
    {
        super(spec_id_v, prod_w_v);
=======
    protected ProductContainer (int count_v,double prod_w_v, String cont_t_v, double cont_a_v)
    {
        super(count_v, prod_w_v);
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
        this.container_type = cont_t_v;
        this.container_amount = cont_a_v;
    }

<<<<<<< HEAD
    /**
     * Процедура словесного описания данного продукта
     */
    @Override
    public String toString()
    {
        return "Контейнеры\nID товара: " + super.getSpecialID()+ " Вес товара: " + super.getProdWeight() + "\n" + "Тип контейнера: " + container_type + " Объём контейнеров: " + container_amount + "\n";
    }
}
=======
    @Override
    public String toString()
    {
        return "Контейнеры\nКоличество товара: " + super.getCount() + " Вес товара: " + super.getProdWeight() + "\n" + "Тип контейнера: " + container_type + " Объём контейнеров: " + container_amount + "\n";
    }
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
