import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grass extends Actor
{
    /**
     * Act - do whatever the Grass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Grass()
    {
        GreenfootImage image= getImage();
        image.scale(260,600);
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

