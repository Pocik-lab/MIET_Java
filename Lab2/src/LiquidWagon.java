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
public class LiquidWagon extends Wagon {
    
    private double liquid_amount;
    
    public void SetLiquidAmount(double liquid_amount_value)
    {
        this.liquid_amount = liquid_amount_value;
    }
    
    public double LiquidAmount()
    {   
        return liquid_amount;
    }
    
    public LiquidWagon (int num_v, double liq_a_v)
    {
        super(num_v);
        this.liquid_amount = liq_a_v;
    }
    
    @Override
    public String ToString()
    {
        return "Цистерны для жидкостей\nНомер вагона: " + super.GetNumber() + "\n" + "Объём жиддкости: " + liquid_amount + "\n";
    }
}