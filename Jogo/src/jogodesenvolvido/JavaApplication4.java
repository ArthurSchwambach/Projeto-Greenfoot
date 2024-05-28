package jogodesenvolvido;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class JavaApplication4 {

    
    public static void main(String[] args) {
        // Crie os botões personalizados
        JButton button1 = new JButton("General");
        JButton button2 = new JButton("Soldado");
        JButton button3 = new JButton("Mago");
        JButton button4 = new JButton("Sumo");
        // Crie um painel para conter os botões
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // Exiba a caixa de diálogo com o painel personalizado
        int opcao = JOptionPane.showOptionDialog(null, panel, "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        
        // Verifique qual botão foi clicado
        if (opcao == 0) {
            System.out.println("Opção 1 selecionada.");
        } else if (opcao == 1) {
            System.out.println("Opção 2 selecionada.");
        } else if (opcao == 2) {
            System.out.println("Opção 3 selecionada.");
        } else {
            System.out.println("Nenhuma opção selecionada.");
        }
    }
}

    


