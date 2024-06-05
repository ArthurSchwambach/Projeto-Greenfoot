package jogodesenvolvido.personagens;

import jogodesenvolvido.InOut;

public class LutSumo extends Humanos{
    //construtor para desenho
    public LutSumo(int i){
        
    }
    public LutSumo (){
        InOut.lutador("O seu personagem é o lutador");
    }
    @Override
    public void desenhar() {
        System.out.println("""
                                                           __
                                                       ,;.'--'.
                                                        /"/=,=(
                                                        \\(  __/
                                                     ___/    (____
                                                   .'     -  -    '.
                                                  /         v       \\
                                               __/    ,     |    \\   '-/'_
                                              {z, ,__/__,__/\\__,_ )__(   z}
                                               \\>'   (            \\_ `--c/
                                                  _.-'\\_      ,   / \\_
                                                 (      `.______.'    '.
                                                  \\   ,   \\    ( __     )
                                                   \\   )-'-\\__/-'  |   /
                                          snd       |  |          /  .'
                                                   /  ,)         (   \\_
                                                  oooO'           '--Ooo   """);
    }
    
}
