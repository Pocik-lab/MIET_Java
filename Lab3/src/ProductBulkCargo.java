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
public class ProductBulkCargo extends Product implements Serializable{
    
    private String bulk_cargo_type;
    private double bulk_cargo_density;
    
    public void setBulkCargoType(String bulk_cargo_value)
    {
        this.bulk_cargo_type = bulk_cargo_value;
    }
    
    public void setBulkCargoDensity(double bulk_cargo_density_value)
    {   
        this.bulk_cargo_density = bulk_cargo_density_value;
    }
    
    public String getBulkCargoType()
    {   
        return bulk_cargo_type;
    }
    
    public double getBulkCargoDensity()
    {
        return bulk_cargo_density;
    }
    
    protected ProductBulkCargo ()
    {
        super();
        System.out.println("\nВведите тип сыпучего груза:\n");
        bulk_cargo_type = StringCheck();
        System.out.println("\nВведите плотность материала:\n");
        bulk_cargo_density = DoubleCheck();
    }
    
    protected ProductBulkCargo (int count_v,double prod_w_v, String bulc_t_v, double bulc_d_v)
    {
        super(count_v, prod_w_v);
        this.bulk_cargo_type = bulc_t_v;
        this.bulk_cargo_density = bulc_d_v;
    }
    
    @Override
    public String toString()
    {
        return "Сыпучий груз\nКоличество товара: " + super.getCount() + " Вес товара: " + super.getProdWeight() + "\n" + "Тип сыпучего груза: " + bulk_cargo_type + " Вес груза (кг): " + bulk_cargo_density + "\n";
    }
}
