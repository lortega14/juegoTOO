import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaballeroN3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaballeroN3 extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -10;
    private GreenfootImage reversa = new GreenfootImage("image (11) (1).png");
    private GreenfootImage aga1 = new GreenfootImage("caballero normal 3.1.png");
    private GreenfootImage aga2 = new GreenfootImage("caballero normal 3.2.png");
    private GreenfootImage avanza = new GreenfootImage("caballero normal 3.2.png");
    private GreenfootImage pega = new GreenfootImage("embestida3.1.png");
    private GreenfootImage def = new GreenfootImage("caballero guardia3.1.png");
    private int frame = 1;
    private int animationCounter = 0;
    /**
     * Act - do whatever the caballero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveDer();
        moveIzq();
        golpea();
        cubrirse();
        checkFalling();
        bossF();
        animationCounter ++;
    }
    public void bossF()
    {
        Actor Caballero;
        Caballero = getOneObjectAtOffset(0,0,BossF.class);
        if(Caballero != null && Greenfoot.isKeyDown("P"))
        {
               World MyWorld;
                MyWorld = getWorld();
                MyWorld.removeObject(Caballero);
                Greenfoot.setWorld(new Ganaste());
        }
    }
    public void animacion()
    {
        if(frame == 1)
        {
            setImage(aga1);
        }
        else if(frame == 2)
        {
            setImage(avanza);
            frame=1;
            return;
        }
        frame++;
    }
    public void animacionIzq()
    {
        if(frame == 1)
        {
            setImage(aga2);
        }
        else if(frame == 2)
        {
            setImage(reversa);
            frame=1;
            return;
        }
        frame++;
    }
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void golpea()
    {
        if(Greenfoot.isKeyDown("p"))
        {
            setImage(pega);
        }
    }
    public void cubrirse()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setImage(def);
        }
    }
    public void moveDer()
    {
        if(animationCounter % 25 == 0)
                animacion();
        if(Greenfoot.isKeyDown("d"))
        {
            move(3);
            if(animationCounter % 25 == 0)
                animacion();
        }
        if(Greenfoot.isKeyDown("space")&&(onGround()==true)||Greenfoot.isKeyDown("space")&&(onPlataforma()==true))
        {
            vSpeed = jumpHeight;
            fall();
        }
    }
    public void moveIzq()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
            if(animationCounter % 25 == 0)
                animacionIzq();
        }
        if(Greenfoot.isKeyDown("space")&&(onGround()==true)||Greenfoot.isKeyDown("space")&&(onPlataforma()==true))
        {
            vSpeed = jumpHeight;
            fall();
        }
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
}
