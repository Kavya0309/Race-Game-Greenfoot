import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObstaclesFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObstaclesFactory
{
   public Obstacles selectObstacles(int ObstacleType)
   {
       Obstacles newObstacle = null;
       if(ObstacleType==0)
       {
           CarFactory newCarFactory = new CarFactory();
           newObstacle = newCarFactory.makeObstacle();
       }
       else if(ObstacleType==1)
       {
           AmbulanceFactory newAmbulanceFactory = new AmbulanceFactory();
           newObstacle = newAmbulanceFactory.makeObstacle();
       } 
       return newObstacle;
   }
}
