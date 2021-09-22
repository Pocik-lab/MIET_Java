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
public class CarWagon extends Wagon{
    
    private int car_possible_count;
    
    public void SetCarPossibleCount(int car_possible_count_value)
    {
        this.car_possible_count = car_possible_count_value;
    }
    
    public int GetCarPossibleCount()
    {   
        return car_possible_count;
    }
    
    public CarWagon (int num_v, int carpos_c_v)
    {
        super(num_v);
        this.car_possible_count = carpos_c_v;
    }
    
    @Override
    public String ToString()
    {
        return "Автомобильная платформа\nНомер вагона: " + super.GetNumber() + "\n" + "Допустимое количество машин: " + car_possible_count+ "\n";
    }
}