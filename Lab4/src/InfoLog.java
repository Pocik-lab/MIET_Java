package lab4;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/** 
 * Класс логгера для информации со свойствами <b>PATH_TO_MAIN_DIR</b>,<b>log</b> и <b>hnd</b>
 * @author Тегин Александр
 * @version 1.0
*/
public class InfoLog {
        
    /** 
     * Поле пути к корневой папке
     */
    public static final String PATH_TO_MAIN_DIR = "/Users/aleksandrtegin/Desktop/JavaLabs/Lab4/src/main/java/lab4/";
    /** 
     * Поле лога
     */
    private static Logger log;
    /** 
     * Поле захвата файла, где будет храниться лог информация
     */
    private static FileHandler hnd;
    
    /** 
     * Конструктор - создание нового объекта
     * @param myerr_v - лог для ошибок
     */
    public InfoLog(ErrMsgLog myerr_v)
    {
        /**
         * В данном блоке проходит проверка на некую ошибку
         * @exception Exception какой-то из видов ошибок
         */
        try
        {
            log = Logger.getLogger(InfoLog.class.getName());
        }
        catch (Exception e)
        {
            myerr_v.addErrWithLog(e);
        }
    }
    
    /** 
     * Процедура добавления ошибки в лог
     * @param s - информация
     */
    public void strToLog(String s) 
    {
        log.log(Level.INFO, s);
    }
    
    /** 
     * Процедура перехода на новый файл для логирования
     * @param myerr_v - лог для ошибок
     * @param doc - имя нового лог файла
     */
    public void setNewLogDoc(ErrMsgLog myerr_v,String doc) 
    {
        /**
         * В данном блоке проходит проверка на корректный доступ к данным
         * @exception IOException неверный доступ к данным
         */
        try
        {
            boolean append = true;
            hnd = new FileHandler(PATH_TO_MAIN_DIR + doc, append);
            hnd.setFormatter(new SimpleFormatter());
            log.addHandler(hnd);
        }
        catch (IOException e)
        {
            myerr_v.addErrWithLog(e);
        }
    }
      
    /** 
     * Процедура закрытия файлового дескриптора
     */
    public void closeFh() 
    {
        this.hnd.close();
    }
}


