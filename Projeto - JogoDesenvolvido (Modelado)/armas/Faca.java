package jogodesenvolvido.armas;

import javax.swing.ImageIcon;
import jogodesenvolvido.InOut;

public class Faca implements Arma_IF {
    public Faca(){
        InOut.faca();
    }
    @Override
    public void usarArma(int i, int c) {
        ImageIcon img = new ImageIcon("C:\\Users\\notbo\\Downloads\\AcertoFaca.PNG");
        InOut.ataque(i, c, img);
    }
   
}
