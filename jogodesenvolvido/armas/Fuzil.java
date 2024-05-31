package jogodesenvolvido.armas;

import javax.swing.ImageIcon;
import jogodesenvolvido.InOut;

public class Fuzil implements Arma_IF {
    public Fuzil(){
        InOut.fuzil();
    }
    @Override
    public void usarArma(int i, int c) {
        ImageIcon img = new ImageIcon("C:\\Users\\notbo\\Downloads\\AcertoFuzil.PNG");
        InOut.ataque(i, c, img);
    }
    
}
