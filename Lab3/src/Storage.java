package Lab3;

import static Lab3.CheckFunctions.IntCheck;
import static Lab3.ListOfMenues.productLoadMenu;
import java.util.*;
import java.io.*;
import java.util.logging.*;

/** 
 * Класс склада со свойствами <b>storage_adress</b> и <b>storage_area</b>  и <b>product_list<b>.
 * @autor Тегин Александр
 * @version 1.0
*/
public class Storage implements Serializable
{
    /** Поле адресса склада */
    private String storage_adress;
    /** Поле площади склада */
    private double storage_area;
    /** Поле списка продуктов */
    private ArrayList<Product> product_list = new ArrayList<>();
    
    /**
     * Процедура определения адресса склада {@link Storage#storage_adress}
     * @param storage_adress_value - адресс склада
     */
    public void setStorageAdress (String storage_adress_value)
    {
        this.storage_adress = storage_adress_value;
    }

    /**
     * Процедура площади склада {@link Storage#storage_area}
     * @param storage_area_value - площадь склада
     */
    public void setStorageArea (double storage_area_value)
    {
        this.storage_area = storage_area_value;
    }
    
    /**
     * Процедура определения списка продуктов {@link Storage#product_list}
     * @param product_list_value - список продуктов
     */
    public void setProductList (ArrayList<Product> product_list_value)
    {
        for (Product product_list_value1 : product_list_value) 
        {
            this.product_list.add(product_list_value1);
        }
    }
    
    /**
     * Функция получения значения поля {@link Storage#storage_adress}
     * @return адресс склада
     */
    public String getStorageAdress ()
    {
        return storage_adress;
    }

    /**
     * Функция получения значения поля {@link Storage#storage_area}
     * @return площадь склада
     */
    public double getStorageArea ()
    {
        return storage_area;
    }
    
    /**
     * Функция получения значения поля {@link Storage#product_list}
     * @return список продуктов
     */
    public ArrayList<Product> getProductList ()
    {
        return product_list;
    }
  
    /**
     * Процедура добавления продукта в список
     */
    public void addToProductList()
    {
        int global_count;
        
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите количество продуктов: ");
        
        do
        {
            global_count = IntCheck();
        }   while (global_count < 0 || global_count >= 100);
        
        int case_num;
        for (int i = 0; i < global_count; i++)
        {
            System.out.println("\nКакого типа новый продукт ?\n");
            productLoadMenu();
            do
            {
                case_num = IntCheck();
            }   while (case_num <= 0 || case_num > 4);
            
            switch(case_num)
            {
                case(1):
                {
                    this.product_list.add(new ProductContainer());
                    break;
                }
                case(2):
                {
                    this.product_list.add(new ProductLiquid());
                    break;
                }
                case(3):
                {
                    this.product_list.add(new ProductBulkCargo());
                    break;
                }
                case(4):
                {
                    this.product_list.add(new ProductCar());
                    break;
                }
            }
        }
        System.out.println("\n-------------------------------\n");
    }
    
