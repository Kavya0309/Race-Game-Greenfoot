/**
 * Write a description of class CarFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarFactory extends ObstaclesFactory 
{
   
    public Obstacles makeObstacle()
    {
        return new Car();
    }

   
}
