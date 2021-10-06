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
public class BulkCargoWagon extends Wagon implements Serializable{
   
    private double bulk_cargo_amount;
    
    
    public void setLiquidType(double bulk_cargo_amount_value)
    {   
        this.bulk_cargo_amount = bulk_cargo_amount_value;
    }
    
    public double getLiquidType()
    {   
        return bulk_cargo_amount;
    }
    
    public BulkCargoWagon()
    {
        super();
        System.out.println("\nВведите общий объём цистерн для сыпучего груза:\n");
        this.bulk_cargo_amount = DoubleCheck();
    }
    
    public BulkCargoWagon(int num_v, double bulc_a_v)
    {
        super(num_v);
        this.bulk_cargo_amount = bulc_a_v;
    }

    @Override
    public String toString()
    {
        return "Цистерны для сыпучего груза\nНомер вагона: " + super.getNumber() + "\n" +"Объём сыпучего груза: " + bulk_cargo_amount + "\n";
    }
}
