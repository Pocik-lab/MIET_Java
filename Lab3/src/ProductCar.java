package Lab3;

import static Lab3.CheckFunctions.*;
import java.io.*;

/** 
 * Класс продукта со свойствами <b>car_type</b> и <b>car_name</b> и <b>car_price</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class ProductCar extends Product implements Serializable
{
    /** Поле типа машины */
    private String car_type;
    /** Поле навзания машины */
    private String car_name;
    /** Поле стоимости машины */
    private int car_price;
        
    /**
     * Процедура определения типа машины {@link ProducCar#car_type}
     * @param car_type - тип машины
     */
    public void setCarType(String car_type_value)
    {
        this.car_type = car_type_value;
    }
        
    /**
     * Процедура определения названия машины {@link ProductCar#car_name}
     * @param car_name - название машины
     */
    public void setCarName(String car_name_value)
    {   
        this.car_name = car_name_value;
    }
        
    /**
     * Процедура определения стоимости машины {@link ProductCar#car_price}
     * @param car_price - стоимость машины 
     */
    public void setCarPrice(int car_price_value)
    {   
        this.car_price = car_price_value;
    }
    
    /**
     * Функция получения значения поля {@link ProductCar#car_type}
     * @return возвращает тип машины
     */
    public String getCarType()
    {   
        return car_type;
    }

    /**
     * Функция получения значения поля {@link ProductCar#car_name}
     * @return возвращает название машины
     */
    public String getCarName()
    {   
        return car_name;
    }
    
    /**
     * Функция получения значения поля {@link ProductCar#car_price}
     * @return возвращает стоимость машины
     */
    public int getCarPrice()
    {
        return car_price;
    }
    
    /** 
     * Конструктор - создание нового объекта
     * @see ProductCar#ProductCar(int, double, String, String, int)
     */
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
    
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param spec_id_v - ID продукта
     * @param prod_w_v - вес продукта
     * @param car_t_v - тип машины
     * @param car_n_v - название машины
     * @param car_p_v - стоимость машины
     * @see ProductCar#ProductCar()
     */
    protected ProductCar(int spec_id_v,double prod_w_v, String car_t_v, String car_n_v, int car_p_v)
    {
        super(spec_id_v, prod_w_v);
        this.car_type = car_t_v;
        this.car_name = car_n_v;
        this.car_price = car_p_v;
    }
    
    /**
     * Процедура словесного описания данного продукта
     */
    @Override
    public String toString()
    {
        return "Автомобили\nID товара: " + super.getSpecialID()+ " Вес товара: " + super.getProdWeight() + "\n" + "Тип машины: " + car_type + " Марка: " + car_name + " Цена машины(рубли): " + car_price + "\n";
    }
}