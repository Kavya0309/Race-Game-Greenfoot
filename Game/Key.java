import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Key 
{
   Command theCommand;
   public Key(Command newCommand)
   {
       theCommand=newCommand;
    }
    public void press()
    {
        theCommand.execute();
    }
}
