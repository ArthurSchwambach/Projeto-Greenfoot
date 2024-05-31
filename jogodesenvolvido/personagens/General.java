package jogodesenvolvido.personagens;

import jogodesenvolvido.InOut;

public class General extends Humanos{
    //construtor para desenho
    public General(int i){
        
    }
    public General(){
        InOut.general("O seu personagem é o general.");
    }

    @Override
    public void desenhar() {
        System.out.println("""
                                ----.
                               "   _}
                               "@   >
                               |\\   7
                               / `-- _         ,-------,****
                            ~    >o<  \\---------o{___}-
                           /  |  \\  /  ________/8'
                           |  |       /         "
                           |  /      |""");
    }
}
