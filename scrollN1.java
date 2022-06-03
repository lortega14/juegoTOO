import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class scrollN1 extends World
{
    GreenfootImage background;
    GreenfootSound bg = new GreenfootSound("gameplayB.wav");
    private int backgroundX;
    private int timer = 10;
    Contador cont = new Contador();
    public scrollN1()
    {    
        super(1020, 496, 1); 
        //started();
        //verificaN1();
        background = new GreenfootImage("fondoG.png");
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
    public void act()
    {
        this.drawBackground();
    }
    public void changeBackgroundX(int changeX)
    {
        backgroundX = backgroundX - changeX;
    }
    public void drawBackground()
    {
        this.getBackground().drawImage(background, backgroundX, 0);
    }
    /*public void verificaN1()
    {
        
    }*/
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,410,474);
        Caballero caballero = new Caballero();
        addObject(caballero,146,250);
        caballero.setLocation(157,125);
        caballero.setLocation(140,149);
        caballero.setLocation(142,148);
        caballero.setLocation(140,169);
        Caballero caballero2 = new Caballero();
        addObject(caballero2,149,166);
        removeObject(caballero2);
        caballero.setLocation(142,147);
        caballero.setLocation(136,160);
        caballero.setLocation(143,145);
        addObject(cont, 75, 30);
        Vidas vidas = new Vidas();
        addObject(vidas,135,28);
        Jabali jabali = new Jabali();
        addObject(jabali,796,395);
        Plataforma plataforma = new Plataforma();
        addObject(plataforma,313,368);
        plataforma.setLocation(326,373);
        Plataforma plataforma2 = new Plataforma();
        addObject(plataforma2,551,297);
        plataforma2.setLocation(480,328);
        Plataforma plataforma3 = new Plataforma();
        addObject(plataforma3,645,272);
        plataforma3.setLocation(697,287);
        Plataforma plataforma4 = new Plataforma();
        addObject(plataforma4,856,219);
        plataforma4.setLocation(880,255);
        plataforma4.setLocation(889,249);
        Plataforma plataforma5 = new Plataforma();
        addObject(plataforma5,985,203);
        plataforma5.setLocation(988,189);
        Coin coin = new Coin();
        addObject(coin,40,380);
        Coin coin2 = new Coin();
        addObject(coin2,922,146);
        Coin coin3 = new Coin();
        addObject(coin3,867,211);
        Coin coin4 = new Coin();
        addObject(coin4,712,247);
        Coin coin5 = new Coin();
        addObject(coin5,473,289);
        Coin coin6 = new Coin();
        addObject(coin6,316,342);
        Coin coin7 = new Coin();
        addObject(coin7,948,377);
        Coin coin8 = new Coin();
        addObject(coin8,741,382);
        Coin coin9 = new Coin();
        addObject(coin9,575,376);
        Jabali jabali2 = new Jabali();
        addObject(jabali2,39,388);
        JabaliEmbe jabaliEmbe = new JabaliEmbe();
        addObject(jabaliEmbe,964,156);
        ContCoin contCoin = new ContCoin();
        addObject(contCoin,43,35);
        ContadorV contadorV = new ContadorV();
        addObject(contadorV,190,30);
    }
}
