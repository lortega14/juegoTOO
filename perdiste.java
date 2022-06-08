import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class perdiste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class perdiste extends World
{

    /**
     * Constructor for objects of class perdiste.
     * 
     */
    public perdiste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER"))
        {
            Greenfoot.setWorld(new scrollN1());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TextoEnter textoEnter = new TextoEnter();
        addObject(textoEnter,404,358);
    }
}
