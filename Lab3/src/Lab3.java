package Lab3;

import static Lab3.CheckFunctions.*;
import static Lab3.ListOfMenues.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;

/** 
 * Main class программы
 * @autor Тегин Александр
 * @version 1.0
*/
public class Lab3 
{  
    /** Поле расположения главной директории*/
    public static final String PATH_TO_MAIN_DIR = "/Users/aleksandrtegin/Desktop/JavaLabs/Lab3/src/main/java/Lab3/";
    
     /**
     * main 
     * @param args - аргументы командной строки
     */
    public static void main(String args[]) 
    {
        Logger logger = Logger.getLogger("Lab3"); 
        FileHandler handler;  
        
         /**
         * В данном блоке проходит проверка на корректный доступ к данным и разрешения, необходимые для доступа к ресурсу.
         * @exception IOException неверный доступ к данным
         * @exception SecurityException не имеет разрешений, необходимых для доступа к ресурсу.
         */
        try 
        {   
            boolean append = true;
            handler = new FileHandler(PATH_TO_MAIN_DIR + "MyLogFile.log", append);  
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();  
            handler.setFormatter(formatter);  
        } 
        catch (SecurityException | IOException e)
        {  
            e.getMessage();  
        }
        
        FileInputStream fileInputStream;
        Properties prop = new Properties();
        
         /**
         * В данном блоке проходит проверка на корректный доступ к данным
         * @exception IOException неверный доступ к данным
         */
        try 
        {
            fileInputStream = new FileInputStream(PATH_TO_MAIN_DIR + "config.properties" );
            prop.load(fileInputStream);
 
            String login = prop.getProperty("Login");
            String password = prop.getProperty("Password");
            String userGroup = prop.getProperty("UserGroup");
            String debugMode = prop.getProperty("DebugMode");
            String autotestMode = prop.getProperty("AutotestMode");

            System.out.println("User: " + login + '\n' + "Password: " + password + '\n' + "UserGroup: " + userGroup + '\n' + "DebugMode: " + debugMode + '\n' + "AutotestMode: " + autotestMode + '\n');
            System.out.println("\nHello user: " + login + '\n');
            
            if (prop.getProperty("DebugMode").equals("true"))
            {
                System.out.println('\n');
                logger.info("-------Start of Log-----");
                System.out.println('\n');
                logger.config("Read config file");
                System.out.println('\n');
                logger.log(Level.INFO, "Programm start by user: {0}", login);
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
                logger.log(Level.SEVERE, "Exception{0}", e.getMessage());
                System.out.println('\n');
            }
        }
        
        boolean debug;
        boolean autotest;
        
        debug = prop.getProperty("DebugMode").equals("true");
        autotest = prop.getProperty("AutotestMode").equals("true");
        
        Train global_train = new Train("РЖД Общий", 1000, new ArrayList<Wagon>());
        Storage global_strg = new Storage("(Основной склад) ул. Пушкина д. Колотушкина 228", 5425.75, new ArrayList<Product>());
        
        int case_number;
        
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
                }   while (case_number <= 0 || case_number > 7);
            }
            else
            {
                do
                {
                    case_number = IntCheck();
                }   while (case_number <= 0 || case_number > 9);
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
                    
                    System.out.println("Заполним список вагонов: ");
                    global_train.addToWagonList();
                    System.out.println("Заполним список продукции: ");
                    global_strg.addToProductList();

                    global_train.setWagonAndProduct(global_strg.getProductList());
                    global_train.wagonAndProductToString();
                    
                    break;
                }
                
                case(2):
                {
                    if (debug)
                    {
                        System.out.println('\n');
                        logger.info("Output our database");
                        System.out.println('\n');
                    }

                    global_train.trainOutput(PATH_TO_MAIN_DIR,debug,logger);

                    global_strg.storageOutput(PATH_TO_MAIN_DIR, debug, logger);
                    
                    break;
                }
                
                case(3):
                {
                    if (debug)
                    {
                        System.out.println('\n');
                        logger.info("Input our database from file");
                        System.out.println('\n');
                    }
                    
                    global_train.trainInput(PATH_TO_MAIN_DIR, debug, logger);
                    global_strg.storageInput(PATH_TO_MAIN_DIR, debug, logger);
                    
                    global_train.setWagonAndProduct(global_strg.getProductList());
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
                    int change = -1;

                    System.out.println("Что хотите поменять?\n1 - Вагон\n2 - Продукт\n");
                        
                    do
                    {
                        change = IntCheck();
                    }   while (change <= 0 || change > 2);
                    
                    switch(change)
                    {
                        case(1):
                        {
                            global_train.changeWagonInTrain(debug, logger);
                            break;
                        }
                        case(2):
                        {
                            global_strg.changeProductInTrain(debug, logger);
                            break;
                        }
                    }
                    
                    break;
                }
                
                case(6):
                {
                    int change = -1;

                    System.out.println("Что хотите удалить?\n1 - Вагон\n2 - Продукт\n");
                        
                    do
                    {
                        change = IntCheck();
                    }   while (change <= 0 || change > 2);
                    
                    switch(change)
                    {
                        case(1):
                        {
                            global_train.listToString();
                            global_train.deleteWagonInTrain(debug, logger);
                            global_train.listToString();
                            break;
                        }
                        case(2):
                        {
                            global_strg.listToString();
                            global_strg.deleteProductInStorage(debug, logger);
                            global_strg.listToString();
                            break;
                        }
                    }
                    
                    break;
                }
                
                case(7):
                {
                    if (debug)
                    {
                        System.out.println('\n');
                        logger.info("Exit of programm");
                        System.out.println('\n');
                    }
                    
                    break;
                }
                
                case(8):
                { 
                    debug = !debug;
                    System.out.println("Debug ->" + debug + '\n');
                    
                    if (debug)
                    {
                        System.out.println('\n');
                        logger.log(Level.INFO, "DebugMode changed to {0}", debug);
                        System.out.println('\n');
                    }
                    
                    break;
                }
                
                case(9):
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
        }   while (case_number != 7 );
    }
}
