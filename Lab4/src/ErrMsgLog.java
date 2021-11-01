package lab4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

/** 
 * Класс логгера для ошибок со свойствами <b>PATH_TO_MAIN_DIR</b>,<b>ErrList</b>,<b>log</b> и <b>errhnd</b>
 * @author Тегин Александр
 * @version 1.0
*/
public class ErrMsgLog {
    
    /** 
     * Поле пути к корневой папке
     */
    public static final String PATH_TO_MAIN_DIR = "/Users/aleksandrtegin/Desktop/JavaLabs/Lab4/src/main/java/lab4/";
    /** 
     * Поле массива для хранения списка ошибок
     */
    private static ArrayList <Exception> ErrList;
    /** 
     * Поле лога 
     */
    private static Logger log;
    /** 
     * Поле захвата файла, где будет храниться лог информация 
     */
    private static FileHandler errhnd;
    
    /** 
     * Конструктор - создание нового объекта
     */
    public ErrMsgLog()
    {
        /**
         * В данном блоке проходит проверка на корректный доступ к данным
         * @exception IOException неверный доступ к данным
         */
        try
        {
            ErrList = new ArrayList();
            log = Logger.getLogger(ErrMsgLog.class.getName());
            boolean append = true;
            errhnd = new FileHandler(PATH_TO_MAIN_DIR + "MyLogFile.log", append);
            log.addHandler(errhnd);
            errhnd.setFormatter(new SimpleFormatter());
        }
        catch (IOException e)
        {
            ErrList.add(e);
            log.log(Level.WARNING, e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    /**
    * Процедура добавления ошибки в список ошибок
    * @param e - ошибка
    * @return кол-во ошибок
     */
    public int addErr(Exception e) 
    {
        ErrList.add(e);
        return ErrList.size();
    }
    
    /**
    * Процедура добавления ошибки в список ошибок и в лог
    * @param e - ошибка
    * @return кол-во ошибок
     */
    public int addErrWithLog(Exception e) 
    {
        ErrList.add(e);
        //Код записи сообщения в лог
        log.log(Level.WARNING, e.getMessage());
        return ErrList.size();
    }
    
    /**
     * Процедура получения кол-ва ошибок
     * @return кол-во ошибок
     */
    public int getErrCount() 
    {
        return ErrList.size();
    }
    
    /**
     * Процедура вывода сообщение об ошибке
     * @param e - ошибка
     */
    public void showErrText(Exception e)
    {
        System.err.println(e.getMessage());
    }

    /**
     * Процедура генерации (пробрасывание ошибки) с фиксацией в списке ошибок
     * @param e - ошибка
     * @return конструктор нашей ошибки
     */
    public Exception makeErr(Exception e) 
    {
        addErr(e);
        return new Exception(e);
    }
}
