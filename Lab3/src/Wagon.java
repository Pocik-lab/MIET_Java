/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.io.*;
import static Lab3.CheckFunctions.*;
/**
 *
 * @author aleksandrtegin
 */
public abstract class Wagon implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int number;
    
    public void setNumber(int number_value)
    {
        this.number = number_value;
    }
    
    public int getNumber()
    {   
        return number;
    }
    
    protected Wagon ()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите номер вагона\n");
        this.number = IntCheck();
    }
    
    protected Wagon (int num_v)
    {
        this.number = num_v;
    }
    
    @Override
    public abstract String toString();
}
