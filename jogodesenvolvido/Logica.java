package jogodesenvolvido;

import java.util.Random;
import jogodesenvolvido.armas.Arma_IF;
import jogodesenvolvido.armas.Desarmado;
import jogodesenvolvido.armas.Faca;
import jogodesenvolvido.armas.Fuzil;
import jogodesenvolvido.armas.Magia;
import jogodesenvolvido.armas.Revolver;
import jogodesenvolvido.personagens.General;
import jogodesenvolvido.personagens.Humanos;
import jogodesenvolvido.personagens.LutSumo;
import jogodesenvolvido.personagens.Mago;
import jogodesenvolvido.personagens.Personagem;
import jogodesenvolvido.personagens.Soldado;

public class Logica{
    public void Logica (){
        
    }
    
    Arma_IF escolhaArma(int n, int p){
        Arma_IF arma = new Desarmado(1);
            
        if(p <= 3)
        {
            switch (n){
                case 1:
                    arma = new Desarmado();
                    break;
                case 2:
                    arma = new Faca();
                    break;
                case 3:
                    arma = new Revolver();
                    break;
                case 4:
                    arma = new Fuzil();
                    break;
                default:
                    break;
            }
        }
        else if(p == 4){
            arma = new Magia();
        }
        return arma;
    }
    
    public Humanos Persona(int escolha)
    {
        Humanos jogador = new Soldado(1);
        switch (escolha) {
            case 1:
                Soldado soldado = new Soldado();
                
                return soldado;
            case 2:
                General general = new General();
                return general;
            case 3:
                LutSumo lutador = new LutSumo();
                return lutador;
            case 4:
                Mago mago = new Mago();
                return mago;
            default:
                break;
        }
        return jogador;
    }
    
    
    
    public int Jogo(String jogador, Personagem person, Arma_IF arma, int i){
        Random random = new Random();
        int indice = random.nextInt(3);
        String [] cartas = {"RED", "BLUE", "GREEN"};
        String vilao = cartas[indice];
        if(jogador.equalsIgnoreCase("RED"))
        {
           if(vilao.equalsIgnoreCase("RED")){
               return 0;
           }
           else if(vilao.equalsIgnoreCase("BLUE")){
               return 2;
           }
           else if(vilao.equalsIgnoreCase("GREEN")){
               return 1;
           }
        }
       else if(jogador.equalsIgnoreCase("BLUE")){
           if(vilao.equalsIgnoreCase("RED")){
               return 1;
           }
           else if(vilao.equalsIgnoreCase("BLUE")){
               return 0;
           }
           else if(vilao.equalsIgnoreCase("GREEN")){
               return 2;
           }
       }
       else if(jogador.equalsIgnoreCase("GREEN")){
           if(vilao.equalsIgnoreCase("RED")){
               return 2;
           }
           else if(vilao.equalsIgnoreCase("BLUE")){
               return 1;
           }
           else if(vilao.equalsIgnoreCase("GREEN")){
               return 0;
           }
       }
       else if(jogador.equalsIgnoreCase("TROCAR")){
           if(i > 3){
               InOut.mudarArmaNao();
           }
           else{
                int n = InOut.learma();
                arma = escolhaArma(n, i);
                person.setArma(arma);
           }
       }
       return 3;
   }
    
    /**
     *
     * @param direcao
     * @return
     */
    public int empate(String direcao){
       Random random = new Random();
       int indice = random.nextInt(2);
       String [] caminho = {"DIREITA", "ESQUERDA"}; 
       String resposta = caminho[indice];
       if(resposta.equalsIgnoreCase(direcao))
       {
           return 1;
       }
       return 0;
   }
  
}
