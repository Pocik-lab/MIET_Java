 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.*;
import java.io.*;
/**
 *
 * @author aleksandrtegin
 */

public class Storage implements Serializable{
    
    private String storage_adress;
    private double storage_area;
    private Product[] product_list = new Product [100];
    
    public void setStorageAdress (String storage_adress_value)
    {
        this.storage_adress = storage_adress_value;
    }
    
    public void setStorageArea (double storage_area_value)
    {
        this.storage_area = storage_area_value;
    }
    
    public void setProductList (Product[] product_list_value)
    {
        this.product_list = Arrays.copyOf(this.product_list,product_list_value.length);
        for (int i = 0; i < product_list_value.length; i++)
            this.product_list [i] = product_list_value[i];
    }
    
    public String getStorageAdress ()
    {
        return storage_adress;
    }
    
    public double getStorageArea ()
    {
        return storage_area;
    }
    
    public Product[] getProductList ()
    {
        return product_list;
    }
    
    protected Storage (String strg_ad_v, double strg_a_v, Product[] prod_l_v)
    {
        this.storage_adress = strg_ad_v;
        this.storage_area = strg_a_v;
        this.product_list = prod_l_v;
    }
    
    public void listToString ()
    {
        System.out.println(this.toString());
        for (Product product_list1 : this.product_list) 
        {
            System.out.println(product_list1.toString());
        }
    }
    
    @Override
    public String toString()
    {
        return "\nАдресс склада: " + storage_adress + " Площадь склада: " + storage_area + "\n";
    }
}
