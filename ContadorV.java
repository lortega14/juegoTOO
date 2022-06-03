import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

/**
 * Write a description of class ContadorV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContadorV extends Actor
{
    int cont = 100;
    /**
     * Act - do whatever the ContadorV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("" + cont, 50, Color.RED, Color.BLACK));
    }
    public void addContar()
    {
        cont--;
    }
}
