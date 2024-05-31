package jogodesenvolvido.personagens;

import jogodesenvolvido.InOut;

public class Soldado extends Humanos{
    //construtor para desenho
    public Soldado(int i){
        
    }
    public Soldado(){
        InOut.soldado("Seu personagem é o soldado"); 
    }
    @Override
    public void desenhar(){
        System.out.println("""
                                  .---.
                                 /_____\\
                                 ( '.' )
                                  \\_-_/_
                               .-"`'V'//-.
                              / ,   |// , \\
                             / /|Ll //Ll|\\ \\
                            / / |__//   | \\_\\
                            \\ \\/---|[]==| / /
                             \\/\\__/ |   \\/\\/
                              |/_   | Ll_\\|
                                |`^\"""^`|
                                |   |   |
                                |   |   |
                                |   |   |
                                |   |   |
                                L___l___J
                                 |_ | _|
                                (___|___)
                                 ^^^ ^^^""");
    }
}
