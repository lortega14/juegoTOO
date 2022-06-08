import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Esbirros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Esbirros extends Actor
{
    /**
     * Act - do whatever the Esbirros wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor Esbirros;
        movimiento();
        Esbirros = getOneObjectAtOffset(0,0,CaballeroN2.class);
        
        if(Esbirros != null)
            {
               World MyWorld;
                MyWorld = getWorld();
                MyWorld.removeObject(Esbirros);
                Greenfoot.setWorld(new perdiste());
            }
        if(getX() == 0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(170)+30);
        }
    }
    public void movimiento()
    {
        int timer = 0;
        if(timer <= 10)
        {
            move(-2);
            timer=10;
        }
    }
}
