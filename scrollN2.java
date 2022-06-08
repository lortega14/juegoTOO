import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scrollN2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scrollN2 extends World
{
    GreenfootImage background;
    GreenfootSound bg = new GreenfootSound("gameplayB.wav");
    private int backgroundX;
    private int timer = 55*60;
    Contador cont = new Contador();
    public scrollN2()
    {    
        super(820, 370, 1); 
        background = new GreenfootImage("image (8).png");
        this.getBackground().drawImage(background, 0, 0);
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
    public Contador getContador()
    {
        return cont;
    }
    public void changeBackgroundX(int changeX)
    {
        backgroundX = backgroundX - changeX;
    }
    public void drawBackground()
    {
        this.getBackground().drawImage(background, backgroundX, 0);
    }
    public void act()
    {
        started();
        this.drawBackground();
        if(Greenfoot.isKeyDown("o"))
        {
            Greenfoot.setWorld(new BossN2());
            stopped();
        }
    }
    
    private void prepare()
    {
        groundB1 groundB1 = new groundB1();
        addObject(groundB1,387,322);
        groundB1.setLocation(404,357);
        groundB1.setLocation(413,363);
        Esbirros esbirros = new Esbirros();
        addObject(esbirros,580,49);
        Coin coin = new Coin();
        addObject(coin,255,311);
        Coin coin2 = new Coin();
        addObject(coin2,508,304);
        PlataformaB1 plataformaB1 = new PlataformaB1();
        addObject(plataformaB1,691,322);
        PlataformaB1 plataformaB12 = new PlataformaB1();
        addObject(plataformaB12,705,273);
        plataformaB12.setLocation(696,278);
        PlataformaB1 plataformaB13 = new PlataformaB1();
        addObject(plataformaB13,733,202);
        plataformaB13.setLocation(682,235);
        plataformaB13.setLocation(713,244);
        plataformaB13.setLocation(697,242);
        PlataformaB1 plataformaB14 = new PlataformaB1();
        addObject(plataformaB14,721,194);
        plataformaB14.setLocation(689,200);
        PlataformaB1 plataformaB15 = new PlataformaB1();
        addObject(plataformaB15,686,148);
        plataformaB15.setLocation(699,160);
        PlataformaB1 plataformaB16 = new PlataformaB1();
        addObject(plataformaB16,704,110);
        plataformaB16.setLocation(676,119);
        plataformaB16.setLocation(132,305);
        plataformaB15.setLocation(86,265);
        plataformaB14.setLocation(195,214);
        plataformaB13.setLocation(662,199);
        plataformaB12.setLocation(678,255);
        plataformaB12.setLocation(653,265);
        plataformaB13.setLocation(760,217);
        Coin coin3 = new Coin();
        addObject(coin3,726,186);
        Coin coin4 = new Coin();
        addObject(coin4,209,186);
        Coin coin5 = new Coin();
        addObject(coin5,784,316);
        Esbirros esbirros2 = new Esbirros();
        addObject(esbirros2,321,293);
        Esbirros esbirros3 = new Esbirros();
        addObject(esbirros3,777,183);
        ContCoin contCoin = new ContCoin();
        addObject(contCoin,43,30);
        Contador contador = new Contador();
        addObject(contador,80,26);
        Esbirros esbirros4 = new Esbirros();
        addObject(esbirros4,68,123);
        CaballeroN2 caballeroN2 = new CaballeroN2();
        addObject(caballeroN2,128,299);
        removeObject(contCoin);
        removeObject(contador);
        coin3.setLocation(51,236);
        coin5.setLocation(407,246);
        monedaM monedaM = new monedaM();
        addObject(monedaM,745,180);
        Adver adver = new Adver();
        addObject(adver,131,32);
    }
}
