package Lab3;

import static Lab3.CheckFunctions.*;
import java.io.*;

/** 
 * Класс продукта со свойствами <b>liquid_type</b> и <b>liquid_liters</b>.
 * @author Тегин Александр
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
     * @param liquid_type_value - тип жиджкости
     */
    public void setLiquidTupe(String liquid_type_value)
    {
        this.liquid_type = liquid_type_value;
    }

    /**
     * Процедура определения объема жидкости  {@link ProductLiquid#liquid_liters}
     * @param liquid_liters_value - объем жидкости 
     */
    public void setLiquidLiters(double liquid_liters_value)
    {   
        this.liquid_liters = liquid_liters_value;
    }
    
    /**
     * Функция получения значения поля {@link ProductLiquid#container_type}
     * @return возвращает тип жиджкости
     */
    public String getLiquidType()
    {   
        return liquid_type;
    }
    
    /**
     * Функция получения значения поля {@link ProductLiquid#container_type}
     * @return возвращает объем жидкости 
     */
    public double getLiquidLiters()
    {
        return liquid_liters;
    }
    
    /** 
     * Конструктор - создание нового объекта
     * @see ProductLiquid#ProductLiquid(int, double, String,  double)
     */
    protected ProductLiquid ()
    {
        super();
        System.out.println("\nВведите тип жидксоти:\n");
        liquid_type = StringCheck();
        System.out.println("\nВведите кол-во литров:\n");
        liquid_liters = DoubleCheck();
    }

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
        this.liquid_type = liq_t_v;
        this.liquid_liters = liq_l_v;
    }

    /**
     * Процедура текстового описания данного продукта
     */
    @Override
    public String toString()
    {
        return "Жидкость\nID товара: " + super.getSpecialID()+ " Вес товара: " + super.getProdWeight() + "\n" + "Тип жиджкости: " + liquid_type + " Количество литров: " + liquid_liters + "\n";
    }
}
