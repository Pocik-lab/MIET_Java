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
 * Класс продукта со свойствами <b>bulk_cargo_type</b> и <b>bulk_cargo_density</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class ProductBulkCargo extends Product implements Serializable
{
    /** Поле типа сыпучего груза */
    private String bulk_cargo_type;
    /** Поле плотности груза */
    private double bulk_cargo_density;
    
    /**
     * Процедура определения типа сыпучего груза {@link ProductBulkCargo#bulk_cargo_type}
     * @param bulk_cargo_type - тип сыпучего груза
     */
=======
/**
 *
 * @author aleksandrtegin
 */
public class ProductBulkCargo extends Product implements Serializable{
    
    private String bulk_cargo_type;
    private double bulk_cargo_density;
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setBulkCargoType(String bulk_cargo_value)
    {
        this.bulk_cargo_type = bulk_cargo_value;
    }
    
<<<<<<< HEAD
    /**
     * Процедура определения плотности груза {@link ProductBulkCargo#bulk_cargo_density}
     * @param bulk_cargo_density - плотность груза
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setBulkCargoDensity(double bulk_cargo_density_value)
    {   
        this.bulk_cargo_density = bulk_cargo_density_value;
    }
    
<<<<<<< HEAD
    /**
     * Функция получения значения поля {@link ProductBulkCargo#bulk_cargo_type}
     * @return возвращает тип сыпучего груза
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public String getBulkCargoType()
    {   
        return bulk_cargo_type;
    }
    
<<<<<<< HEAD
    /**
     * Функция получения значения поля {@link ProductBulkCargo#bulk_cargo_density}
     * @return возвращает плотность груза
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public double getBulkCargoDensity()
    {
        return bulk_cargo_density;
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта
     * @see ProductBulkCargo#ProductBulkCargo(int, double, String,  double)
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected ProductBulkCargo ()
    {
        super();
        System.out.println("\nВведите тип сыпучего груза:\n");
        bulk_cargo_type = StringCheck();
        System.out.println("\nВведите плотность материала:\n");
        bulk_cargo_density = DoubleCheck();
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param spec_id_v - ID продукта
     * @param prod_w_v - вес продукта
     * @param bulc_t_v - тип сыпучего груза
     * @param bulc_d_v - плотность груза
     * @see ProductBulkCargo#ProductBulkCargo()
     */
    protected ProductBulkCargo (int spec_id_v,double prod_w_v, String bulc_t_v, double bulc_d_v)
    {
        super(spec_id_v, prod_w_v);
=======
    protected ProductBulkCargo (int count_v,double prod_w_v, String bulc_t_v, double bulc_d_v)
    {
        super(count_v, prod_w_v);
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
        this.bulk_cargo_type = bulc_t_v;
        this.bulk_cargo_density = bulc_d_v;
    }
    
<<<<<<< HEAD
    /**
     * Процедура словесного описания данного продукта
     */
    @Override
    public String toString()
    {
        return "Сыпучий груз\nID товара: " + super.getSpecialID()+ " Вес товара: " + super.getProdWeight() + "\n" + "Тип сыпучего груза: " + bulk_cargo_type + " Вес груза (кг): " + bulk_cargo_density + "\n";
    }
}
=======
    @Override
    public String toString()
    {
        return "Сыпучий груз\nКоличество товара: " + super.getCount() + " Вес товара: " + super.getProdWeight() + "\n" + "Тип сыпучего груза: " + bulk_cargo_type + " Вес груза (кг): " + bulk_cargo_density + "\n";
    }
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
