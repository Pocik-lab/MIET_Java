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
public abstract class Product {
    
    private int count;
    private double prod_weight;
    
    public void SetCount(int count_value)
    {
        this.count = count_value;
    }
    
    public void SetProdWeight(double prod_weight_value)
    {   
        this.prod_weight = prod_weight_value;
    }
    
    public int GetCount()
    {   
        return count;
    }
    
    public double GetProdWeight()
    {
        return prod_weight;
    }
    
    protected Product (int count_v, double prod_w_v)
    {
        this.count = count_v;
        this.prod_weight = prod_w_v;
    }
    
    public abstract String ToString();
}