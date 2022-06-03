import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pre2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pre2 extends World
{

    /**
     * Constructor for objects of class pre2.
     * 
     */
    public pre2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);   
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER"))
            Greenfoot.setWorld(new pre3());
    }
}
