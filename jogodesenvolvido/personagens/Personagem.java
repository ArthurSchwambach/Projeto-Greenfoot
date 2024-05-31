package jogodesenvolvido.personagens;

import jogodesenvolvido.armas.Arma_IF;

public abstract class Personagem {
   public Arma_IF Arma;
   
   abstract public void desenhar();
   
   public void arma(int i, int c){
       Arma.usarArma(i, c);
   }
   
   public void setArma (Arma_IF Arma){
       this.Arma = Arma;
   }
   
}
