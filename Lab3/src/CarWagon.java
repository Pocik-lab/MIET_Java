/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import static Lab3.CheckFunctions.IntCheck;
import java.io.*;

/**
 *
 * @author aleksandrtegin
 */
public class CarWagon extends Wagon implements Serializable{
    
    private int car_possible_count;
    
    public void setCarPossibleCount(int car_possible_count_value)
    {
        this.car_possible_count = car_possible_count_value;
    }
    
    public int getCarPossibleCount()
    {   
        return car_possible_count;
    }
    
    protected CarWagon ()
    {
        super();
        System.out.println("Введите допустимое для платформы кол-во машин:\n");
        this.car_possible_count = IntCheck();
    }
    
    protected CarWagon (int num_v, int carpos_c_v)
    {
        super(num_v);
        this.car_possible_count = carpos_c_v;
    }
    
    @Override
    public String toString()
    {
        return "Автомобильная платформа\nНомер вагона: " + super.getNumber() + "\n" + "Допустимое количество машин: " + car_possible_count+ "\n";
    }
}
