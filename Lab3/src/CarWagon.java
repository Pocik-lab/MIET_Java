package Lab3;

import static Lab3.CheckFunctions.IntCheck;
import java.io.*;

/** 
 * Класс вагона с машинами со свойствами <b>car_possible_count</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class CarWagon extends Wagon implements Serializable 
{

    /** Поле вместимость по кол-ву машин */
    private int car_possible_count;
    
    /**
     * Процедура определения вместимости по кол-ву машин {@link CarWagon#car_possible_count}
     * @param car_possible_count - объем сыпучего груза
     */
    public void setCarPossibleCount(int car_possible_count_value)
    {
        this.car_possible_count = car_possible_count_value;
    }

    /**
     * Функция получения значения поля {@link CarWagon#car_possible_count}
     * @return возвращает вместимость по кол-ву машин
     */
    public int getCarPossibleCount()
    {   
        return car_possible_count;
    }

    /** 
     * Конструктор - создание нового объекта
     * @see CarWagon#CarWagon(int, int)
     */
    protected CarWagon ()
    {
        super();
        System.out.println("Введите допустимое для платформы кол-во машин:\n");
        this.car_possible_count = IntCheck();
    }

    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @param carpos_c_v - вместимость по кол-ву машин
     * @see CarWagon#CarWagon()
     */
    protected CarWagon (int num_v, int carpos_c_v)
    {
        super(num_v);
        this.car_possible_count = carpos_c_v;
    }

    /**
     * Процедура словесного описания данного типа вагона
     * @return возвращает словесное описание вагона
     */
    @Override
    public String toString()
    {
        return "Автомобильная платформа\nНомер вагона: " + super.getNumber() + "\n" + "Допустимое количество машин: " + car_possible_count+ "\n";
    }
}
