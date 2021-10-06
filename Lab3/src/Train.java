/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.*;
import static Lab3.CheckFunctions.*;
import java.io.*;
/**
 *
 * @author aleksandrtegin
 *
 */


public class Train implements Serializable{
    
    private String train_name;
    private int train_length;
    private Wagon[] wagon_list = new Wagon [100];
    private HashMap <Wagon, Product> wagon_And_product = new HashMap<>();
    
    public void setTrainName (String train_name_value)
    {
        this.train_name = train_name_value;
    }
    
    public void setTrainLength (int train_length_value)
    {
        this.train_length = train_length_value;
    }
    
    public void setWagonList (Wagon[] wagon_list_value)
    {
        this.wagon_list = Arrays.copyOf(this.wagon_list, wagon_list_value.length);
        for (int i = 0; i < wagon_list_value.length; i++)
            this.wagon_list[i] = wagon_list_value[i];
    }
    
    public void setWagonAndProduct (Wagon[] wagon_list_value, Product[] product_list_value)
    {
        System.out.println("Загрузим ж/д состав продукцией со склада \n");
        if (wagon_list_value.length == product_list_value.length)
        {
            do
            {
                for (int i = 0; i < product_list_value.length; i++) 
                {
                    int num = -1;
                    if (!wagon_And_product.containsValue(product_list_value[i])) 
                    {
                        System.out.println("\n-------------------------------\n");
                        System.out.println(product_list_value[i].toString());
                        System.out.println("\n-------------------------------\n");
                    } 
                    else 
                    {                       
                        continue;
                    }
                    
                    for (int j = 0; j < wagon_list_value.length; j++) 
                    {
                        if (!wagon_And_product.containsKey(wagon_list_value[j]))
                        {
                            System.out.println("Поместить продукцию в данный вагон? \n 1 - Да \n 2 - Нет \n");
                            System.out.println("\n-------------------------------\n");
                            System.out.println(wagon_list_value[j].toString());
                            System.out.println("\n-------------------------------\n");
                            boolean CorrectValues = true;
                            do
                            {
                                num = IntCheck();
                            }
                            while (!CorrectValues && (num < 0 || num > 2));
                            switch (num) {
                                case(1):                                    
                                {
                                        this.wagon_And_product.put(wagon_list_value[j], product_list_value[i]);
                                        j = wagon_list_value.length;
                                }
                                case(2): 
                                {
                                    j = wagon_list_value.length;
                                    continue;
                                }
                            }
                        } 
                        else 
                        {
                            System.out.println("Вагон " + wagon_list_value[j].getNumber() + " занят! \n");
                            System.out.println("\n-------------------------------\n");
                        }
                    }
                }
            }
            while (wagon_list_value.length != this.wagon_And_product.size());
        }
        else
        {
            System.out.println("Списки несоразмерны!\nЗагрузка невозможна");
        }
    }  
    
    public String getTrainName ()
    {
        return train_name;
    }
    
    public int getTrainLength ()
    {
        return train_length;
    }
        
    public Wagon[] getWagonList ()
    {
        return wagon_list;
    }
    
    protected Train (String tr_n_v, int tr_l_v, Wagon[] wag_l_v)
    {
        this.train_name = tr_n_v;
        this.train_length = tr_l_v;
        this.wagon_list = wag_l_v;   
    }
    
    public void wagonAndProductToString()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("\nСписок ж/д состава и его продукции: \n");
        System.out.println("\n-------------------------------\n");
        ArrayList<Wagon> keys = new ArrayList<>(wagon_And_product.keySet());
        ArrayList<Product> values = new ArrayList<>(wagon_And_product.values());
       
        int order = 1;
       
        do
        {
            for(int i = 0; i < this.wagon_And_product.size(); i++)
            {
                Wagon def_wagon = keys.get(i);
                if (def_wagon.getNumber() == order)
                {
                    System.out.println(def_wagon.toString());
                    Product def_prod = values.get(i);
                    System.out.println(def_prod.toString());
                    order++;
                    System.out.println("\n-------------------------------\n");
                }
            }
        }
        while (order != this.wagon_And_product.size() + 1);
    }

    public void changeWagon()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("\nСписок ж/д состава и его продукции: \n");
        System.out.println("\n-------------------------------\n");
        ArrayList<Wagon> keys = new ArrayList<>(wagon_And_product.keySet());
        ArrayList<Product> values = new ArrayList<>(wagon_And_product.values());
       
        int order = 1;
       
        do
        {
            for(int i = 0; i < this.wagon_And_product.size(); i++)
            {
                Wagon def_wagon = keys.get(i);
                if (def_wagon.getNumber() == order)
                {
                    System.out.println(def_wagon.toString());
                    Product def_prod = values.get(i);
                    System.out.println(def_prod.toString());
                    order++;
                    System.out.println("\n-------------------------------\n");
                }
            }
        }
        while (order != this.wagon_And_product.size() + 1);
    }
    
    public void listToString ()
    {
        System.out.println(this.toString());
        for (Wagon wagon_list1 : this.wagon_list) 
        {
            System.out.println(wagon_list1.toString());
        }
    }
    
    @Override
    public String toString()
    {
        return "\nНазвание поезда: " + train_name + " Длина поезда: " + train_length + "\n";
    }
}
