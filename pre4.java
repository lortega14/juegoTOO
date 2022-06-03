import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pre4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pre4 extends World
{

    /**
     * Constructor for objects of class pre4.
     * 
     */
    public pre4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);  
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER"))
            Greenfoot.setWorld(new scrollN1());
    }
}
