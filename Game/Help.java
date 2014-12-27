import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Actor
{
     public Help()
    {   
        GreenfootImage image= getImage();
        image.scale(image.getWidth()-40,image.getHeight());
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;  
            getWorld().addObject(new MenuHelp(),400,300);
            getWorld().addObject(new Close(),650,450);
    }    
}
}
