package jogodesenvolvido.personagens;

import jogodesenvolvido.InOut;

public class Mago extends Humanos{
    //construtor para desenho
    public Mago(int i){
        
    }
    public Mago(){
        InOut.mago("O seu personagem é o mago.");
    }
    @Override
    public void desenhar() {
        System.out.println("""
                           Gandalf
                                                             ....
                                                           .'' .'''
                           .                             .'   :
                           \\\\                          .:    :
                            \\\\                        _:    :       ..----.._
                             \\\\                    .:::.....:::.. .'         ''.
                              \\\\                 .'  #-. .-######'     #        '.
                               \\\\                 '.##'/ ' ################       :
                                \\\\                  #####################         :
                                 \\\\               ..##.-.#### .''''###'.._        :
                                  \\\\             :--:########:            '.    .' :
                                   \\\\..__...--.. :--:#######.'   '.         '.     :
                                   :     :  : : '':'-:'':'::        .         '.  .'
                                   '---'''..: :    ':    '..'''.      '.        :'
                                      \\\\  :: : :     '      ''''''.     '.      .:
                                       \\\\ ::  : :     '            '.      '      :
                                        \\\\::   : :           ....' ..:       '     '.
                                         \\\\::  : :    .....####\\\\ .~~.:.             :
                                          \\\\':.:.:.:'#########.===. ~ |.'-.   . '''.. :
                                           \\\\    .'  ########## \\ \\ _.' '. '-.       '''.
                                           :\\\\  :     ########   \\ \\      '.  '-.        :
                                          :  \\\\'    '   #### :    \\ \\      :.    '-.      :
                                         :  .'\\\\   :'  :     :     \\ \\       :      '-.    :
                                        : .'  .\\\\  '  :      :     :\\ \\       :        '.   :
                                        ::   :  \\\\'  :.      :     : \\ \\      :          '. :
                                        ::. :    \\\\  : :      :    ;  \\ \\     :           '.:
                                         : ':    '\\\\ :  :     :     :  \\:\\     :        ..'
                                            :    ' \\\\ :        :     ;  \\|      :   .'''
                                            '.   '  \\\\:                         :.''
                                             .:..... \\\\:       :            ..''
                                            '._____|'.\\\\......'''''''.:..'''
                                                       \\\\""");
    }
     
}