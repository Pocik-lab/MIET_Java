<<<<<<< HEAD
package Lab3;

import static Lab3.CheckFunctions.*;
import static Lab3.ListOfMenues.wagonLoadMenu;
import java.io.*;
import java.util.logging.*;
import java.util.*;
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.*;
import static Lab3.CheckFunctions.*;
import java.io.*;
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
/**
 *
 * @author aleksandrtegin
 *
 */


public class Train implements Serializable{
    
    private String train_name;
    private int train_length;
<<<<<<< HEAD
    private ArrayList<Wagon> wagon_list = new ArrayList<Wagon>();
    private HashMap<Wagon, Product> wagon_And_product = new HashMap<>();
=======
    private Wagon[] wagon_list = new Wagon [100];
    private HashMap <Wagon, Product> wagon_And_product = new HashMap<>();
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    
    public void setTrainName (String train_name_value)
    {
        this.train_name = train_name_value;
    }
    
    public void setTrainLength (int train_length_value)
    {
        this.train_length = train_length_value;
    }
<<<<<<< HEAD

    public void setWagonList(ArrayList<Wagon> wagon_list_value)
    {
       for(Wagon wagon: wagon_list_value)
       {
           this.wagon_list.add(wagon);
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
        
    public ArrayList<Wagon> getWagonList ()
    {
        return wagon_list;
    }
    
    public void addToWagonList()
    {
        int global_count;
        
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите количество вагонов: ");
        
        do
        {
            global_count = IntCheck();
        }   while (global_count < 0 || global_count >= 100);
        
        int case_num;
        for (int i = 0; i < global_count; i++)
        {
            System.out.println("\nКакого типа новый вагон ?\n");
            wagonLoadMenu();
            do
            {
                case_num = IntCheck();
            }   while (case_num <= 0 || case_num > 4);
            
            switch(case_num)
            {
                case(1):
                {
                    this.wagon_list.add(new ContainerWagon());
                    break;
                }
                case(2):
                {
                    this.wagon_list.add(new LiquidWagon());
                    break;
                }
                case(3):
                {
                    this.wagon_list.add(new BulkCargoWagon());
                    break;
                }
                case(4):
                {
                    this.wagon_list.add(new CarWagon());
                    break;
                }
            }
        }
        System.out.println("\n-------------------------------\n");
        this.setTrainLength(this.wagon_list.size());
    }
    
    public void setWagonAndProduct(ArrayList<Product> product_list_value)
    {
        System.out.println("Загрузим ж/д состав продукцией со склада \n");
        if ( (this.wagon_list.size() <= product_list_value.size()) && (!this.wagon_list.isEmpty()))
        {
            do
            {
                for (Product product: product_list_value) 
                {
                    int num = -1;
                    
                    if (!wagon_And_product.containsValue(product)) 
                    {
                        System.out.println("\n-------------------------------\n");
                        System.out.println(product.toString());
=======
    
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
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
                        System.out.println("\n-------------------------------\n");
                    } 
                    else 
                    {                       
                        continue;
                    }
                    
<<<<<<< HEAD
                    for (Wagon wagon : this.wagon_list) 
                    {
                        if (!wagon_And_product.containsKey(wagon))
                        {
                            System.out.println("Поместить продукцию в данный вагон? \n 1 - Да \n 2 - Нет \n");
                            System.out.println("\n-------------------------------\n");
                            System.out.println(wagon.toString());
                            System.out.println("\n-------------------------------\n");
                            
=======
                    for (int j = 0; j < wagon_list_value.length; j++) 
                    {
                        if (!wagon_And_product.containsKey(wagon_list_value[j]))
                        {
                            System.out.println("Поместить продукцию в данный вагон? \n 1 - Да \n 2 - Нет \n");
                            System.out.println("\n-------------------------------\n");
                            System.out.println(wagon_list_value[j].toString());
                            System.out.println("\n-------------------------------\n");
                            boolean CorrectValues = true;
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
                            do
                            {
                                num = IntCheck();
                            }
<<<<<<< HEAD
                            while (num < 0 || num > 2);
                            
                            switch (num) 
                            {
                                case(1):                                    
                                {
                                    this.wagon_And_product.put(wagon, product);
                                    break;
                                }
                                case(2): 
                                {
                                    break;
=======
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
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
                                }
                            }
                        } 
                        else 
                        {
<<<<<<< HEAD
                            System.out.println("Вагон " + wagon.getNumber() + " занят! \n");
=======
                            System.out.println("Вагон " + wagon_list_value[j].getNumber() + " занят! \n");
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
                            System.out.println("\n-------------------------------\n");
                        }
                    }
                }
            }
<<<<<<< HEAD
            while (this.wagon_list.size() != this.wagon_And_product.size());
        }
        else if (this.wagon_list.size() > product_list_value.size())
        {
            System.out.println("Мало продуктов!\nЗагрузка невозможна");
        }
        else if (this.wagon_list.isEmpty())
        {
            System.out.println("Нет вагонов!\nЗагрузка невозможна");
        }
=======
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
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    }
    
    public void wagonAndProductToString()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("\nСписок ж/д состава и его продукции: \n");
        System.out.println("\n-------------------------------\n");
        ArrayList<Wagon> keys = new ArrayList<>(wagon_And_product.keySet());
        ArrayList<Product> values = new ArrayList<>(wagon_And_product.values());
       
        int order = 1;
       
<<<<<<< HEAD
        if (this.wagon_And_product.size() == 0)
        {
            System.out.println("Ж/Д состав пустой!");
            System.out.println("\n-------------------------------\n");
        }
    
=======
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
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
<<<<<<< HEAD
    
    public void trainOutput(String path, boolean debug, Logger logger)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(new File(path + "Train.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (Wagon wagon : this.wagon_list)
            {
                oos.writeObject(wagon);
            }
            
            oos.close();
            fos.close();
        }
        catch (IOException e)
        {
            if(debug)
            {
                System.out.println('\n');
                logger.log(Level.SEVERE, "Exception {0}", e.getMessage());
                System.out.println('\n');
            }
        }
    }
    
    public void trainInput(String path, boolean debug, Logger logger)  
    {
        try
        {
            FileInputStream fis = new FileInputStream(new File(path + "Train.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Wagon obj = null;
            while ((obj = (Wagon)ois.readObject()) != null)
            {
                this.wagon_list.add(obj);
                this.train_length++;
            }
            
            fis.close();
            ois.close();
        }
        
        catch (IOException | ClassNotFoundException e)
        {
            if (debug)
            {
                System.out.println('\n');
                logger.log(Level.SEVERE, "Exception {0}", e.getMessage());
                System.out.println('\n');
            }
            
            System.out.println("Ошибка: " +  e.getMessage());
        }
    }
    
    public void changeWagonInTrain(boolean debug, Logger logger)
    {   
        for (Wagon wag : this.wagon_list)
        {
            int check_number = -1;
            System.out.println("\n-------------------------------\n");
            System.out.println("Введите номер изменяемого вагона: ");
            
            do
            {
                check_number = IntCheck();
            }   while (check_number <= 0 || check_number > this.wagon_list.size());
        
            if (debug)
            {
                System.out.println('\n');
                logger.info("Changing wagon with number - " + wag.getNumber());
                System.out.println('\n');
            }
                                
            System.out.println("\n-------------------------------\n");
            System.out.println("Изменим данные вагона");
            
            if (wag.getNumber() == check_number)
            {
                if (wag instanceof ContainerWagon)
                {
                    ContainerWagon temp = new ContainerWagon();
                    ((ContainerWagon) wag).setContainerCouunt(temp.getContainerCount());
                    break;
                }
                if (wag instanceof LiquidWagon)
                {   
                    LiquidWagon temp = new LiquidWagon(); 
                    ((LiquidWagon) wag).setLiquidAmount(temp.getLiquidAmount());
                    break;
                }
                if (wag instanceof BulkCargoWagon)
                {
                    BulkCargoWagon temp = new BulkCargoWagon();
                    ((BulkCargoWagon) wag).setLiquidType(temp.getLiquidType());
                    break;
                }
                if (wag instanceof CarWagon)
                {
                    CarWagon temp = new CarWagon();
                    ((CarWagon) wag).setCarPossibleCount(temp.getCarPossibleCount());
                    break;
                }
            }
        }
    }
    
    public void deleteWagonInTrain(boolean debug, Logger logger)
    {  
        int check_number = -1;
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите номер удаляемого вагона: ");
        
        do
        {
            check_number = IntCheck();
        }   while (check_number <= 0 || check_number > this.wagon_list.size());
        
        for (Wagon wag : this.wagon_list)
        {
            if (wag.getNumber() == check_number)
            {
                if (debug)
                {
                    System.out.println('\n');
                    logger.info("Delete wagon with number - " + wag.getNumber());
                    System.out.println('\n');
                }
                
                this.wagon_And_product.remove(wag);
                this.wagon_list.remove(wag);
            }
            break;
        }
    }
    
    protected Train(String tr_n_v, int tr_l_v, ArrayList<Wagon> wag_l_v)
    {
        this.train_name = tr_n_v;
        this.train_length = tr_l_v;
        this.wagon_list = wag_l_v;   
=======

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
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
    }
    
    public void listToString ()
    {
        System.out.println(this.toString());
<<<<<<< HEAD
        for(Wagon wagon_list1 : this.wagon_list) 
=======
        for (Wagon wagon_list1 : this.wagon_list) 
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
        {
            System.out.println(wagon_list1.toString());
        }
    }
    
    @Override
    public String toString()
    {
        return "\nНазвание поезда: " + train_name + " Длина поезда: " + train_length + "\n";
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 3a9d30eac2934ed5cb1bbda21a4db3d6fa387bed
