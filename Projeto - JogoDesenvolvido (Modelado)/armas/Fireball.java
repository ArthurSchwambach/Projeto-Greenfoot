package jogodesenvolvido.armas;

import javax.swing.ImageIcon;
import jogodesenvolvido.InOut;

public class Fireball implements Arma_IF {

    @Override
    public void usarArma(int i, int c) {
        ImageIcon img = new ImageIcon("C:\\Users\\notbo\\Downloads\\AcertoDragao.PNG");
        InOut.ataque(i, c, img);
    }
}
