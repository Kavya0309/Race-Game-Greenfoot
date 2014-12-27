import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class ScoreDetails here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreDetails extends ConcreteObserver
{
     
    public static int totalscore=0;
    private Bike b;
    public ScoreDetails(Bike b)
    {
        super(b);
       
    }
    public void update()
    {
        
        //if(subject.getState().equalsIgnoreCase("GUMBALL1"))
        
           
            String text="\tTotal Score:\t"+totalscore;

        GreenfootImage image = new GreenfootImage(text, 20, Color.WHITE,Color.RED);
        setImage(image);  
            //observerState="GUMBALL1";
        
    }
    public void act()
    {
        update();
    }
}
