package lab4;

import java.io.*;
import java.util.*;

/** 
 * Main class программы
 * @author Тегин Александр
 * @version 1.0
 */
public class Main 
{
   /**
    * Метод инициализации/удаления значений массива/словаря объектами с рандомными значениями поля ID и логирование данной ифнормации в лог
    * @param size - размер массива/словаря
    * @param myerr_v - лог ошибок
    * @param mylog_v - инфо лог
    * @param arrORmap - опредление (массив/словарь)
    */
    public static void addWagon (int size,ErrMsgLog myerr_v,InfoLog mylog_v,boolean arrORmap)
    {
        try 
        {
            if (arrORmap)
            {
                mylog_v.setNewLogDoc(myerr_v,"ArrayListLog" + String.valueOf(size) + ".log");
                
                mylog_v.strToLog("ArrayList");
                ArrayList<Wagon> waglist = new ArrayList<>(size);
                ArrayList add_time_values = new ArrayList(size);
            
                long add_start = System.nanoTime();
                for (int i = 0; i < size; i++)
                {
                    long mini_add_start = System.nanoTime();
                    waglist.add(new Wagon( i + new Random().nextDouble(), mylog_v, arrORmap));
                    long mini_add_finish = System.nanoTime();
                    add_time_values.add((mini_add_finish - mini_add_start)/10000);
                }
            
                long add_finish = System.nanoTime();
                long add_elapsed = add_finish - add_start;
                        
                mylog_v.strToLog( "addTotalCount = " +  String.valueOf(size) );
                mylog_v.strToLog( "addTotalTime = " + String.valueOf(add_elapsed/10000) );
                Collections.sort(add_time_values);
                mylog_v.strToLog( "addMedianTime = " + String.valueOf(add_time_values.get(size/2)) );
            
                ArrayList remove_time_values = new ArrayList(size);
            
                long remove_start = System.nanoTime();
                for (int i = 0; i < size/10; i++)
                {
                    long mini_remove_start = System.nanoTime();
                    mylog_v.strToLog("remove, ID = " +  waglist.get(i).getID());
                    waglist.remove(i);
                    long mini_remove_finish = System.nanoTime();
                    remove_time_values.add((mini_remove_finish - mini_remove_start)/10000);
                }
            
                long remove_finish = System.nanoTime();
                long remove_elapsed = remove_finish - remove_start;
                        
                mylog_v.strToLog("removeTotalCount = " +  size/10);
                mylog_v.strToLog("removeTotalTime = " + remove_elapsed/10000);
                Collections.sort(remove_time_values);
                mylog_v.strToLog("removeMedianTime = " + remove_time_values.get(remove_time_values.size()/2));
                
                mylog_v.closeFh();
            }
            else
            {
                mylog_v.setNewLogDoc(myerr_v,"HashMapLog" + String.valueOf(size) + ".log");
                
                mylog_v.strToLog("HashMap");
                String value = "true";
                HashMap<Wagon, String> waglist = new HashMap<>(size);
                ArrayList put_time_values = new ArrayList(size);
            
                long put_start = System.nanoTime();
                for (int i = 0; i < size; i++)
                {
                    long mini_put_start = System.nanoTime();
                    waglist.put( new Wagon(i + new Random().nextDouble(),mylog_v,arrORmap), value);
                    long mini_put_finish = System.nanoTime();
                    put_time_values.add((mini_put_finish - mini_put_start)/10000);
                }
            
                long put_finish = System.nanoTime();
                long put_elapsed = put_finish - put_start;
                        
                mylog_v.strToLog("putTotalCount = " +  size);
                mylog_v.strToLog("putTotalTime = " + put_elapsed/10000);
                Collections.sort(put_time_values);
                mylog_v.strToLog("putMedianTime = " + put_time_values.get(size/2));
            
                Set<Wagon> keys = waglist.keySet();
                Wagon[] keysArray = keys.toArray(new Wagon[0]);
                ArrayList remove_time_values = new ArrayList(size);
                long remove_start = System.nanoTime();
                for (int i = 0; i < size/10; i++)
                {
                    long mini_remove_start = System.nanoTime();
                    mylog_v.strToLog("remove, ID = " +  keysArray[i].getID());
                    waglist.remove(keysArray[i]);
                    long mini_remove_finish = System.nanoTime();
                    remove_time_values.add((mini_remove_finish - mini_remove_start)/10000);
                }
            
                long remove_finish = System.nanoTime();
                long remove_elapsed = remove_finish - remove_start;
                        
                mylog_v.strToLog("removeTotalCount = " +  size/10);
                mylog_v.strToLog("removeTotalTime = " + remove_elapsed/10000);
                Collections.sort(remove_time_values);
                mylog_v.strToLog("removeMedianTime = " + remove_time_values.get(remove_time_values.size()/2));
                
                mylog_v.closeFh();
            }
        }
        catch (Exception e)
        { 
            myerr_v.addErrWithLog(e); //Добавляем ошибку в список и пишем в лог без отображения в консоли
            myerr_v.showErrText(e); //Отображаем ошибку
        }
    }
    
