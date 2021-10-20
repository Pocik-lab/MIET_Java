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
 * Класс вагона с сыпучим грузом со свойствами <b>bulk_cargo_amount</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class BulkCargoWagon extends Wagon implements Serializable
{
    /** Поле объем сыпучего груза */
    private double bulk_cargo_amount;
    
    /**
     * Процедура определения объема сыпучего груза {@link BulkCargoWagon#bulk_cargo_amount}
     * @param bulk_cargo_amount - объем сыпучего груза
     */
    public void setBulkCargoAmount(double bulk_cargo_amount_value)
=======
/**
 *
 * @author aleksandrtegin
 */
public class BulkCargoWagon extends Wagon implements Serializable{
   
    private double bulk_cargo_amount;
    
    
    public void setLiquidType(double bulk_cargo_amount_value)
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    {   
        this.bulk_cargo_amount = bulk_cargo_amount_value;
    }
    
<<<<<<< HEAD
    /**
     * Функция получения значения поля {@link BulkCargoWagon#bulk_cargo_amount}
     * @return возвращает объем сыпучего груза
     */
    public double getBulkCargoAmount()
=======
    public double getLiquidType()
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    {   
        return bulk_cargo_amount;
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта
     * @see BulkCargoWagon#BulkCargoWagon(int, double)
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public BulkCargoWagon()
    {
        super();
        System.out.println("\nВведите общий объём цистерн для сыпучего груза:\n");
        this.bulk_cargo_amount = DoubleCheck();
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @param bulc_a_v - объем сыпучего груза
     * @see BulkCargoWagon#BulkCargoWagon()
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public BulkCargoWagon(int num_v, double bulc_a_v)
    {
        super(num_v);
        this.bulk_cargo_amount = bulc_a_v;
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
        return "Цистерны для сыпучего груза\nНомер вагона: " + super.getNumber() + "\n" +"Объём сыпучего груза: " + bulk_cargo_amount + "\n";
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
