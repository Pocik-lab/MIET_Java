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
public class ProductContainer extends Product implements Serializable{
    
    private String container_type;
    private double container_amount;
    
    public void setContainerType(String container_type_value)
    {
        this.container_type = container_type_value;
    }
    
    public void setContainerAmount(double container_amount_value)
    {   
        this.container_amount = container_amount_value;
    }
    
    public String getContainerType()
    {   
        return container_type;
    }
    
    public double getContainerAmount()
    {
        return container_amount;
    }
    
    protected ProductContainer ()
    {
        super();
        System.out.println("\nВведите тип контейнера:\n");
        container_type = StringCheck();
        System.out.println("\nВведите объём контейнеров:\n");
        container_amount = DoubleCheck();
    }
    
    protected ProductContainer (int count_v,double prod_w_v, String cont_t_v, double cont_a_v)
    {
        super(count_v, prod_w_v);
        this.container_type = cont_t_v;
        this.container_amount = cont_a_v;
    }

    @Override
    public String toString()
    {
        return "Контейнеры\nКоличество товара: " + super.getCount() + " Вес товара: " + super.getProdWeight() + "\n" + "Тип контейнера: " + container_type + " Объём контейнеров: " + container_amount + "\n";
    }
}
