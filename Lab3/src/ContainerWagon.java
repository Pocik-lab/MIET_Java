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
 * Класс вагона с контейнерами со свойствами <b>container_count</b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class ContainerWagon extends Wagon implements Serializable
{
    /** Поле кол-во контейнеров */
    private int container_count;
    
    /**
     * Процедура определения кол-ва контейнеров {@link ContainerWagon#container_count}
     * @param container_count - кол-во контейнеров
     */
=======
/**
 *
 * @author aleksandrtegin
 */
public class ContainerWagon extends Wagon implements Serializable{
    
    private int container_count;
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public void setContainerCouunt(int container_count_value)
    {
        this.container_count = container_count_value;
    }
    
<<<<<<< HEAD
    /**
     * Функция получения значения поля {@link ContainerWagon#container_count}
     * @return возвращает кол-во контейнеров
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    public int getContainerCount()
    {   
        return container_count;
    }
    
<<<<<<< HEAD
    /** 
     * Конструктор - создание нового объекта
     * @see ContainerWagon#ContainerWagon(int, int)
     */
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected ContainerWagon ()
    {
        super();
        System.out.println("Введите количетсво контейнеров\n");
        this.container_count = IntCheck();
    }
<<<<<<< HEAD
        
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @param cont_c_v - кол-во контейнеров
     * @see ContainerWagon#ContainerWagon()
     */
=======
    
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    protected ContainerWagon (int num_v, int cont_c_v)
    {
        super(num_v);
        this.container_count = cont_c_v;
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
        return "Платформа для контейнеров\nНомер вагона: " + super.getNumber() + "\n" + "Колличество контейнеров: " + container_count + "\n";
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
