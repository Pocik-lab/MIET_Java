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
public class Storage {
    
    private String storage_adress;
    private double storage_area;
    private Product[] product_list = new Product [100];
    
    public void SetStorageAdress (String storage_adress_value)
    {
        this.storage_adress = storage_adress_value;
    }
    
    public void SetStorageArea (double storage_area_value)
    {
        this.storage_area = storage_area_value;
    }
    
    public void SetProductList (Product[] product_list_value)
    {
        for (int i = 0; i < product_list_value.length; i++)
            this.product_list [i] = product_list_value[i];
    }
    
    public String GetStorageAdress ()
    {
        return storage_adress;
    }
    
    public double GetStorageArea ()
    {
        return storage_area;
    }
    
    public Product[] GetProductList ()
    {
        return product_list;
    }
    
    protected Storage (String strg_ad_v, double strg_a_v, Product[] prod_l_v)
    {
        this.storage_adress = strg_ad_v;
        this.storage_area = strg_a_v;
        this.product_list = prod_l_v;
    }
    
    public void ListToString ()
    {
        System.out.println(this.ToString());
        for (int i = 0; i < this.product_list.length; i++)
            System.out.println(product_list[i].ToString());
    }
    
    public String ToString()
    {
        return "\nАдресс склада: " + storage_adress + " Площадь склада: " + storage_area + "\n";
    }
}