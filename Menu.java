import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase es el menu principal donde comienza la secuencia
 **/
public class Menu extends World
{
    private int opcion = 0;
    GreenfootSound bg = new GreenfootSound("pInicioB.wav");

    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        preparaMundo();
        prepare();
    }

    /**
     * La clase hace un inicio en loop de la cancion de fondo
     **/
    public void started()
    {
        bg.playLoop();
    }

    /**
     * La clase detiene el loop de la cancion de fondo
     **/
    public void stopped()
    {
        bg.pause();
    }

    /**
     * hace un set de los objetos colocados en el menu
     **/
    private void preparaMundo()
    {
        addObject(new MAnimado(), 400, 200);
        addObject(new Start(),400,180);
    }

    /**
     * es la secuencia de botones para comenzar el juego
     **/
    public void act()
    {
        //Greenfoot.playSound("pInicioB.wav");
        started();
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
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
