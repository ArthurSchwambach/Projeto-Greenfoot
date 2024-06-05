package jogodesenvolvido.personagens;

import jogodesenvolvido.InOut;

public class DragaoAlado extends Voadores{
    public DragaoAlado(){
        
    }
    @Override
    public void desenhar() {
        System.out.println("""
                           
                                         __
                                     _.-'.-'-.__
                                  .-'.       '-.'-._ __.--._
                           -..'\\,-,/..-  _         .'   \\   '----._
                            ). /_ _\\' ( ' '.         '-  '/'-----._'-.__
                            '..'     '-r   _      .-.       '-._ \\
                            '.\\. Y .).'       ( .'  .      .\\          '\\'.
                            .-')'|'/'-.        \\)    )      '',_      _.c_.\\
                              .<, ,>.          |   _/\\        . ',   :   : \\\\
                             .' \\_/ '.        /  .'   |          '.     .'  \\)
                                             / .-'    '-.        : \\   _;   ||
                                            / /    _     \\_      '.'\\ ' /   ||
                                           /.'   .'        \\_      .|   \\   \\|
                                          / /   /      __.---'      '._  ;  ||
                                         /.'  _:-.____< ,_           '.\\ \\  ||
                                        // .-'     '-.__  '-'-\\_      '.\\/_ \\|
                                       ( };====.===-==='        '.    .  \\\\: \\
                                        \\\\ '._        /          :   ,'   )\\_ \\
                                         \\\\   '------/            \\ .    /   )/
                                          \\|        _|             )Y    |   /
                                           \\\\      \\             .','   /  ,/
                                            \\\\    _/            /     _/
                                             \\\\   \\           .'    .'
                                              '| '1          /    .'
                                                '. \\        |:    /
                                                  \\ |       /', .'
                                                   \\(      ( ;z'
                                                    \\:      \\ '(_
                                                     \\_,     '._ '-.___
                                           snd                   '-' -.\\
                                                Art by Shanaka Dias            """);
    }  

    @Override
    public void voar() {
        InOut.Perdeu();
    }
}
