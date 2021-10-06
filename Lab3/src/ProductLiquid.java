/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import static Lab3.CheckFunctions.*;
import java.io.*;

/**
 *
 * @author aleksandrtegin
 */
public class ProductLiquid extends Product implements Serializable{
    
    private String liquid_type;
    private double liquid_liters;
    
    public void setLiquidTupe(String liquid_type_value)
    {
        this.liquid_type = liquid_type_value;
    }
    
    public void setLiquidLiters(double liquid_liters_value)
    {   
        this.liquid_liters = liquid_liters_value;
    }
    
    public String getLiquidType()
    {   
        return liquid_type;
    }
    
    public double getLiquidLiters()
    {
        return liquid_liters;
    }
    
    protected ProductLiquid ()
    {
        super();
        System.out.println("\nВведите тип жидксоти:\n");
        liquid_type = StringCheck();
        System.out.println("\nВведите кол-во литров:\n");
        liquid_liters = DoubleCheck();
    }
    
    protected ProductLiquid (int count_v,double prod_w_v, String liq_t_v, double liq_l_v)
    {
        super(count_v, prod_w_v);
        this.liquid_type = liq_t_v;
        this.liquid_liters = liq_l_v;
    }
    
    @Override
    public String toString()
    {
        return "Жидкость\nКоличество товара: " + super.getCount() + " Вес товара: " + super.getProdWeight() + "\n" + "Тип жиджкости: " + liquid_type + " Количество литров: " + liquid_liters + "\n";
    }
}
