package jogodesenvolvido.armas;

import javax.swing.ImageIcon;
import jogodesenvolvido.InOut;

public class Magia implements Arma_IF {
    public Magia (){
        InOut.magia();
    }
    @Override
    public void usarArma(int i, int c) {
        ImageIcon img = new ImageIcon("C:\\Users\\notbo\\Downloads\\AcertoMagia.PNG");
        InOut.ataque(i, c, img);
    }
}
