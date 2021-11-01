package Lab3;

import static Lab3.CheckFunctions.DoubleCheck;
import java.io.*;

/** 
 * Класс вагона с сыпучим грузом со свойствами <b>bulk_cargo_amount</b>.
 * @author Тегин Александр
 * @version 1.0
*/
public class BulkCargoWagon extends Wagon implements Serializable
{
    /** Поле объем сыпучего груза */
    private double bulk_cargo_amount;
    
    /**
     * Процедура определения объема сыпучего груза {@link BulkCargoWagon#bulk_cargo_amount}
     * @param bulk_cargo_amount_value - объем сыпучего груза
     */
    public void setBulkCargoAmount(double bulk_cargo_amount_value)
    {   
        this.bulk_cargo_amount = bulk_cargo_amount_value;
    }
    
    /**
     * Функция получения значения поля {@link BulkCargoWagon#bulk_cargo_amount}
     * @return возвращает объем сыпучего груза
     */
    public double getBulkCargoAmount()
    {   
        return bulk_cargo_amount;
    }
    
    /** 
     * Конструктор - создание нового объекта
     * @see BulkCargoWagon#BulkCargoWagon(int, double)
     */
    public BulkCargoWagon()
    {
        super();
        System.out.println("\nВведите общий объём цистерн для сыпучего груза:\n");
        this.bulk_cargo_amount = DoubleCheck();
    }

    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @param bulc_a_v - объем сыпучего груза
     * @see BulkCargoWagon#BulkCargoWagon()
     */
    public BulkCargoWagon(int num_v, double bulc_a_v)
    {
        super(num_v);
        this.bulk_cargo_amount = bulc_a_v;
    }
    
    /**
     * Процедура текстового описания данного типа вагона
     * @return возвращает словесное описание вагона
     */
    @Override
    public String toString()
    {
        return "Цистерны для сыпучего груза\nНомер вагона: " + super.getNumber() + "\n" +"Объём сыпучего груза: " + bulk_cargo_amount + "\n";
    }
}
