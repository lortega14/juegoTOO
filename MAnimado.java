import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MAnimado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MAnimado extends Actor
{
    GifImage g = new GifImage("pantalla inicio.gif");
    public void act()
    {
        
        this.setImage(g.getCurrentImage());
    }
}
