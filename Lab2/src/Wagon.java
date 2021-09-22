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
public abstract class Wagon {
    
    private int number;
    
    public void SetNumber(int number_value)
    {
        this.number = number_value;
    }
    
    public int GetNumber()
    {   
        return number;
    }
    
    protected Wagon (int num_v)
    {
        this.number = num_v;
    }
    
    public abstract String ToString();
}