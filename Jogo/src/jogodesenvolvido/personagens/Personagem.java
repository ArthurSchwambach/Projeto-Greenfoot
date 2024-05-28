package jogodesenvolvido.personagens;

import jogodesenvolvido.armas.Arma_IF;

public class Personagem {
   Arma_IF arma;
   
   void desenhar(){
       
   }
   
   void arma(){
       arma.usarArma();
   }
   
   void setArma (Arma_IF Arma){
       this.arma = Arma;
   }
   
   void correr(){
       
   }
   
   void voar() {
       
   }
   
}
