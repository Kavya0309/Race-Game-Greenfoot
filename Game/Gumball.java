import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Gumball extends Actor
{
   World world;
   int count = 0;
   
   public void Gumball()
   {
      // createGumball();
    }
   
    public void act() 
    {
        
       move();
    }   
    
    public void createGumball()
    {
        //  if (count==80) {
                
               getWorld().addObject(new Gumball(),Greenfoot.getRandomNumber(180)+250,0);
          /*      count=0;
            }
            else {
                count++;
            }*/
    }
    
    
    public void move()
    {
         setLocation(getX(),getY()+4);
            world = getWorld();
            if (isAtEdge()) {
                world.removeObject(this);
            }
    }
}
