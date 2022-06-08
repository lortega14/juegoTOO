import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossN3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossN3 extends World
{
    GreenfootSound bg = new GreenfootSound("pInicioB.wav");
    /**
     * Constructor for objects of class BossN3.
     * 
     */
    public BossN3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1);
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
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        groundB1 groundB1 = new groundB1();
        addObject(groundB1,416,433);
        groundB1.setLocation(36,341);
        groundB1.setLocation(62,366);
        groundB1.setLocation(61,361);
        CaballeroN3 caballeroN3 = new CaballeroN3();
        addObject(caballeroN3,184,285);
        groundB1.setLocation(425,666);
        groundB1.setLocation(251,411);
        groundB1.setLocation(670,426);
        BossF bossF = new BossF();
        addObject(bossF,705,287);
        groundB1 groundB12 = new groundB1();
        addObject(groundB12,172,207);
        removeObject(groundB12);
        PlataformaB1 plataformaB1 = new PlataformaB1();
        addObject(plataformaB1,185,171);
        plataformaB1.setLocation(194,194);
        caballeroN3.setLocation(198,104);
        PlataformaB1 plataformaB12 = new PlataformaB1();
        addObject(plataformaB12,668,154);
        PlataformaB1 plataformaB13 = new PlataformaB1();
        addObject(plataformaB13,507,317);
        PlataformaB1 plataformaB14 = new PlataformaB1();
        addObject(plataformaB14,211,328);
        plataformaB14.setLocation(389,351);
        bossF.setLocation(687,52);
        plataformaB13.setLocation(612,289);
        plataformaB14.setLocation(251,334);
    }
}
