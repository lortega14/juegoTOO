import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossN2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossN2 extends World
{
GreenfootSound bg = new GreenfootSound("bossesB.wav");
    /**
     * Constructor for objects of class BossN1.
     * 
     */
    public BossN2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1020, 496, 1);
        prepare();
    }

    public void started()
    {
        bg.playLoop();
    }

    public void stopped()
    {
        bg.pause();
    }

    public void act()
    {
        started();
        if(Greenfoot.isKeyDown("o"))
        {
            Greenfoot.setWorld(new BossN3());
            stopped();
        }
    }
    
    private void prepare()
    {

        groundB1 groundB1 = new groundB1();
        addObject(groundB1,564,447);
        groundB1.setLocation(566,479);
        CaballeroB2 caballeroB2 = new CaballeroB2();
        addObject(caballeroB2,303,399);
        Armadura armadura = new Armadura();
        addObject(armadura,548,404);
        EsbirroB esbirroB = new EsbirroB();
        addObject(esbirroB,840,396);
        caballeroB2.setLocation(202,401);
        caballeroB2.setLocation(208,411);
        Texto texto = new Texto();
        addObject(texto,618,266);
        texto.setLocation(721,309);
        texto.setLocation(817,303);
    }
}
