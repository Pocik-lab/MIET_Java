package lab4;

import java.io.*;
import java.util.*;

/** 
 * Класс вагона со свойствами <b>ID</b>.
 * @author Тегин Александр
 * @version 1.0
*/
public class Wagon{

    /** 
     * Поле ID объекта 
     */
    private double ID;
    
    /**
     * Процедура определения ID объекта {@link Wagon#ID}
     * @param ID_value - номер вагона
     */
    public void setID(double ID_value)
    {
        this.ID = ID_value;
    }
    
    /**
     * Функция получения значения поля {@link Wagon#ID}
     * @return ID объекта
     */
    public double getID()
    {   
        return ID;
    }
    
    /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param ID_v - ID объекта
     * @param mylog_v - инфо лог
     * @param arrORmap - определение (массив или словарь)
     */
    protected Wagon(double ID_v,InfoLog mylog_v,boolean arrORmap)
    {
        this.ID = ID_v; 
        if (arrORmap)
            mylog_v.strToLog( "add, ID = " +  String.valueOf(ID_v) );
        else
            mylog_v.strToLog( "put, ID = " +  String.valueOf(ID_v) );
    }
    
    /**
     * Процедура текстового описания данного продукта
     */
    @Override
    public String toString()
    {
        return "ID of this wagon : " + this.getID();
    }
}

