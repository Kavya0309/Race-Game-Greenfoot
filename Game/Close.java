import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Close here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Close extends Actor
{
    /**
     * Act - do whatever the Close wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;  
            MenuWorld w = new MenuWorld();  
            Greenfoot.setWorld(w); 
    }    
}
}
