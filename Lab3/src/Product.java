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
public abstract class Product implements Serializable {
    
    private static final long serialVersionUID = 2L;
    
    private int count;
    private double prod_weight;
    
    public void setCount(int count_value)
    {
        this.count = count_value;
    }
    
    public void setProdWeight(double prod_weight_value)
    {   
        this.prod_weight = prod_weight_value;
    }
    
    public int getCount()
    {   
        return count;
    }
    
    public double getProdWeight()
    {
        return prod_weight;
    }
    
    protected Product ()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите количество товара:\n");
        count = IntCheck();
        System.out.println("\nВведите вес товара:\n");
        prod_weight= DoubleCheck();
    }
    
    protected Product (int count_v, double prod_w_v)
    {
        this.count = count_v;
        this.prod_weight = prod_w_v;
    }
    
    @Override
    public abstract String toString();
}
