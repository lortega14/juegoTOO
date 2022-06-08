import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaballeroB2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaballeroB2 extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -10;
    private GreenfootImage reversa = new GreenfootImage("image (1).png");
    private GreenfootImage aga1 = new GreenfootImage("normal2.png");
    private GreenfootImage aga2 = new GreenfootImage("image (5).png");
    private GreenfootImage avanza = new GreenfootImage("normal1.png");
    private GreenfootImage pega = new GreenfootImage("golpe-normal1.png");
    private GreenfootImage def = new GreenfootImage("guardia2.1.png");
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
        collect();
        
        animationCounter ++;
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
    public void collect()
    {
        Actor armadura = getOneIntersectingObject(Armadura.class);
        {
            if(armadura!=null)
            {
                World world;
                world = getWorld();
                getWorld().removeObject(armadura);
                BossN2 mundo = (BossN2)world;
                Greenfoot.setWorld(new BossN3());
            }
        }
    }
}
