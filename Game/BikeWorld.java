import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BikeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BikeWorld extends World
{

   // public static int score = 0;
    public int count = 0;
     public Bike bike=new Bike();
     
    public BikeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(800, 600, 1); 
        addObject(new Grass(), 130,300);
        addObject(new Road(), 400,300);
         addObject(new Road(), 400,0);
        addObject(new Grass(), 670,300);
         addObject(new Grass(), 130,0);
         addObject(new Grass(), 670,0);
         addObject(new Grass(), 130,700);
         addObject(new Grass(), 670,700);
        addObject(new Line(), 265,300);
          addObject(new Line(), 545,300);
           addObject(bike, 450,500);
           
           ScoreDetails s=new ScoreDetails(bike);
           addObject(s,130,100);
        
         
    }
    
    
    
    public void act()
    {
        
         createObstacles();
        createGumball();
         if(Greenfoot.isKeyDown("left")){
            moveLeft onCommand = new moveLeft(bike);
            Key onPressed = new Key(onCommand);
            onPressed.press();    
        }
    
        if(Greenfoot.isKeyDown("right")){
            moveRight onCommand = new moveRight(bike);
            Key onPressed = new Key(onCommand);
             onPressed.press();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        }
    
       if(Greenfoot.isKeyDown("space")){
          Shoot onCommand = new Shoot(bike);
            Key onPressed = new Key(onCommand);
            
            onPressed.press();
        }
        
    }
    
     public void createObstacles()
    {
       
         
        if(Greenfoot.getRandomNumber(250) < 1) //this will make trucks randomley apear.
        {        
            addObject(new Car(), Greenfoot.getRandomNumber(200) + 350, 0); //this keeps trucks on the road   
        }
        if(Greenfoot.getRandomNumber(300) < 1) //this makes trees randomly appear.
        {
            
            addObject(new Ambulance(), Greenfoot.getRandomNumber(100) + 300, 0); //keep them on right hand side of road
        }
    }
    
    public void createGumball()
    {
        if (count == 30) {
                
               addObject(new Gumball(),Greenfoot.getRandomNumber(250)+250,0);
               count=0;
            }
            else {
                count++;
            }
    }
}
