import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peixonauta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peixonauta extends Actor
{
    /**
     * Act - do whatever the Peixonauta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moverParaDireita(); // Chama o método para mover aleatoriamente
    }

    public void moverParaDireita()
{
    int velocidade = 4; // Define a velocidade de movimento para a direita
    setLocation(getX() + velocidade, getY()); // Move o peixonauta para a direita
    if (isAtEdge()) {
            getWorld().removeObject(this); // Remove o gelo quando atinge a borda do mundo
        }
}
}
