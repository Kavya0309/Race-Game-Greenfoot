import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacles extends Actor
{
    public static int lives = 3;
    public void act() 
    {
        moveDown();
        checkCollisions();
        endOfRoad();
        //checkCollisions1();
     //   checkBikeCollision();// Add your action code here.
    }  
    
     public void moveDown()
    {
        setLocation(getX(),getY() + 5);
        if(isAtEdge())
        {
            setLocation(getX(),5);
        }
    }
     public void checkCollisions() // checks if the trucks spawn on top of eachother. will remove one.
    {
        Actor truck = getOneIntersectingObject(Obstacles.class);
        if(truck != null)
        {
            getWorld().removeObject(truck);
        }
     }

     public void checkFireShot() //removes truck and bomb blows up.
     {
         Bullet fs = (Bullet) getOneIntersectingObject(Bullet.class);
         //System.out.println("Lives" +lives);
         if(fs != null)
         {
             Explosion e = new Explosion();
             getWorld().addObject(e, getX(), getY());
            Greenfoot.playSound("bomb.wav");
             Greenfoot.delay(3);
             lives--;
            //  if(lives == 0)
              //System.out.println("Game end Lives" +lives);
             getWorld().removeObject(e);
             removeExplosion();
             
            
         }
     }
    public void removeExplosion() // removes explosion from screen after truck blows up.
    {
        getWorld().removeObject(this);
    } 
   public void endOfRoad() // removes truck once it hits end of the world.
    {
        if(getY() >= getWorld().getHeight() -1)
        {
            getWorld().removeObject(this);
        }
        else
        {
            checkFireShot();
        }
    } 

}
