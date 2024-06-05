package jogodesenvolvido.armas;

import javax.swing.ImageIcon;
import jogodesenvolvido.InOut;

public class Revolver implements Arma_IF {
    public Revolver(){
        InOut.revolver();
    }
    @Override
    public void usarArma(int i, int c) {
        ImageIcon img = new ImageIcon("C:\\Users\\notbo\\Downloads\\AcertoRevolver.PNG");
        InOut.ataque(i, c, img);
    }
    
}
