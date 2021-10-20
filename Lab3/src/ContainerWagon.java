package Lab3;

import static Lab3.CheckFunctions.IntCheck;
import java.io.*;

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
    public void setContainerCouunt(int container_count_value)
    {
        this.container_count = container_count_value;
    }

    /**
     * Функция получения значения поля {@link ContainerWagon#container_count}
     * @return возвращает кол-во контейнеров
     */
    public int getContainerCount()
    {   
        return container_count;
    }
    
    /** 
     * Конструктор - создание нового объекта
     * @see ContainerWagon#ContainerWagon(int, int)
     */
    protected ContainerWagon ()
    {
        super();
        System.out.println("Введите количетсво контейнеров\n");
        this.container_count = IntCheck();
    }
    
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param num_v - номер вагона
     * @param cont_c_v - кол-во контейнеров
     * @see ContainerWagon#ContainerWagon()
     */
    protected ContainerWagon (int num_v, int cont_c_v)
    {
        super(num_v);
        this.container_count = cont_c_v;
    }

    /**
     * Процедура словесного описания данного типа вагона
     * @return возвращает словесное описание вагона
     */
    @Override
    public String toString()
    {
        return "Платформа для контейнеров\nНомер вагона: " + super.getNumber() + "\n" + "Колличество контейнеров: " + container_count + "\n";
    }
}
