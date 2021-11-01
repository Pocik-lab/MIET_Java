package Lab3;

import static Lab3.CheckFunctions.*;
import java.io.*;

/** 
 * Класс продукта со свойствами <b>bulk_cargo_type</b> и <b>bulk_cargo_density</b>.
 * @author Тегин Александр
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
     * @param bulk_cargo_value - тип сыпучего груза
     */
    public void setBulkCargoType(String bulk_cargo_value)
    {
        this.bulk_cargo_type = bulk_cargo_value;
    }

    /**
     * Процедура определения плотности груза {@link ProductBulkCargo#bulk_cargo_density}
     * @param bulk_cargo_density_value - плотность груза
     */
    public void setBulkCargoDensity(double bulk_cargo_density_value)
    {   
        this.bulk_cargo_density = bulk_cargo_density_value;
    }

    /**
     * Функция получения значения поля {@link ProductBulkCargo#bulk_cargo_type}
     * @return возвращает тип сыпучего груза
     */
    public String getBulkCargoType()
    {   
        return bulk_cargo_type;
    }

    /**
     * Функция получения значения поля {@link ProductBulkCargo#bulk_cargo_density}
     * @return возвращает плотность груза
     */
    public double getBulkCargoDensity()
    {
        return bulk_cargo_density;
    }

    /** 
     * Конструктор - создание нового объекта
     * @see ProductBulkCargo#ProductBulkCargo(int, double, String,  double)
     */
    protected ProductBulkCargo ()
    {
        super();
        System.out.println("\nВведите тип сыпучего груза:\n");
        bulk_cargo_type = StringCheck();
        System.out.println("\nВведите плотность материала:\n");
        bulk_cargo_density = DoubleCheck();
    }

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
        this.bulk_cargo_type = bulc_t_v;
        this.bulk_cargo_density = bulc_d_v;
    }

    /**
     * Процедура текстового описания данного продукта
     */
    @Override
    public String toString()
    {
        return "Сыпучий груз\nID товара: " + super.getSpecialID()+ " Вес товара: " + super.getProdWeight() + "\n" + "Тип сыпучего груза: " + bulk_cargo_type + " Вес груза (кг): " + bulk_cargo_density + "\n";
    }
}