    /**
    * Исследование инициализации значений массива при автоматическом рассширении
    * @param size - размер массива/словаря
    * @param myerr_v - лог ошибок
    * @param mylog_v - инфо лог
     */
    public static void capacityResearch (int size,ErrMsgLog myerr_v,InfoLog mylog_v)
    {
        try 
        {
            mylog_v.setNewLogDoc(myerr_v,"CapasityResearch.log");
                
            mylog_v.strToLog("ArrayList before auto extend");
            ArrayList<Wagon> waglist = new ArrayList<>(size);
            boolean array = true;
            
            ArrayList before_time_values = new ArrayList(size);
            long before_start = System.nanoTime();
            for (int i = 0; i < size; i++)
            {
                long mini_before_start = System.nanoTime();
                waglist.add(new Wagon(i + new Random().nextDouble(), mylog_v, array));
                long mini_before_finish = System.nanoTime();
                before_time_values.add((mini_before_finish - mini_before_start)/10000);
            }
            long before_finish = System.nanoTime();
            long before_elapsed = before_finish - before_start;
            
            mylog_v.strToLog( "beforeAddTotalCount = " +  String.valueOf(size) );
            mylog_v.strToLog( "beforeAddTotalTime = " + String.valueOf(before_elapsed/10000) );
            Collections.sort(before_time_values);
            mylog_v.strToLog( "beforeAddMedianTime = " + String.valueOf(before_time_values.get(size/2)) );
                        
            mylog_v.strToLog("ArrayList after auto extend");
            ArrayList after_time_values = new ArrayList(size);
            long after_start = System.nanoTime();
            for (int i = 0; i < size; i++)
            {
                long mini_after_start = System.nanoTime();
                waglist.add(new Wagon(i + new Random().nextDouble(), mylog_v, array));
                long mini_after_finish = System.nanoTime();
                after_time_values.add( (mini_after_finish - mini_after_start)/10000 );
            }
            long after_finish = System.nanoTime();
            long after_elapsed = after_finish - after_start;
            
            mylog_v.strToLog( "afterAddTotalCount = " +  String.valueOf(size) );
            mylog_v.strToLog( "afterAddTotalTime = " + String.valueOf(after_elapsed/10000) );
            Collections.sort(after_time_values);
            mylog_v.strToLog( "afterAddMedianTime = " + String.valueOf(after_time_values.get(size/2)) );
         
            mylog_v.closeFh();
        }
        catch (Exception e)
        { 
            myerr_v.addErrWithLog(e); //Добавляем ошибку в список и пишем в лог без отображения в консоли
            myerr_v.showErrText(e); //Отображаем ошибку
        }
    }
    
    /**
     * main 
     * @param args - аргументы командной строки
     */
    public static void main(String args[])
    {
        ErrMsgLog myerr = new ErrMsgLog();
        InfoLog mylog = new InfoLog(myerr);
        boolean array = true;
        boolean map = false;
        
        addWagon(10, myerr, mylog, array);
        addWagon(100, myerr, mylog, array);
        addWagon(1000, myerr, mylog, array);
        addWagon(10000, myerr, mylog, array);
        addWagon(100000, myerr, mylog, array);
        
        addWagon(10, myerr, mylog, map);
        addWagon(100, myerr, mylog, map);
        addWagon(1000, myerr, mylog, map);
        addWagon(10000, myerr, mylog, map);
        addWagon(100000, myerr, mylog, map);
        
        capacityResearch (10,myerr,mylog);
    }
}

