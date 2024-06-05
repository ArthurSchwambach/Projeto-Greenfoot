import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gelo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gelo extends Actor
{
    /**
     * Act - do whatever the Gelo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private static final int velocidadeGelo = 5;

    public void act() {
        ColidirAguaViva();
        move(velocidadeGelo); // Move o gelo para frente na direção que foi disparado
        if (isAtEdge()) {
            getWorld().removeObject(this); // Remove o gelo quando atinge a borda do mundo
        }
    }
    
    public void ColidirAguaViva(){
    if (isTouching(aguaViva.class)) { // <-- Esse código serve pra saber se o urso toca no peixe
        removeTouching(aguaViva.class); // < -- Se o Urso tocar no peixe, o peixe será removido
        }
    }
}
