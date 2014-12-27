import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Shoot implements Command
{
  public Shooter theShooter;
   public Shoot(Shooter newShooter)
   {
      theShooter=newShooter;
    }
    public void execute()
    {
      theShooter.shoot();
    }
      
}