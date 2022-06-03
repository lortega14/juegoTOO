import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menú here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private int opcion = 0;
    GreenfootSound bg = new GreenfootSound("pInicioB.wav");
    
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        preparaMundo();
    }
    public void started()
    {
        bg.playLoop();
    }
    public void stopped()
    {
        bg.pause();
    }
    private void preparaMundo()
    {
        addObject(new MAnimado(), 400, 200);
        addObject(new Start(),400,180);
        addObject(new Exit(),400,200);
    }
    public void act()
    {
        //Greenfoot.playSound("pInicioB.wav");
        started();
        if(Greenfoot.isKeyDown("UP") && opcion !=0)
        opcion++;
        if(Greenfoot.isKeyDown("DOWN") && opcion !=1)
        opcion--;
        if(opcion>=2)
        opcion=0;
        if(opcion<=0)
        opcion=1;
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER"))
        {
            Greenfoot.setWorld(new Instrucciones());
            stopped();
            /*switch(opcion)
            {
                case 0:
                    Greenfoot.setWorld(new nivel1());
                break;
                case 1:
                    Greenfoot.stop();
                break;
            }*/
        }
    }
}
