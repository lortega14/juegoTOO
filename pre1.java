import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pre1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pre1 extends World
{

    /**
     * Constructor for objects of class pre1.
     * 
     */
    public pre1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);  
        prepare();
    }

    /**
     * Prepara unicamente el siguiente mundo
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER"))
            Greenfoot.setWorld(new pre2());
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TextoEnter textoEnter = new TextoEnter();
        addObject(textoEnter,728,48);
    }
}
