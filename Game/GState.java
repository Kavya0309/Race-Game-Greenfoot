/**
 * Write a description of class BikeState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GState implements GameState
{
    // instance variables - replace the example below with your own
    Bike bike;
    public GState(Bike bike)
    {
        this.bike = bike;
    }

      
    
  public void gumballCollected()
  {
     System.out.println("Gumball collected in" +this.getClass().getName() + "state");
    }
    
  public void allGumballsCollected()
   {
    System.out.println("All gumballs collected in" +this.getClass().getName() + "state");
    }
   
   
   
   
}
