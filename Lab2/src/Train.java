/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.util.*;
/**
 *
 * @author aleksandrtegin
 *
 */


public class Train {
    
    private String train_name;
    private int train_length;
    private Wagon[] wagon_list = new Wagon [100];
    private HashMap <Wagon, Product> wagon_And_product = new HashMap<>();
    
    public void SetTrainName (String train_name_value)
    {
        this.train_name = train_name_value;
    }
    
    public void SetTrainLength (int train_length_value)
    {
        this.train_length = train_length_value;
    }
    
    public void SetWagonList (Wagon[] wagon_list_value)
    {
        for (int i = 0; i < wagon_list_value.length; i++)
            this.wagon_list [i] = wagon_list_value[i];
    }
    
    public void SetWagonAndProduct (Wagon[] wagon_list_value, Product[] product_list_value)
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
                        System.out.println(product_list_value[i].ToString());
                        System.out.println("\n-------------------------------\n");
                    }
                    else                       
                        continue;
                    
                    for (int j = 0; j < wagon_list_value.length; j++)
                    {
                        if (!wagon_And_product.containsKey(wagon_list_value[j]))
                        {
                            System.out.println("Поместить продукцию в данный вагон? \n 1 - Да \n 2 - Нет \n");
                            System.out.println("\n-------------------------------\n");
                            System.out.println(wagon_list_value[j].ToString());
                            System.out.println("\n-------------------------------\n");
                            Scanner sc = new Scanner(System.in);

                            boolean CorrectValues = true;
                            
                            do
                            {
                                try 
                                {
                                    CorrectValues = true;
                                    System.out.println("Введите целое число: ");
                                    num = sc.nextInt();
                                }
                                catch (InputMismatchException e)
                                {
                                    CorrectValues = false;
                                    System.out.println("\nПопробуйте ещё раз\n");
                                    sc.nextLine();
                                }
                            }
                            while (!CorrectValues && (num < 0 || num > 2));

                            switch(num)
                            {
                                case 1:
                                {
                                    this.wagon_And_product.put(wagon_list_value[j], product_list_value[i]);
                                    j = wagon_list_value.length;
                                    break;
                                }
                                case 2:
                                {
                                    j = wagon_list_value.length;
                                    continue;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Вагон " + wagon_list_value[j].GetNumber() + " занят! \n");
                            System.out.println("\n-------------------------------\n");
                            continue;
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
    
    public String GetTrainName ()
    {
        return train_name;
    }
    
    public int GetTrainLength ()
    {
        return train_length;
    }
        
    public Wagon[] GetWagonList ()
    {
        return wagon_list;
    }
    
    protected Train (String tr_n_v, int tr_l_v, Wagon[] wag_l_v)
    {
        this.train_name = tr_n_v;
        this.train_length = tr_l_v;
        this.wagon_list = wag_l_v;   
    }
    
    public void WagonAndProductToString()
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
                if (def_wagon.GetNumber() == order)
                {
                    System.out.println(def_wagon.ToString());
                    Product def_prod = values.get(i);
                    System.out.println(def_prod.ToString());
                    order++;
                    System.out.println("\n-------------------------------\n");
                }
                else
                {
                    continue;
                }
            }
        }
        while (order != this.wagon_And_product.size() + 1);
    }
    
    public void ListToString ()
    {
        System.out.println(this.ToString());
        for (int i = 0; i < this.wagon_list.length; i++)
            System.out.println(wagon_list[i].ToString());
    }
    
    public String ToString()
    {
        return "\nНазвание поезда: " + train_name + " Длина поезда: " + train_length + "\n";
    }
}