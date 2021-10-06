/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import static Lab3.CheckFunctions.DoubleCheck;
import java.io.*;

/**
 *
 * @author aleksandrtegin
 */
public class LiquidWagon extends Wagon implements Serializable{
    
    private double liquid_amount;
    
    public void setLiquidAmount(double liquid_amount_value)
    {
        this.liquid_amount = liquid_amount_value;
    }
    
    public double getLiquidAmount()
    {   
        return liquid_amount;
    }
    
    protected LiquidWagon ()
    {
        super();
        System.out.println("\nВведите общий объём цистерн для жидкостей:\n");
        this.liquid_amount = DoubleCheck();
    }
    
    protected LiquidWagon (int num_v, double liq_a_v)
    {
        super(num_v);
        this.liquid_amount = liq_a_v;
    }
    
    @Override
    public String toString()
    {
        return "Цистерны для жидкостей\nНомер вагона: " + super.getNumber() + "\n" + "Объём жиддкости: " + liquid_amount + "\n";
    }
}
