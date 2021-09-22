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
public class ProductContainer extends Product {
    
    private String container_type;
    private double container_amount;
    
    public void SetContainerType(String container_type_value)
    {
        this.container_type = container_type_value;
    }
    
    public void SetContainerAmount(double container_amount_value)
    {   
        this.container_amount = container_amount_value;
    }
    
    public String GetContainerType()
    {   
        return container_type;
    }
    
    public double GetContainerAmount()
    {
        return container_amount;
    }
    
    public ProductContainer (int count_v,double prod_w_v, String cont_t_v, double cont_a_v)
    {
        super(count_v, prod_w_v);
        this.container_type = cont_t_v;
        this.container_amount = cont_a_v;
    }
    
    @Override
    public String ToString()
    {
        return "Контейнеры\nКоличество товара: " + super.GetCount() + " Вес товара: " + super.GetProdWeight() + "\n" + "Тип контейнера: " + container_type + " Объём контейнеров: " + container_amount + "\n";
    }
}