<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
package Lab3;

import static Lab3.CheckFunctions.IntCheck;
import java.io.*;

<<<<<<< HEAD
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
=======
/**
 *
 * @author aleksandrtegin
 */
public class CarWagon extends Wagon implements Serializable{
    
    private int car_possible_count;
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setCarPossibleCount(int car_possible_count_value)
    {
        this.car_possible_count = car_possible_count_value;
    }
<<<<<<< HEAD

    /**
     * Функция получения значения поля {@link CarWagon#car_possible_count}
     * @return возвращает вместимость по кол-ву машин
     */
=======
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public int getCarPossibleCount()
    {   
        return car_possible_count;
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта
     * @see CarWagon#CarWagon(int, int)
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected CarWagon ()
    {
        super();
        System.out.println("Введите допустимое для платформы кол-во машин:\n");
        this.car_possible_count = IntCheck();
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @param carpos_c_v - вместимость по кол-ву машин
     * @see CarWagon#CarWagon()
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected CarWagon (int num_v, int carpos_c_v)
    {
        super(num_v);
        this.car_possible_count = carpos_c_v;
    }
    
<<<<<<< HEAD
    /**
     * Процедура словесного описания данного типа вагона
     * @return возвращает словесное описание вагона
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    @Override
    public String toString()
    {
        return "Автомобильная платформа\nНомер вагона: " + super.getNumber() + "\n" + "Допустимое количество машин: " + car_possible_count+ "\n";
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
