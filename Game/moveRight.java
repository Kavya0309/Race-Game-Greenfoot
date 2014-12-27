import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class moveRight implements Command
{
  public Shooter theShooter;
   public moveRight(Shooter newShooter)
   {
      theShooter=newShooter;
    }
    public void execute()
    {
      theShooter.moveRight();
    }
      
}