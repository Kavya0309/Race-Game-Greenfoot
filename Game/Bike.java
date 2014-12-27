import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
public class Bike extends ConcreteSubject implements GameState, Shooter
{
    GameState gumballCollectedState;
    GameState allGumballsCollectedState;
    GameState currentState;
    Actor collidedGumball;
    public int gumballs = 0;
    public int count =0;
    int damage;
    private int gunDelay;
    private int minGunDelay;
    
    public Bike()
    {
        GreenfootImage image=getImage();
        image.scale(50,80);
        
        damage = 0;
        gunDelay = 0;
        minGunDelay = 0;
        
        gumballCollectedState = new HasGumballState(this);
        allGumballsCollectedState = new NoMoreGumballState(this);
        currentState = gumballCollectedState;
    }
    public void act() 
    {
      //  createObstacles();
       // createGumball();
      //  moveLeft();
       // moveRight();
          //shoot();
         collectGumball();
          checkCollision();
       // move();
        
        gumballCollected();
        allGumballsCollected();
        
    } 
    
    public void moveLeft()
    {
       // if (getX()>280 && getX()<520) {
             move(-3);
           
        //}
          // else if(getX()<280){
            //  move(-3); 
            //}
           
    }
    public void moveRight()
   
    {
      //if (getX()>280 && getX()<520) {
            
            move(3); 
            
            
        // }
        //else if (getX()<280){
          //   move(3); 
             
          //}
        
    }
    public void shoot()
    {
        //getWorld().addObject(new Bullet(),getX(),getY());
        if(gunDelay >= minGunDelay)   // this lets u fire the gun and sets gun dealy to 0 so it has some interuption.
        {
           Bullet b = new Bullet();
           getWorld().addObject(b, getX(), getY());
           // b.move();
            gunDelay = 0;
        
    }
    
}

public void checkCollision() // increases damage of car when it hits a Vehicle.
    {
        Actor actor = getOneIntersectingObject(Obstacles.class);
       if (actor != null)
        {
            Greenfoot.playSound("crash.wav");
             Greenfoot.stop();
             String text="\tGame Over\n";

        GreenfootImage image = new GreenfootImage(text, 20, Color.WHITE,Color.RED);
        setImage(image);  
           // System.out.println("Lives 2" +damage);
        }
      
               
    }

    public void collectGumball()
    {
        collidedGumball = getOneIntersectingObject(Gumball.class);
            if(collidedGumball != null)
            {
                 getWorld().removeObject(collidedGumball);
           collidedGumball();
           gumballs++;
           
           if(gumballs>0 && gumballs<10)
           {
            this.setState(1);
            }
            
             if(gumballs == 20)
           {
            this.setState(2);
            }
            
         // ((ScoreDetails)getWorld().getObjects(ScoreDetails.class).get(0)).updateImage();
            
            }
    }
    
    public void gumballCollected()
    {
    }
    
   public void allGumballsCollected()
   {
    }
    
    void setState(int x)
    {
        switch(x)
        {
            case 1: currentState= gumballCollectedState;
                    showState();
                    break;
            case 2: currentState=allGumballsCollectedState;
                    showState(); 
                    Greenfoot.stop();
                    String text="\tYou Won\n";
        GreenfootImage image = new GreenfootImage(text, 20, Color.WHITE,Color.RED);
        image.scale(150,150);
        setImage(image); 
                    break;
        }
    } 
     public void showState()
    {
      //  System.out.println("currentState: " +currentState.getClass().getName());
    }

     public void collidedGumball()
    {
      
        ScoreDetails.totalscore += 10;
       // System.out.println("Score: "+score);
       // addObject(new ScoreDetails(),100,150);
      //  ((ScoreDetails)this.getObjects(ScoreDetails.class).get(0)).updateImage();
    }
    
  
}
