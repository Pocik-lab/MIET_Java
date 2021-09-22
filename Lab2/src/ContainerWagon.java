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
public class ContainerWagon extends Wagon {
    
    private int container_count;
    
    public void SetContainerCouunt(int container_count_value)
    {
        this.container_count = container_count_value;
    }
    
    public int GetContainerCount()
    {   
        return container_count;
    }
    
    public ContainerWagon (int num_v, int cont_c_v)
    {
        super(num_v);
        this.container_count = cont_c_v;
    }
    
    @Override
    public String ToString()
    {
        return "Платформа для контейнеров\nНомер вагона: " + super.GetNumber() + "\n" + "Колличество контейнеров: " + container_count + "\n";
    }
}