import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulance extends Obstacles
{
    /**
     * Act - do whatever the Ambulance wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setLocation(getX(),getY()+2);
        moveDown();
        checkCollisions();
        endOfRoad();
     //   checkCollisions1();
    //    checkBikeCollision();
    }    
}
