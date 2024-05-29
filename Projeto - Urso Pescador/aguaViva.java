import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aguaViva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aguaViva extends Actor {
    GifImage aguaViva = new GifImage("aguaVivaAnimada.gif");

    /**
     * Act - do whatever the aguaViva wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setImage(aguaViva.getCurrentImage());
        moverParaBaixo(); // Chama o método para mover aleatoriamente
    }

    public void moverParaBaixo() {
        int velocidade = 4; // Define a velocidade de movimento para baixo
        setLocation(getX(), getY() + velocidade); // Move a água-viva para baixo
        if (isAtEdge()) {
            getWorld().removeObject(this); // Remove a água-viva quando atinge a borda do mundo
        }
    }
}
