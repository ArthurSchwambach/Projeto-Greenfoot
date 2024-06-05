import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Urso extends Actor {
    public int peixesComidos = 0; // Variável pra armazenar os peixes pescados pelo urso
    public int vida = 10; // Variável pra armazenar a vida do urso
    public long ultimoDisparo = 0; // Variável para armazenar o tempo do último disparo
    
    // Variáveis para armazenar o temporizador e alteração de imagens do urso //
    public boolean mudandoCor = false; // Variável para verificar se o urso está mudando de cor
    public long tempoInicioMudancaCor = 0; // Variável para armazenar o tempo de início da mudança de cor
    public GreenfootImage imagemOriginal = getImage(); // Armazena a imagem original do urso 
    public GreenfootImage imagemEletrizada = new GreenfootImage("UrsoPolarEletrizado.png"); // Carrega a imagem eletrizada do urs

    public void act() {
        seguirMouse(); // Chama a verificação do mouse
        ColisaoPeixonauta(); // Verifica colisões com peixonauta
        ColisaoAguaViva(); // Verifica colisões com águas-vivas
        ContabilizarPeixes(); // Mostra na tela a contagem de peixes pescados
        ContabilizarVida(); // Mostra na tela a vida do urso, reduzindo quando ele toca em águas-vivas
        atualizarCor(); // Atualiza a cor do urso se necessário

        if (Greenfoot.isKeyDown("z") && podeDisparar()) {
            dispararGelo();
            Greenfoot.playSound("gelo.mp3");
            ultimoDisparo = System.currentTimeMillis(); // Atualiza o tempo do último disparo
        }
    }

    public void seguirMouse() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            int mouseX = mouse.getX(); // Detecta a posição X
            int mouseY = mouse.getY(); // Detecta a posição Y
            turnTowards(mouseX, mouseY); // Vira o urso em direção ao mouse
            move(3); // Define a velocidade de movimentação
        }
    }

    public void dispararGelo() {
        Gelo gelo = new Gelo(); // Cria um novo objeto GELO
        getWorld().addObject(gelo, getX(), getY()); // Adiciona o gelo na mesma posição do urso
        gelo.setRotation(getRotation()); // Define a rotação do gelo como a mesma rotação do urso
    }

    private boolean podeDisparar() {
        return (System.currentTimeMillis() - ultimoDisparo) >= 1000; // Verifica se passou 1 segundo desde o último disparo
    }

    public void ColisaoPeixonauta() {
        if (isTouching(Peixonauta.class)) { // Verifica se o urso toca no peixe
            removeTouching(Peixonauta.class); // Remove o peixe se o urso tocar nele
            peixesComidos++; // Aumenta o número de peixes comidos
            Greenfoot.playSound("pop.mp3");
        }
    }

    public void ColisaoAguaViva() {
        if (isTouching(aguaViva.class)) { // Verifica se o urso toca na água-viva
            removeTouching(aguaViva.class); // Remove a água-viva se o urso tocar nela
            vida--; // Diminui a vida do urso
            Greenfoot.playSound("eletrizar.mp3");
            setImage(imagemEletrizada); // Muda a imagem do urso para eletrizada
            mudandoCor = true; // Inicia a mudança de cor quando toca na aguaviva
            tempoInicioMudancaCor = System.currentTimeMillis(); // Registra o tempo de início da mudança de cor
        }
    }
    
    public void atualizarCor() {
        if (mudandoCor && (System.currentTimeMillis() - tempoInicioMudancaCor) >= 500) {
            mudandoCor = false; // Reseta a mudança de cor
            setImage(imagemOriginal); // Volta a cor do urso para a cor original
        }
    }

    public void ContabilizarPeixes() {
        if (peixesComidos <= 25) {
            getWorld().showText("Peixes: " + peixesComidos, 100, 50); // Mostra na tela a quantidade de peixes pescados
        }
        if (peixesComidos >= 25) {
            getWorld().showText("" + peixesComidos, 100, 50);
            getWorld().addObject(new Vitoria(), getWorld().getWidth() / 2, getWorld().getHeight() / 2); // Imagem de vitória do jogo
            Greenfoot.stop();
        }
    }

    public void ContabilizarVida() {
        if (vida <= 10) {
            getWorld().showText("Vida: " + vida, 100, 80); // Mostra na tela a quantidade de vida do urso
        }
        if (vida == 0) {
            getWorld().showText("" + peixesComidos, 100, 50);
            getWorld().addObject(new GameOver(), getWorld().getWidth() / 2, getWorld().getHeight() / 2); // Imagem de fim de jogo
            Greenfoot.stop();
        }
    }
}
