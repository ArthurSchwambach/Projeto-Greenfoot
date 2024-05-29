import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    GreenfootSound musicaCapa = new GreenfootSound("musicaCapa.mp3");
    public Capa capa;
    public boolean jogoIniciado = false;

    public MyWorld()
    {    
        super(600, 400, 1);
        exibirCapa(); // Exibe a capa antes de tudo
        musicaCapa.playLoop(); // Faz a música da capa tocar
    }
    
    public void exibirCapa()
    {
        capa = new Capa(); 
        addObject(capa, getWidth() / 2, getHeight() / 2); // Adiciona a capa no centro do mundo
    }

    public void act()
    {
        checarTeclaEnter(); // Verifica se a tecla ENTER foi pressionada
        if (jogoIniciado) {
            spawnar(); // Spawna os peixes quando a variaável fica TRUE
            spawnarAguaViva(); // Começa a randomizar o spawn de aguas vivas
            musicaCapa.stop(); // Faz a música do menu parar
        }
    }
    
     public void checarTeclaEnter()
    {
        if (Greenfoot.mouseClicked(capa)) {
            jogoIniciado = true; // Define que o jogo foi iniciado
            removeObjects(getObjects(Capa.class)); // Remove a capa quando a tecla ENTER é pressionada
            spawnarUrso(); // Spawna o urso quando o jogo é iniciado
            Greenfoot.playSound("musica.mp3");
        }
    }
    
    public void spawnarUrso() {
    Urso urso = new Urso();
    int x = getWidth() / 2; // Coordenada x no centro do mapa
    int y = getHeight() / 2; // Coordenada y no centro do mapa
    addObject(urso, x, y); // Adiciona o urso no centro do mapa
}

    public void spawnar()
    {
        spawnPeixonauta(); // Chama o método para spawnar peixes
    }

    public void spawnPeixonauta()
{
    int randomizarNumero = Greenfoot.getRandomNumber(100); // Gera um número aleatório
    
    if (randomizarNumero < 1.5) { // Define a probabilidade de spawnar um peixe
        int y = Greenfoot.getRandomNumber(getHeight()); // Coordenada y aleatória dentro da altura do mundo
        addObject(new Peixonauta(), 0, y); // Cria um novo Peixonauta na borda esquerda do mundo
    }
}

    public void spawnarAguaViva()
    {
        spawnAguaViva(); // Chama o método para spawnar aguas vivas
    }
    
    public void spawnAguaViva()
{
    int randomizarNumero = Greenfoot.getRandomNumber(100); // Gera um número aleatório
    
    if (randomizarNumero < 1.5) { // Aumentando a probabilidade de spawn
        int x = Greenfoot.getRandomNumber(getWidth()); // Coordenada x aleatória dentro da largura do mundo
        addObject(new aguaViva(), x, 0); // Cria uma nova água-viva na parte superior do mundo
    }
} 
}
