import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayGame extends Actor
{
    /**
     * Act - do whatever the PlayGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        public PlayGame()
    {        GreenfootImage image= getImage();
        image.scale(image.getWidth()-40,image.getHeight());
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;  
            BikeWorld w = new BikeWorld();  
            Greenfoot.setWorld(w);  
    }    
    }  
}
