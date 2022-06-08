import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossF extends Actor
{
    private GreenfootImage avanza = new GreenfootImage("image (9).png");
    private GreenfootImage avanza2 = new GreenfootImage("image (10).png");
    private int vSpeed = 0;
    private int acceleration = 1;
    private int frame = 1;
    /**
     * Act - do whatever the bossJabaliN1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor bossF;
        movimiento();
        checkFalling();
        bossF = getOneObjectAtOffset(0,0,CaballeroN3.class);
        
        if(bossF != null)
            {
               World MyWorld;
                MyWorld = getWorld();
                MyWorld.removeObject(bossF);
                Greenfoot.setWorld(new perdiste());
            }
        if(getX() == 0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(400));
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
    public void movimiento()
    {
        int timer = 0;
        if(timer <= 10)
        {
            move(-1);
            animacion();
            timer=10;
        }
    }
}
