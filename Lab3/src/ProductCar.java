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
public class ProductCar extends Product implements Serializable{
    
    private String car_type;
    private String car_name;
    private int car_price;
    
    public void setCarType(String car_type_value)
    {
        this.car_type = car_type_value;
    }
    
    public void setCarName(String car_name_value)
    {   
        this.car_name = car_name_value;
    }
    
    public void setCarPrice(String car_price_value)
    {   
        this.car_name = car_price_value;
    }
    
    public String getCarType()
    {   
        return car_type;
    }

    public String getCarName()
    {   
        return car_name;
    }
    
    public int getCarPrice()
    {
        return car_price;
    }
    
    protected ProductCar()
    {
        super();
        System.out.println("\nВведите тип машины:\n");
        this.car_type = StringCheck();
        System.out.println("\nВведите название машины:\n");
        this.car_name = StringCheck();
        System.out.println("\nВведите цену машины (в рублях):\n");
        this.car_price = IntCheck();
    }
    
    protected ProductCar(int count_v,double prod_w_v, String car_t_v, String car_n_v, int car_p_v)
    {
        super(count_v, prod_w_v);
        this.car_type = car_t_v;
        this.car_name = car_n_v;
        this.car_price = car_p_v;
    }
    
    @Override
    public String toString()
    {
        return "Автомобили\nКоличество товара: " + super.getCount() + " Вес товара: " + super.getProdWeight() + "\n" + "Тип машины: " + car_type + " Марка: " + car_name + " Цена машины(рубли): " + car_price + "\n";
    }
}
