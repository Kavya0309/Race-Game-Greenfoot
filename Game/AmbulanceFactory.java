/**
 * Write a description of class AmbulanceFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmbulanceFactory extends ObstaclesFactory 
{
   public Obstacles makeObstacle()
    {
        return new Ambulance();
    }
}
