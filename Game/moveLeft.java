import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class moveLeft implements Command
{
  public Shooter theShooter;
   public moveLeft(Shooter newShooter)
   {
      theShooter=newShooter;
    }
    public void execute()
    {
      theShooter.moveLeft();
    }
      
}