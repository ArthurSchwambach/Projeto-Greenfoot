package jogodesenvolvido;

import jogodesenvolvido.armas.Arma_IF;
import jogodesenvolvido.armas.Fireball;
import jogodesenvolvido.armas.Garras;
import jogodesenvolvido.personagens.DragaoAlado;
import jogodesenvolvido.personagens.Grifo;
import jogodesenvolvido.personagens.Humanos;

public class JavaApplication4 {

    
    public static void main(String[] args) {
        boolean continuar;
        String conti;
        Logica go = new Logica();
        
        InOut.capa("Magicwars");
        do{
            continuar = true;
            String opcao = InOut.lecomeco();
            if(opcao.equalsIgnoreCase("DESENHAR"))
            {
                while(continuar){
                    int escolha = InOut.ledesenho("Deseja desenhar qual personagem?");
                    Desenhar draw = new Desenhar();
                    draw.Desenho(escolha);
                    conti = InOut.continuar();
                    if(!conti.equalsIgnoreCase("SIM"))
                    {
                        continuar = false;
                    }
                }
            }
            else if (opcao.equalsIgnoreCase("JOGAR"))
            {
                int escolha = InOut.leescolha("Jogador Escolha seu personagem"), n = 0, i = 0, player = 0, dragao = 0;
                DragaoAlado dragon = new DragaoAlado();
                if(escolha <= 3){
                    n = InOut.learma();
                }
                Humanos jogador = (Humanos) go.Persona(escolha);
                Arma_IF arma = go.escolhaArma(n, escolha);
                jogador.setArma(arma);
                do{
                    String carta = InOut.leCarta();
                    int result = go.Jogo(carta, jogador, arma, escolha);
                    switch (result) {
                        case 1:
                            player++;
                            jogador.arma(player, dragao);
                            i++;
                            break;
                        case 2:
                            Arma_IF fogo = new Fireball();
                            dragon.setArma(fogo);
                            dragao++;
                            dragon.arma(player, dragao);
                            i++;
                            break;
                        case 0:
                            jogador.correr();
                            i++;
                            break;
                        default:
                            break;
                    }
                } while(i < 5);
                if(player > dragao){
                   InOut.Ganhou();
                }
                else if(dragao > player){
                   dragon.voar();
                }
                else{
                   String decisao = InOut.empate();
                   int fim = go.empate(decisao);
                   if(fim == 1){
                       Grifo amigo = new Grifo();
                       Garras garra = new Garras();
                       amigo.setArma(garra);
                       player++;
                       amigo.arma(player, dragao);
                       amigo.voar();
                   }
                   else{
                       dragon.voar();
                   }
                }
                conti = InOut.continuar();
                if(!conti.equalsIgnoreCase("SIM"))
                {
                    continuar = false;
                }
            }
            else {
                InOut.Erro();
                conti = InOut.continuar();
                if(!conti.equalsIgnoreCase("SIM"))
                {
                    continuar = false;
                }
            }
           
        } while(continuar);
    }
}

    


    


