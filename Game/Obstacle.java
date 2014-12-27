import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    World world;
    public void act() 
    {
       
         setLocation(getX(),getY()+4);
            world = getWorld();
            if (isAtEdge()) 
            {
                world.removeObject(this);
            }
  
    }    
}
