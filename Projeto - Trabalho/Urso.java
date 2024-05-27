
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Urso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Urso extends Actor
{
    /**
     * Act - do whatever the Urso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int peixesComidos = 0; // Variável pra armezenar os peixes pescados pelo urso
    public int aguaViva = 10; // Variável pra armezenar a vida do urso
    
    public void act()
    {
        seguirMouse(); // Chama o método para verificar se as teclas do teclado foram apertadas
        ColisaoPeixonauta(); // Chama o método para verificar colisões com peixonauta
        ColisaoAguaViva(); // Chama o método para verificar as colisões com as aguas vivas
        ContabilizarPeixes(); // Mostra na tela, é um contador de peixes pescados
        ContabilizarVida(); // Contador que mostra a vida na tela, reduzindo quando o urso pesca águas vivas
        
        // Disparo do Gelo
        if (Greenfoot.isKeyDown("z")) { // Verifica se a tecla de espaço foi pressionada
         dispararGelo(); // Dispara o gelo
       }
       
    }

    
    public void seguirMouse() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            int mouseX = mouse.getX(); // Detecta a posição X
            int mouseY = mouse.getY(); // Detecta a posição Y
            turnTowards(mouseX, mouseY); // Vira o urso em direção ao mouse
            move(3); // Velocidade da movimentação
        }
    }
    
    public void dispararGelo() {
    Gelo gelo = new Gelo();
    getWorld().addObject(gelo, getX(), getY()); // Adiciona o gelo na mesma posição do urso
    gelo.setRotation(getRotation()); // Define a rotação do gelo como a mesma rotação do urso
}
    
    public void ColisaoPeixonauta() {
        if (isTouching(Peixonauta.class)) { // <-- Esse código serve pra saber se o urso toca no peixe
            removeTouching(Peixonauta.class); // < -- Se o Urso tocar no peixe, o peixe será removido
            peixesComidos++; // <-- Aumenta o número de peixes comidos quando o urso colide com eles
            Greenfoot.playSound("pop.mp3");
        }
    }
    
    public void ColisaoAguaViva() {
        if (isTouching(aguaViva.class)) { // <-- Esse código serve pra saber se o urso toca na agua viva
            removeTouching(aguaViva.class); // < -- Se o Urso tocar na agua viva, a agua viva será removida
            aguaViva--; // <-- Diminui o número de vidado urso quando ele toca na água viva
            Greenfoot.playSound("eletrizar.mp3");
        }
    }

    public void ContabilizarPeixes(){
        if (peixesComidos <= 25){
            getWorld().showText("Peixes: " + peixesComidos, 100, 50); // Mostra na tela a quantidade de peixes pescados
        }
        if (peixesComidos >= 25){
            getWorld().showText("" + peixesComidos, 100, 50);
            getWorld().addObject(new Vitoria(), getWorld().getWidth()/2, getWorld().getHeight()/2); // Imagem de vitória do jogo
            Greenfoot.stop();
        }
    }
    
    public void ContabilizarVida(){
        if (aguaViva <= 10){
            getWorld().showText("Vida: " + aguaViva, 100, 80); // Mostra na tela a quantidade de vida do urso
        }
        if (aguaViva == 0){
            getWorld().showText("" + peixesComidos, 100, 50);
            getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2); // Imagem de vitória do jogo
            Greenfoot.stop();
        }
    }
    
}
    
    

    
