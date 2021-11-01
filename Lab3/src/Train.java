package Lab3;

import static Lab3.CheckFunctions.*;
import static Lab3.ListOfMenues.wagonLoadMenu;
import java.io.*;
import java.util.logging.*;
import java.util.*;

/** 
 * Класс поезда со свойствами <b>train_name</b> и <b>train_length</b> и <b>wagon_list<b> и <b>wagon_And_product<b>.
 * @author Тегин Александр
 * @version 1.0
*/
public class Train implements Serializable
{
    /** Поле названия поезда */
    private String train_name;
    /** Поле длины поезда */
    private int train_length;
    /** Поле списка вагонов */
    private ArrayList<Wagon> wagon_list = new ArrayList<Wagon>();
    /** Поле вагонов с продуктами */
    private HashMap<Wagon, Product> wagon_And_product = new HashMap<>();
    
     /**
     * Процедура определения названия поезда {@link Train#train_name}
     * @param train_name_value - название поезда
     */
    public void setTrainName (String train_name_value)
    {
        this.train_name = train_name_value;
    }
    
     /**
     * Процедура определения длины поезда {@link Train#train_length}
     * @param train_length_value - длина поезда
     */
    public void setTrainLength (int train_length_value)
    {
        this.train_length = train_length_value;
    }
    
     /**
     * Процедура определения списка вагонов {@link Train#wagon_list}
     * @param wagon_list_value - список вагонов
     */
    public void setWagonList(ArrayList<Wagon> wagon_list_value)
    {
       for(Wagon wagon: wagon_list_value)
       {
           this.wagon_list.add(wagon);
       }
    }
    
     /**
     * Функция получения значения поля {@link Train#train_name}
     * @return название поезда
     */
    public String getTrainName ()
    {
        return train_name;
    }
    
     /**
     * Функция получения значения поля {@link Train#train_length}
     * @return длина поезда
     */
    public int getTrainLength ()
    {
        return train_length;
    }
    
     /**
     * Функция получения значения поля {@link Train#wagon_list}
     * @return список вагонов
     */
    public ArrayList<Wagon> getWagonList ()
    {
        return wagon_list;
    }
    
     /**
     * Функция добавления вагонов в список вагонов поезда
     */
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
    
     /**
     * Процедура сопоставления вагонов и их продуктов
     * @param product_list_value - список вагонов и их продуктов
     */
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
                        System.out.println("\n-------------------------------\n");
                    } 
                    else 
                    {                       
                        continue;
                    }
                    
                    for (Wagon wagon : this.wagon_list) 
                    {
                        if (!wagon_And_product.containsKey(wagon))
                        {
                            System.out.println("Поместить продукцию в данный вагон? \n 1 - Да \n 2 - Нет \n");
                            System.out.println("\n-------------------------------\n");
                            System.out.println(wagon.toString());
                            System.out.println("\n-------------------------------\n");
                            
                            do
                            {
                                num = IntCheck();
                            }
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
                                }
                            }
                        } 
                        else 
                        {
                            System.out.println("Вагон " + wagon.getNumber() + " занят! \n");
                            System.out.println("\n-------------------------------\n");
                        }
                    }
                }
            }
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
    }
    
     /**
     * Текстовое описание вагонов и их продуктов
     */
    public void wagonAndProductToString()
    {
        System.out.println("\n-------------------------------\n");
        System.out.println("\nСписок ж/д состава и его продукции: \n");
        System.out.println("\n-------------------------------\n");
        ArrayList<Wagon> keys = new ArrayList<>(wagon_And_product.keySet());
        ArrayList<Product> values = new ArrayList<>(wagon_And_product.values());
       
        int order = 1;
       
        if (this.wagon_And_product.size() == 0)
        {
            System.out.println("Ж/Д состав пустой!");
            System.out.println("\n-------------------------------\n");
        }
    
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
    
     /**
     * Процедура сохранения списка вагонов поезда в файл
     * @param path - путь к файлу сохранения
     * @param debug - логическая переменная записи в лог(писать\не писать)
     * @param logger - лог
     */
    public void trainOutput(String path, boolean debug, Logger logger)
    {
         /**
         * В данном блоке проходит проверка на корректный доступ к данным
         * @exception IOException неверный доступ к данным
         */
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
    
     /**
     * Процедура загрузки списка вагонов в поезд из файла
     * @param path - путь к файлу загрузки
     * @param debug - логическая переменная записи в лог(писать\не писать)
     * @param logger - лог
     */
    public void trainInput(String path, boolean debug, Logger logger)  
    {
         /**
         * В данном блоке проходит проверка на корректный доступ к данным и сбой вызова загрузки класса с использованием его строкового имени
         * @exception IOException неверный доступ к данным
         * @exception ClassNotFoundExceptionn сбой вызова загрузки класса с использованием его строкового имени
         */
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
    
     /**
     * Процедура изменения данных вагонов поезда
     * @param debug - логическая переменная записи в лог(писать\не писать)
     * @param logger - лог
     */
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
                    ((BulkCargoWagon) wag).setBulkCargoAmount(temp.getBulkCargoAmount());
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
    
     /**
     * Процедура удаления вагонов из поезда
     * @param debug - логическая переменная записи в лог(писать\не писать)
     * @param logger - лог
     */
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
    
     /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param tr_n_v - название поезда
     * @param tr_l_v - длина поезда
     * @param wag_l_v - список вагонов
     */
    protected Train(String tr_n_v, int tr_l_v, ArrayList<Wagon> wag_l_v)
    {
        this.train_name = tr_n_v;
        this.train_length = tr_l_v;
        this.wagon_list = wag_l_v;   
    }
    
     /** 
     * Перечисление всего списка вагонов
     */
    public void listToString ()
    {
        System.out.println(this.toString());
        for(Wagon wagon_list1 : this.wagon_list) 
        {
            System.out.println(wagon_list1.toString());
        }
    }
    
     /** 
     * Текстовое описание склада
     */
    @Override
    public String toString()
    {
        return "\nНазвание поезда: " + train_name + " Длина поезда: " + train_length + "\n";
    }
}
