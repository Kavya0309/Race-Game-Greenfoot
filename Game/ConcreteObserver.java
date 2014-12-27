import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConcreteObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteObserver extends Actor implements Observers
{
    protected String observerState;
    protected Bike bike;
    public ConcreteObserver(Bike bike)
    {
        this.bike=bike;
    }
    public void update()
    {
    }
    public void showState()
    {
       
        //System.out.println("Observer:"+this.getClass().getName()+"="+observerState);
    }
    public void act()
    {
        update();
    }
}
