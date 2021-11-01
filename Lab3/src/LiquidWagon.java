package Lab3;

import static Lab3.CheckFunctions.DoubleCheck;
import java.io.*;

/** 
 * Класс вагона со свойствами <b>container_count</b>.
 * @author Тегин Александр
 * @version 1.0
*/
public class LiquidWagon extends Wagon implements Serializable
{
    /** Поле объём жидкости */
    private double liquid_amount;
    
    /**
     * Процедура определения объёма жидкости {@link LiquidWagon#liquid_amount}
     * @param liquid_amount_value - объём жидкости
     */
    public void setLiquidAmount(double liquid_amount_value)
    {
        this.liquid_amount = liquid_amount_value;
    }
    
    /**
     * Функция получения значения поля {@link LiquidWagon#liquid_amount}
     * @return возвращает объём жидкости
     */
    public double getLiquidAmount()
    {   
        return liquid_amount;
    }

    /** 
     * Конструктор - создание нового объекта
     * @see LiquidWagon#LiquidWagon(int, double)
     */
    protected LiquidWagon ()
    {
        super();
        System.out.println("\nВведите общий объём цистерн для жидкостей:\n");
        this.liquid_amount = DoubleCheck();
    }

    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @param liq_a_v - объём жидкости
     * @see LiquidWagon#LiquidWagon()
     */
    protected LiquidWagon (int num_v, double liq_a_v)
    {
        super(num_v);
        this.liquid_amount = liq_a_v;
    }

    /**
     * Процедура текстового описания данного типа вагона
     * @return возвращает словесное описание вагона
     */
    @Override
    public String toString()
    {
        return "Цистерны для жидкостей\nНомер вагона: " + super.getNumber() + "\n" + "Объём жиддкости: " + liquid_amount + "\n";
    }
}
