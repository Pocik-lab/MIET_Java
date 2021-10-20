package Lab3;

import static Lab3.CheckFunctions.*;
import java.io.*;

/** 
 * Класс продукта со свойствами <b>container_type</b> и <b>container_amount</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class ProductContainer extends Product implements Serializable
{
    /** Поле типа контейнера */
    private String container_type;
    /** Поле объема контейнера */
    private double container_amount;
    
    /**
     * Процедура определения типа контейнера {@link ProductContainerCargo#bulk_cargo_type}
     * @param bulk_cargo_type - тип контейнера
     */
    public void setContainerType(String container_type_value)
    {
        this.container_type = container_type_value;
    }
    
    /**
     * Процедура определения объёма контейнера {@link ProductContainerCargo#container_amount}
     * @param bulk_cargo_type - объем контейнера
     */
    public void setContainerAmount(double container_amount_value)
    {   
        this.container_amount = container_amount_value;
    }
        
    /**
     * Функция получения значения поля {@link ProductContainer#container_type}
     * @return возвращает тип контейнера
     */
    public String getContainerType()
    {   
        return container_type;
    }
        
    /**
     * Функция получения значения поля {@link ProductContainer#container_amount}
     * @return возвращает объем контейнера
     */
    public double getContainerAmount()
    {
        return container_amount;
    }
    
    /** 
     * Конструктор - создание нового объекта
     * @see ProductContainer#ProductContainer(int, double, String,  double)
     */
    protected ProductContainer ()
    {
        super();
        System.out.println("\nВведите тип контейнера:\n");
        container_type = StringCheck();
        System.out.println("\nВведите объём контейнеров:\n");
        container_amount = DoubleCheck();
    }
    
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param spec_id_v - ID продукта
     * @param prod_w_v - вес продукта
     * @param container_type - тип контейнера
     * @param сontainer_amount - объем контейнера
     * @see ProductContainer#ProductContainer()
     */
    protected ProductContainer (int spec_id_v,double prod_w_v, String cont_t_v, double cont_a_v)
    {
        super(spec_id_v, prod_w_v);
        this.container_type = cont_t_v;
        this.container_amount = cont_a_v;
    }

    /**
     * Процедура словесного описания данного продукта
     */
    @Override
    public String toString()
    {
        return "Контейнеры\nID товара: " + super.getSpecialID()+ " Вес товара: " + super.getProdWeight() + "\n" + "Тип контейнера: " + container_type + " Объём контейнеров: " + container_amount + "\n";
    }
}