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
public class ProductCar extends Product{
    
    private String car_type;
    private String car_name;
    private int car_price;
    
    public void SetCarType(String car_type_value)
    {
        this.car_type = car_type_value;
    }
    
    public void SetCarName(String car_name_value)
    {   
        this.car_name = car_name_value;
    }
    
    public void SetCarPrice(String car_price_value)
    {   
        this.car_name = car_price_value;
    }
    
    public String GetCarType()
    {   
        return car_type;
    }

    public String GetCarName()
    {   
        return car_name;
    }
    
    public int GetCarPrice()
    {
        return car_price;
    }
    
    protected ProductCar (int count_v,double prod_w_v, String car_t_v, String car_n_v, int car_p_v)
    {
        super(count_v, prod_w_v);
        this.car_type = car_t_v;
        this.car_name = car_n_v;
        this.car_price = car_p_v;
    }
    
    @Override
    public String ToString()
    {
        return "Автомобили\nКоличество товара: " + super.GetCount() + " Вес товара: " + super.GetProdWeight() + "\n" + "Тип машины: " + car_type + " Марка: " + car_name + " Цена машины(рубли): " + car_price + "\n";
    }
}