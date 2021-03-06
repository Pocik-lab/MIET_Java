/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.*;

/**
 *
 * @author aleksandrtegin
 */
public class BulkCargoWagon extends Wagon{
   
    private double bulk_cargo_amount;
    
    public void SetLiquidType(double bulk_cargo_amount_value)
    {   
        this.bulk_cargo_amount = bulk_cargo_amount_value;
    }
        
    public BulkCargoWagon(int num_v, double bulc_a_v)
    {
        super(num_v);
        this.bulk_cargo_amount = bulc_a_v;
    }
    

    public String ToString()
    {
        return "Цистерны для сыпучего груза\nНомер вагона: " + super.GetNumber() + "\n" +"Объём сыпучего груза: " + bulk_cargo_amount + "\n";
    }
}