package jogodesenvolvido.armas;

import javax.swing.ImageIcon;
import jogodesenvolvido.InOut;

public class Desarmado implements Arma_IF {
    public Desarmado (int i){
        
    }
    public Desarmado (){
        InOut.desarmado();
    }
    @Override
    public void usarArma(int i, int c){
        ImageIcon img = new ImageIcon("C:\\Users\\notbo\\Downloads\\AcertoDesarmado.PNG");
        InOut.ataque(i, c, img);
    }
}
