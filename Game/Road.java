import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends Actor
{
   public Road()
   {
    GreenfootImage image= getImage();
        image.scale(280,600);
    }
    public void act() 
    {
         setLocation(getX(),getY()+5);
        if(isAtEdge())
        {
            setLocation(getX(),5);
        }
    }    
}
