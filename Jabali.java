 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jabali here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jabali extends Actor
{
    private GreenfootImage avanza = new GreenfootImage("brownjabali2.png");
    private GreenfootImage avanza2 = new GreenfootImage("brownjabali1.png");
    private GreenfootImage embes = new GreenfootImage("jabali estamp1.png");
    private GreenfootImage embes2 = new GreenfootImage("jabali estamp2.png");
    private int vSpeed = 0;
    private int acceleration = 1;
    private int frame = 1;
    /**
     * Act - do whatever the Jabali wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor Jabali;
        movimiento();
        checkFalling();
        Jabali = getOneObjectAtOffset(0,0,Caballero.class);
        
        if(Jabali != null)
            {
               World MyWorld;
                MyWorld = getWorld();
                MyWorld.removeObject(Jabali);
            }
        if(getX() == 0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(170)+30);
        }
        }
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under != null;
    }
    boolean onPlataforma()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Plataforma.class);
        return under != null;
    }
    public void checkFalling()
    {
        if(onGround()==false)
        {
            fall();
        }
        if(onGround()==true)
        {
            vSpeed = 0;
        }
        if(onPlataforma()==false)
        {
            fall();
        }
        if(onPlataforma()==true)
        {
            vSpeed = 0;
        }
    }
    public void animacion()
    {
        if(frame == 1)
            setImage(avanza);   
        else if(frame == 2)
        {
            setImage(avanza2);
            frame=1;
            return;
        }
        frame++;
    }
    public void embestida()
    {       
        if(frame == 1)
            setImage(embes);
        else if(frame == 2)
        {
            setImage(embes2);
            frame=1;
            return;
        }
        frame++;
    }
    public void movimiento()
    {
        int timer = 0;
        if(timer <= 10)
        {
            move(-1);
            animacion();
            timer=10;
        }
        else{
            
            move(-2);
            embestida();
        }
    }
}
