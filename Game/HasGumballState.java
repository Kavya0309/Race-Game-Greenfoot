/**
 * Write a description of class HasGumballState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasGumballState extends GState 
{
    
    public HasGumballState(Bike bike)
    {
           super(bike);
    }

   
    public void gumballCollected()
  {
        bike.setState(1);
  }
     
}
