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
public class ProductBulkCargo extends Product {
    
    private String bulk_cargo_type;
    private double bulk_cargo_density;
    
    public void SetBulkCargoType(String bulk_cargo_value)
    {
        this.bulk_cargo_type = bulk_cargo_value;
    }
    
    public void SetBulkCargoDensity(double bulk_cargo_density_value)
    {   
        this.bulk_cargo_density = bulk_cargo_density_value;
    }
    
    public String GetBulkCargoType()
    {   
        return bulk_cargo_type;
    }
    
    public double GetBulkCargoDensity()
    {
        return bulk_cargo_density;
    }
    
    public ProductBulkCargo (int count_v,double prod_w_v, String bulc_t_v, double bulc_d_v)
    {
        super(count_v, prod_w_v);
        this.bulk_cargo_type = bulc_t_v;
        this.bulk_cargo_density = bulc_d_v;
    }
    
    @Override
    public String ToString()
    {
        return "Сыпучий груз\nКоличество товара: " + super.GetCount() + " Вес товара: " + super.GetProdWeight() + "\n" + "Тип сыпучего груза: " + bulk_cargo_type + " Вес груза (кг): " + bulk_cargo_density + "\n";
    }
}