import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossN1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossN1 extends World
{
    GreenfootSound bg = new GreenfootSound("bossesB.wav");
    /**
     * Constructor for objects of class BossN1.
     * 
     */
    public BossN1()
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
            Greenfoot.setWorld(new scrollN2());
            stopped();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        groundB1 groundB1 = new groundB1();
        addObject(groundB1,498,480);
        groundB1.setLocation(490,473);
        PlataformaB1 plataformaB1 = new PlataformaB1();
        addObject(plataformaB1,889,385);
        plataformaB1.setLocation(901,407);
        PlataformaB1 plataformaB12 = new PlataformaB1();
        addObject(plataformaB12,688,365);
        plataformaB12.setLocation(740,367);
        plataformaB12.setLocation(733,358);
        PlataformaB1 plataformaB13 = new PlataformaB1();
        addObject(plataformaB13,958,337);
        plataformaB13.setLocation(861,309);
        plataformaB13.setLocation(908,318);
        PlataformaB1 plataformaB14 = new PlataformaB1();
        addObject(plataformaB14,741,270);
        plataformaB14.setLocation(709,265);
        PlataformaB1 plataformaB15 = new PlataformaB1();
        addObject(plataformaB15,917,220);
        plataformaB15.setLocation(892,221);
        Espada espada = new Espada();
        addObject(espada,892,173);
        CaballeroB1 caballeroB1 = new CaballeroB1();
        addObject(caballeroB1,109,409);
        plataformaB1.setLocation(861,414);
        plataformaB12.setLocation(771,358);
        plataformaB13.setLocation(855,297);
        plataformaB14.setLocation(729,242);
        espada.setLocation(907,148);
        plataformaB15.setLocation(907,191);
        caballeroB1.setLocation(662,405);
        plataformaB12.setLocation(814,363);
        plataformaB13.setLocation(915,316);
        plataformaB14.setLocation(814,275);
        plataformaB15.setLocation(968,232);
        espada.setLocation(938,201);
        plataformaB1.setLocation(917,415);
        plataformaB12.setLocation(708,363);
        plataformaB14.setLocation(720,266);
        espada.setLocation(992,192);
        caballeroB1.setLocation(119,401);
        caballeroB1.setLocation(171,431);
        caballeroB1.setLocation(172,414);
        caballeroB1.setLocation(172,421);
        bossJabaliN1 bossJabaliN1 = new bossJabaliN1();
        addObject(bossJabaliN1,34,388);
    }
}
