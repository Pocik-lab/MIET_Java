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
public class ContainerWagon extends Wagon implements Serializable{
    
    private int container_count;
    
    public void setContainerCouunt(int container_count_value)
    {
        this.container_count = container_count_value;
    }
    
    public int getContainerCount()
    {   
        return container_count;
    }
    
    protected ContainerWagon ()
    {
        super();
        System.out.println("Введите количетсво контейнеров\n");
        this.container_count = IntCheck();
    }
    
    protected ContainerWagon (int num_v, int cont_c_v)
    {
        super(num_v);
        this.container_count = cont_c_v;
    }
    
    @Override
    public String toString()
    {
        return "Платформа для контейнеров\nНомер вагона: " + super.getNumber() + "\n" + "Колличество контейнеров: " + container_count + "\n";
    }
}
