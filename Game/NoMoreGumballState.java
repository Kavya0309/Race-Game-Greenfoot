/**
 * Write a description of class NoMoreGumballState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoMoreGumballState extends GState 
{
   

    public NoMoreGumballState(Bike bike)
    {
        super(bike);
    }

 
   public  void allGumballsCollected()
    {
      bike.setState(2);
    }

}
