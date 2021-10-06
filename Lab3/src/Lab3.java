/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import static Lab3.CheckFunctions.*;
import static Lab3.ListOfMenues.*;
import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author aleksandrtegin
 */
public class Lab3 
{  
    public static final String PATH_TO_MAIN_DIR = "/home/runner/MIETJava/Lab3/";

    public static void main(String args[]) 
    {
      Logger logger = Logger.getLogger("Lab3"); 
      FileHandler handler;  
        
      try 
      {  
      // This block configure the logger with handler and formatter  
      boolean append = true;
      handler = new FileHandler(PATH_TO_MAIN_DIR + "MyLogFile.log", append);  
      logger.addHandler(handler);
      SimpleFormatter formatter = new SimpleFormatter();  
      handler.setFormatter(formatter);  
      } 

      catch (SecurityException e)
      {  
        e.getMessage();  
      }
      catch (IOException e)
      {  
        e.getMessage();  
      }
        

      FileInputStream fileInputStream;
      //инициализируем специальный объект Properties
      //типа Hashtable для удобной работы с данными
      Properties prop = new Properties();
      try 
      {
        //обращаемся к файлу и получаем данные

        fileInputStream = new FileInputStream(PATH_TO_MAIN_DIR + "config.properties" );
        prop.load(fileInputStream);
 
        String login = prop.getProperty("Login");
        String password = prop.getProperty("Password");
        String userGroup = prop.getProperty("UserGroup");
        String debugMode = prop.getProperty("DebugMode");
        String autotestMode = prop.getProperty("AutotestMode");
 
        //печатаем полученные данные в консоль
        System.out.println("User: " + login + '\n' + "Password: " + password + '\n' + "UserGroup: " + userGroup + '\n' + "DebugMode: " + debugMode + '\n' + "AutotestMode: " + autotestMode + '\n');
        System.out.println("\nHello user: " + login + '\n');


        if (prop.getProperty("DebugMode").equals("true"))
        {
          System.out.println('\n');
          logger.info("-------Start of Log-----");
          System.out.println('\n');
          logger.config("Read config file");
          System.out.println('\n');
          logger.info("Programm start by user: " + login);
          System.out.println('\n');
        }
      } 
      catch (IOException e) 
      {
        System.out.println("Ошибка в программе: файл " + PATH_TO_MAIN_DIR + "config.properties" + " не обнаружено");
        e.getMessage();

        if (prop.getProperty("DebugMode").equals("true"))   
        {
          System.out.println('\n');
          logger.severe("Exception" + e.getMessage());
          System.out.println('\n');
        }
      }
        
      boolean debug;
      boolean autotest;
        
      if (prop.getProperty("DebugMode").equals("true"))
        debug = true;
      else
        debug = false;
        
      if (prop.getProperty("AutotestMode").equals("true"))
        autotest = true;
      else
        autotest = false;
        
      int case_number;
        
      Wagon[] global_wag = new Wagon[0];
      Train global_train = new Train("РЖД Общий", 1000, global_wag);
      Product[] global_prod = new Product[0];
      Storage global_strg = new Storage("(Основной склад) ул. Пушкина д. Колотушкина 228", 5425.75, global_prod);
        
      do
      {
        if (prop.getProperty("UserGroup").equals("user"))
        {
          userMenu();
        }
        else if (prop.getProperty("UserGroup").equals("root"))
        {
          rootMenu();
        }
          
        if (prop.getProperty("UserGroup").equals("user"))
        {
          do
          {
            case_number = IntCheck();
          }while (case_number <= 0 || case_number > 5);
        }
        else
        {
          do
          {   
            case_number = IntCheck();
          }while (case_number <= 0 || case_number > 7);
        }
                                            
      switch(case_number)
      {   
        case(1):
        {
          if (debug)
          {
            System.out.println('\n');
            logger.info("Add new wagons and products");
            System.out.println('\n');
          }

          int global_count;
                
          System.out.println("\n-------------------------------\n");
          System.out.println("Введите количество вагонов и продуктов: ");
                
          do
          {
            global_count = IntCheck();
          }
          while (global_count <= 0 || global_count >= 100);
                
          Wagon[] wag = new Wagon[global_count];
                
          System.out.println("\n-------------------------------\n");
          System.out.println("\nЗаполним список вагонов: ");
                
          for (int i = 0; i < wag.length; i++)
          {
            int case_num;
                    
            System.out.println("\n-------------------------------\n");
            System.out.println("\nКакого типа вагон " + (i+1) + "?\n");
                    
            wagonLoadMenu();
                    
            do
            {
              case_num = IntCheck();
            } while (case_num <= 0 || case_num > 4);
                    
            switch(case_num)
            {
              case(1):
              {
                wag[i] = new ContainerWagon();
              }
              case(2):
              {
                wag[i] = new LiquidWagon();
              }
              case(3):  
              {
                wag[i] = new BulkCargoWagon();
              }
              case(4):
              {
                wag[i] = new CarWagon();
              }
            }
          }

          System.out.println("\n-------------------------------\n");
                
          global_wag = Arrays.copyOf(global_wag, global_wag.length + wag.length);
          System.arraycopy(wag, 0, global_wag, global_train.getWagonList().length, wag.length);
                
          global_train.setWagonList(global_wag);
                
          Train rzd_train = new Train("РЖД Грузовой дополнительный", global_count, wag);
          System.out.println("\nСписок вагонов доп. ж/д состава:\n");
          System.out.println("\n-------------------------------\n");
          rzd_train.listToString();
          System.out.println("\n-------------------------------\n");
                
          Product[] prod = new Product[global_count];
          System.out.println("Заполним список продукции: ");
          for (int i = 0; i < global_count; i++)
          {
            int case_num;
                    
            productLoadMenu();
            
                do
                {
                  case_num = IntCheck();
                } while (case_num <= 0 || case_num > 4);
            
                switch(case_num)
                {
                  case(1):                 
                  {
                    prod[i] = new ProductContainer();
                  }
                  case(2):                 
                  {
                    prod[i] = new ProductLiquid();
                  }
                  case(3):                
                  {
                    prod[i] = new ProductBulkCargo();
                  }
                  case(4):                 
                  {
                    prod[i] = new ProductCar();
                  }
                }
              }
              System.out.println("\n-------------------------------\n");
        
              global_prod = Arrays.copyOf(global_prod, global_prod.length + prod.length);
              System.arraycopy(prod, 0, global_prod, global_strg.getProductList().length, prod.length);
                
              global_strg.setProductList(global_prod);
                
              Storage rzd_strg = new Storage("(Доп склад) ул. Пушкина д. Колотушкина 29", 5425.75, prod);
              System.out.println("\nСписок продукции на доп. складе:\n");
              System.out.println("\n-------------------------------\n");
              rzd_strg.listToString();
              System.out.println("\n-------------------------------\n");
        
              global_train.setWagonAndProduct(global_wag, global_prod);
              global_train.wagonAndProductToString();

              break;
          }
            
          case(2):
          {
            if (debug)
            {
              // Запись объектов в файл
              System.out.println('\n');
              logger.info("Output our database");
              System.out.println('\n');
            }

            try
            {
              FileOutputStream fos = new FileOutputStream(new File(PATH_TO_MAIN_DIR + "WagonObjects.txt"));
              ObjectOutputStream oos = new ObjectOutputStream(fos);

              for (int i = 0; i < global_train.getWagonList().length; i++)
              {
                oos.writeObject(global_wag[i]);
              }

              oos.close();
              fos.close();
            }
            catch (IOException e)
            {
              if (prop.getProperty("DebugMode").equals("true"))
              {
              System.out.println('\n');
              logger.severe("Exception " + e.getMessage());
              System.out.println('\n');
              }

              System.out.println("Ошибка: " +  e.getMessage());
            }
                
            try 
            {
              FileOutputStream fos = new FileOutputStream(new File(PATH_TO_MAIN_DIR + "ProductObjects.txt"));
              ObjectOutputStream oos = new ObjectOutputStream(fos);
                    
              // Запись объектов в файл
              for (int i = 0; i < global_strg.getProductList().length; i++)
              {
                oos.writeObject(global_prod[i]);
              }

              oos.close();
              fos.close();
              }

              catch (IOException e)
              {
                if (prop.getProperty("DebugMode").equals("true"))
                {
                System.out.println('\n');
                logger.severe("Exception " + e.getMessage());
                System.out.println('\n');
                }

                System.out.println("Ошибка: " +  e.getMessage());
              }

              break;
          }
            
        case(3):
        {
          if (debug)
          {
          // Чтение объектов из файла
          System.out.println('\n');
          logger.info("Input our database");
          System.out.println('\n');
          }

          try
          {
            FileInputStream fis = new FileInputStream(new File(PATH_TO_MAIN_DIR + "WagonObjects.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
                    
            Wagon obj = null;
            int count = 0;
                    
            while ((obj = (Wagon)ois.readObject()) != null)
            {
              global_wag = Arrays.copyOf(global_wag, global_wag.length + 1);
              global_wag[count] = obj;
              count++;
            }
                    
            fis.close();
            ois.close();
          }
            
          catch (IOException | ClassNotFoundException e)
          {
            if (debug)
            {
            System.out.println('\n');
            logger.severe("Exception " + e.getMessage());
            System.out.println('\n');
            }

            System.out.println("Ошибка: " +  e.getMessage());
          }
                
          try
          {
            FileInputStream fis = new FileInputStream(new File(PATH_TO_MAIN_DIR + "ProductObjects.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
                    
            Product obj = null;
            int count = 0;
                    
            while ((obj = (Product)ois.readObject()) != null)
            {
              global_prod = Arrays.copyOf(global_prod, global_prod.length + 1);
              global_prod[count] = obj;
              count++;
            }

            fis.close();
            ois.close();
          }

          catch (IOException | ClassNotFoundException e)
          {
            if (debug)
            {
            System.out.println('\n');
            logger.severe("Exception " + e.getMessage());
            System.out.println('\n');
            }

            System.out.println("Ошибка: " +  e.getMessage());
          }
                
          global_train.setWagonList(global_wag);
          global_strg.setProductList(global_prod);
                
          global_train.setWagonAndProduct(global_wag, global_prod);
          global_train.wagonAndProductToString();

          break;
        }
            
        case(4):
        {
          if (debug)
          {
          System.out.println('\n');
          logger.info("Database print");
          System.out.println('\n');
          }

          global_train.wagonAndProductToString();

          break;
        }
            
        case(5):
        {
          if (debug)
          {
          System.out.println('\n');
          logger.info("Exit of programm");
          System.out.println('\n');
          }

          break;
        }
            
        case(6):
        { 
          debug = !debug;
          System.out.println("Debug ->" + debug + '\n');

          if (debug)
          {
          System.out.println('\n');
          logger.info("DebugMode changed to " + debug);
          System.out.println('\n');
          }

          break;
        }
            
        case(7):
        {
          autotest = !autotest;
          System.out.println("Autotest ->" + debug + '\n');

          if (debug)
          {
          System.out.println('\n');
          logger.info("AutotestMode changed to " + debug);   
          System.out.println('\n');  
          }   

          break;        
        }
      }
    } 
    while (case_number != 5 ); 
  }
}