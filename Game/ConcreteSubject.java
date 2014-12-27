import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class ConcreteSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteSubject extends Actor implements Subject {

     private String subjectState;
     private ArrayList<Observers> observers=new ArrayList();
     public void attach(Observers obj)
     {
         observers.add(obj);
     }
     public void detach(Observers obj)
     {
         observers.remove(obj);
     }
     public void notifyObservers()
     {
         for(Observers obj:observers)
         obj.update();
         
     }
     public void setState(String s)
     {
         subjectState=s;
         notifyObservers();
         
      }
     public String getState()
      {
          return subjectState;
          
        }
      
}
