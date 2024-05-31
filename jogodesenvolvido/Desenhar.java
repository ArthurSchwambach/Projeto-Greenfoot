package jogodesenvolvido;

import jogodesenvolvido.personagens.DragaoAlado;
import jogodesenvolvido.personagens.General;
import jogodesenvolvido.personagens.Grifo;
import jogodesenvolvido.personagens.LutSumo;
import jogodesenvolvido.personagens.Mago;
import jogodesenvolvido.personagens.Personagem;
import jogodesenvolvido.personagens.Soldado;

public class Desenhar {
    public Desenhar(){
        
    }
    public void Desenho(int escolha){
        Personagem jogador;
        switch (escolha) {
            case 1:
                jogador = new Soldado(1);
                jogador.desenhar();
                break;
            case 2:
                jogador = new General(1);
                jogador.desenhar();
                
                break;
            case 3:
                jogador = new LutSumo(1);
                jogador.desenhar();
                break;
            case 4:
                jogador = new Mago(1);
                jogador.desenhar();
                break;
            case 5:
                jogador = new Grifo();
                jogador.desenhar();
                break;
            case 6:
                jogador = new DragaoAlado();
                jogador.desenhar();
                break;   
            default:
                break;
        }
    
    }
}
