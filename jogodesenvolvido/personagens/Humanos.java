package jogodesenvolvido.personagens;

import jogodesenvolvido.InOut;

public abstract class Humanos extends Personagem{
    
   public void falar(){
       System.out.println("Obrigado por me ajudar grifo.");
   }
   public void correr(){
       InOut.Correr();
   }
    @Override
    abstract public void desenhar();
}
