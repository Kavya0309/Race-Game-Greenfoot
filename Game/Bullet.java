import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int life;
    public Bullet() // sets life of laser to 60 
   {
        life = 60;
   }
   
    public void act() 
    {
         if ( life <= 0 )
        {
            getWorld().removeObject(this);
        } 
        else 
        {
        setLocation(getX(),getY()-10);
          life--;
        } 
    }    
    public void move(double distance) // this it what allows me to shoot out of the front of my image/car.
        {
            double angle = Math.toRadians( getRotation() );
           
            int x = (int) Math.round(getX() + Math.cos(angle) * distance);
            int y = (int) Math.round(getY() + Math.sin(angle) * distance);
            setLocation(x, y);
        } 
}