     /**
     * Процедура сохранения списка продуктов слкада в файл
     * @param path - путь к файлу сохранения
     * @param debug - логическая переменная записи в лог(писать\не писать)
     * @param logger - лог
     */
    public void storageOutput(String path,boolean debug, Logger logger)
    {
         /**
         * В данном блоке проходит проверка на корректный доступ к данным
         * @exception IOException неверный доступ к данным
         */
        try
        {
            FileOutputStream fos = new FileOutputStream(new File(path + "Storage.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (Product product: this.product_list)
            {
                oos.writeObject(product);
            }
            
            oos.close();
            fos.close();
        }
        catch (IOException e)
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
     * Процедура загрузки списка продуктов в слкад из файла
     * @param path - путь к файлу загрузки
     * @param debug - логическая переменная записи в лог(писать\не писать)
     * @param logger - лог
     */
    public void storageInput(String path,boolean debug, Logger logger)
    {
         /**
         * В данном блоке проходит проверка на корректный доступ к данным и сбой вызова загрузки класса с использованием его строкового имени
         * @exception IOException неверный доступ к данным
         * @exception ClassNotFoundExceptionn сбой вызова загрузки класса с использованием его строкового имени
         */
        try
        {
            FileInputStream fis = new FileInputStream(new File(path + "Storage.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Product obj = null;
            while ((obj = (Product)ois.readObject()) != null)
            {
                this.product_list.add(obj);
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
     * Процедура изменения данных продукта склада
     * @param debug - логическая переменная записи в лог(писать\не писать)
     * @param logger - лог
     */
    public void changeProductInTrain(boolean debug, Logger logger)
    {
        for (Product product : this.product_list)
        {
            int check_number = -1;
            System.out.println("\n-------------------------------\n");
            System.out.println("Введите ID изменяемого продукта: ");
            
            do
            {
                check_number = IntCheck();
            }   while (check_number <= 0 || check_number > 1000000000);
            
            if (debug)
            {
                System.out.println('\n');
                logger.info("Changing product with ID - " + product.getSpecialID());
                System.out.println('\n');
            }
                                
            System.out.println("\n-------------------------------\n");
            System.out.println("Изменим данные продукта");
            
            if ( product.getSpecialID() == check_number )
            {
                if (product instanceof ProductContainer)
                {
                    ProductContainer temp = new ProductContainer();
                    ((ProductContainer) product).setContainerAmount(temp.getContainerAmount());
                    ((ProductContainer) product).setContainerType(temp.getContainerType());
                    product.setProdWeight(temp.getProdWeight());
                    break;
                }
                if (product instanceof ProductLiquid)
                {
                    ProductLiquid temp = new ProductLiquid(); 
                    product.setProdWeight(temp.getProdWeight());
                    ((ProductLiquid) product).setLiquidTupe(temp.getLiquidType());
                    ((ProductLiquid) product).setLiquidLiters(temp.getLiquidLiters());
                    break;
                }
                if (product instanceof ProductBulkCargo)
                {
                    ProductBulkCargo temp = new ProductBulkCargo();
                    product.setProdWeight(temp.getProdWeight());
                    ((ProductBulkCargo) product).setBulkCargoType(temp.getBulkCargoType());
                    ((ProductBulkCargo) product).setBulkCargoDensity(temp.getBulkCargoDensity());
                    break;
                }
                if (product instanceof ProductCar)
                {
                    ProductCar temp = new ProductCar();
                    product.setProdWeight(temp.getProdWeight());
                    ((ProductCar) product).setCarName(temp.getCarName());
                    ((ProductCar) product).setCarPrice(temp.getCarPrice());
                    ((ProductCar) product).setCarType(temp.getCarType());
                    break;
                }
            }
        }
    }
    
     /**
     * Процедура удаления продукта со склада
     * @param debug - логическая переменная записи в лог(писать\не писать)
     * @param logger - лог
     */
    public void deleteProductInStorage(boolean debug, Logger logger)
    {   
        int check_number = -1;
        System.out.println("\n-------------------------------\n");
        System.out.println("Введите ID удаляемого продукта: ");
        
        do
        {
            check_number = IntCheck();
        }   while (check_number <= 0 || check_number > 100000000);
        
        for (Product prod : this.product_list)
        {
            if (prod.getSpecialID() == check_number)
            {
                if (debug)
                {
                    System.out.println('\n');
                    logger.info("Delete product with ID - " + prod.getSpecialID());
                    System.out.println('\n');
                }
                
                this.product_list.remove(prod);
            }
            break;
        }
    }
    
     /** 
     * Конструктор - создание нового объекта с определенными значениями
     * @param strg_ad_v - адресс склада
     * @param strg_a_v - площадь склада
     * @param prod_l_v - список продуктов
     */
    protected Storage (String strg_ad_v, double strg_a_v, ArrayList<Product> prod_l_v)
    {
        this.storage_adress = strg_ad_v;
        this.storage_area = strg_a_v;
        this.product_list = prod_l_v;
    }
    
     /** 
     * Перечисление всего списка продуктов
     */
    public void listToString ()
    {
        System.out.println(this.toString());
        for (Product product_list1 : this.product_list) 
        {
            System.out.println(product_list1.toString());
        }
    }
    
     /** 
     * Текстовое описание склада
     */
    @Override
    public String toString()
    {
        return "\nАдресс склада: " + storage_adress + " Площадь склада: " + storage_area + "\n";
    }
}
