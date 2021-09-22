/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author aleksandrtegin
 */
public class ProductLiquid extends Product{
    
    private String liquid_type;
    private double liquid_liters;
    
    public void SetLiquidTupe(String liquid_type_value)
    {
        this.liquid_type = liquid_type_value;
    }
    
    public void SetLiquidLiters(double liquid_liters_value)
    {   
        this.liquid_liters = liquid_liters_value;
    }
    
    public String GetLiquidType()
    {   
        return liquid_type;
    }
    
    public double GetLiquidLiters()
    {
        return liquid_liters;
    }
    
    public ProductLiquid (int count_v,double prod_w_v, String liq_t_v, double liq_l_v)
    {
        super(count_v, prod_w_v);
        this.liquid_type = liq_t_v;
        this.liquid_liters = liq_l_v;
    }
    
    @Override
    public String ToString()
    {
        return "Жидкость\nКоличество товара: " + super.GetCount() + " Вес товара: " + super.GetProdWeight() + "\n" + "Тип жиджкости: " + liquid_type + " Количество литров: " + liquid_liters + "\n";
    }
}