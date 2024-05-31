package jogodesenvolvido;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/** 
 * A classe <i>leDadosWin</i> permite a leitura de dados de tipos nativos e de 
 * instancias da classe <i>String</i> a partir do teclado, atraves de uma 
 * janela. Basicamente esta classe encapsula o funcionamento dos metodos da clase
 * <i>JOptionPane</i>, que pode ser usado como entrada padrao de dados.
 * <ul>
 * <li>Os metodos sao estaticos para facilitar o uso da classe
 * <li>Criacao de metodos sobrecarregados para que valores <i>default</i> possam ser 
 *     usados
 * <li>Tratamento das excecoes
 * </ul>  
 */
public class InOut {
	/**
	 * Este metodo eh para entrada de uma String. Tem como parametro de entrada
	 * uma String que indicara para o usuario qual o dado que sera lido naquele
	 * momento por aquela caixa de texto e retorna a String lida
	 * 
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return String que foi lida
	 */   
    
	public static String leString (String frase){
		String Entrada;
		
		Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
		return Entrada;
	}
	
	/**
	 * Este metodo eh para entrada de um objeto do tipo byte. Tem como parametro 
	 * de entrada uma String que indicara para o usuario qual o dado que sera 
	 * lido naquele momento por aquela caixa de texto. 
	 * Le entao uma String e a converte para um objeto do tipo byte. 
	 * Se na conversao ocorrer algum erro, o processo sera feito novamente, 
	 * ou seja, sera lida outra String e convertida para byte. O processo soh 
	 * para quando a conversao for bem sucedida.  
	 * 
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo byte
	 */
	public static byte leByte (String frase){
		byte num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
				num = Byte.parseByte(Entrada);
				ERRO = false;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								    "BYTE", "   >>>      ERRO     <<<", 
								    JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}
	
	/**
	 * Este metodo eh para entrada de um objeto do tipo short. Tem como parametro 
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto. 
	 * Le entao uma String e a converte para um objeto do tipo short. 
	 * O processo so para quando a conversao for bem sucedida.  
	 * 
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo short
	 */
	public static short leShort (String frase){
		short num=0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
				num = Short.parseShort(Entrada);
				ERRO = false;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								    "SHORT", "   >>>      ERRO     <<<", 
								    JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}
	
	/**
	 * Este metodo eh para entrada de um objeto do tipo int. Tem como parametro 
	 * de entrada uma String que indicara para o usuario qual o dado que sera 
	 * lido naquele momento por aquela caixa de texto. 
	 * Le entao uma String e a converte para um objeto do tipo int. 
	 * O processo so para quando a conversao for bem sucedida.  
	 * 
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo int
	 */
	public static int leInt (String frase){
		int num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
				num = Integer.parseInt(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								    "INTEIRO ", "   >>>      ERRO     <<<", 
								    JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);		
		return num;
	}
	
	/**
	 * Este metodo eh para entrada de um objeto do tipo long. Tem como parametro 
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto. 
	 * Le entao uma String e a converte para um objeto do tipo long. 
	 * O processo so para quando a conversao for bem sucedida.  
	 * 
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo long
	 */
	public static long leLong (String frase){
		long num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
				num = Long.parseLong(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								    "LONG ", "   >>>      ERRO     <<<", 
								    JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);		
		return num;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo float. Tem como parametro 
	 * de entrada uma String que indicara para o usuario qual o dado que sera 
	 * lido naquele momento por aquela caixa de texto. 
	 * Le entao uma String e a converte para um objeto do tipo float. 
	 * O processo so para quando a conversao for bem sucedida.  
	 * 
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo float
	 */
	public static float leFloat (String frase){
		float num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
				num = Float.parseFloat(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog( null , "VALOR DEVE SER UM NUMERO DO TIPO " +
 								    "FLOAT", "   >>>      ERRO     <<<", 
								    JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo double. Tem como paraametro 
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto. 
	 * Le entao uma String e a converte para um objeto do tipo double. 
	 * O processo so para quando a conversao for bem sucedida.  	 
	 * 
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo double
	 */
	public static double leDouble (String frase){
		double num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
				num = Double.parseDouble(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								    "DOUBLE", "   >>>      ERRO     <<<", 
								    JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}

	/**
	 * Este metodo eh para entrada de um objeto do tipo char. Tem como parametro 
	 * de entrada uma String que indicara para o usuario qual o dado que sera
	 * lido naquele momento por aquela caixa de texto. 
	 * Le entao uma String e retorna apenas o primeiro caracter da String.  
	 * 
	 * @param frase que sera usada para o usuario saber qual dado sera lido
	 * @return um objeto do tipo char
	 */
	public static char leChar (String frase){
		String Entrada;
		boolean ERRO;
		
		do{
			Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
			if (Entrada.length()!= 0)
				ERRO = false;
			else
				ERRO = true;
		}while (ERRO);
		return Entrada.charAt(0);
	}
	
	/**
	 * Este metodo foi criado para mandar uma mensagem com o icone de
	 * ERRO
	 *  
	 * @param cabecalho que aparecera no topo da mensagem
	 * @param frase     que aparecera dentro da caixa de mensagem
	 */
	public static void MsgDeErro(String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Este metodo foi criado para mandar uma mensagem com o icone de
	 * INFORMACAO
	 *  
	 * @param cabecalho que aparecer no topo da mensagem
	 * @param frase     que aparecera dentro da caixa de mensagem
	 */
	public static void MsgDeInformacao(String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho, JOptionPane.INFORMATION_MESSAGE);
	}

        public static void Erro(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Erro.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label, "ERRO!!!",  JOptionPane.PLAIN_MESSAGE);
	}
        //armas
        public static void desarmado(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Desarmado.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label, "Você está desarmado",  JOptionPane.PLAIN_MESSAGE);
	}
        public static void fuzil(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Fuzil.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label, "Sua arma é um fuzil",  JOptionPane.PLAIN_MESSAGE);
	}
        
        public static void revolver(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Revolver.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label, "Sua arma é um revolver",  JOptionPane.PLAIN_MESSAGE);
	}
        
        public static void faca(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Faca.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label, "Sua arma é uma faca",  JOptionPane.PLAIN_MESSAGE);
	}
        
        public static void armagrifo(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\armagrifo.JPEG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label, "Sua arma é ",  JOptionPane.PLAIN_MESSAGE);
	}
        
        public static void magia(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Cajado.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label, "Sua arma é magia",  JOptionPane.PLAIN_MESSAGE);
	}
        //ataque
        public static void ataque(int jog, int dragon, ImageIcon img){
                JLabel label = new JLabel(img, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label," você " + jog + " x Dragão " + dragon + "",  JOptionPane.PLAIN_MESSAGE);
	}
        //correr
        public static void Correr(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Correr.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label,"Por pouco",  JOptionPane.PLAIN_MESSAGE);
	}
        //ganhou
        public static void Ganhou(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Vencedor.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label,"Uhuu! Você ganhou!!!!!!!",  JOptionPane.PLAIN_MESSAGE);
	}
        //perdeu
        public static void Perdeu(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Derrota.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label,"Que pena, você perdeu",  JOptionPane.PLAIN_MESSAGE);
	}
        //empate
        public static String empate(){
		String Entrada;
		ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Empate.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
                Entrada = JOptionPane.showInputDialog (null, label, "Escolha um caminho para pedir ajuda a um grifo", JOptionPane.PLAIN_MESSAGE);
		return Entrada;
	}
        //trocararmanao
        public static void mudarArmaNao(){
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\NaoPodeMudarDeArma.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label,"Aviso",  JOptionPane.PLAIN_MESSAGE);
	}
        //capa
        public static void capa(String frase){
            ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\OneDrive\\Documentos\\NetBeansProjects\\JavaApplication\\Jogo\\src\\jogodesenvolvido\\Capa.png");
            JLabel label = new JLabel(icon, JLabel.CENTER);    
            JOptionPane.showMessageDialog(null, label, frase, JOptionPane.PLAIN_MESSAGE);
	}
        //PERSONAGENS
        public static void soldado(String frase){
            ImageIcon img = new ImageIcon("C:\\Users\\notbo\\OneDrive\\Documentos\\NetBeansProjects\\JavaApplication\\Jogo\\src\\jogodesenvolvido\\Soldado.png");
            JLabel label = new JLabel (img, JLabel.CENTER);    
            JOptionPane.showMessageDialog(null, label, frase, JOptionPane.PLAIN_MESSAGE);
	}

        public static void general(String frase){
            ImageIcon img = new ImageIcon("C:\\Users\\notbo\\OneDrive\\Documentos\\NetBeansProjects\\JavaApplication\\Jogo\\src\\jogodesenvolvido\\General.png");
            JLabel label = new JLabel (img, JLabel.CENTER);    
            JOptionPane.showMessageDialog(null, label, frase, JOptionPane.PLAIN_MESSAGE);
	}
        
        public static void lutador(String frase){
            ImageIcon img = new ImageIcon("C:\\Users\\notbo\\OneDrive\\Documentos\\NetBeansProjects\\JavaApplication\\Jogo\\src\\jogodesenvolvido\\Lutador.png");
            JLabel label = new JLabel (img, JLabel.CENTER);    
            JOptionPane.showMessageDialog(null, label, frase, JOptionPane.PLAIN_MESSAGE);
	}

        public static void mago(String frase){
            ImageIcon img = new ImageIcon("C:\\Users\\notbo\\OneDrive\\Documentos\\NetBeansProjects\\JavaApplication\\Jogo\\src\\jogodesenvolvido\\Mago.png");
            JLabel label = new JLabel (img, JLabel.CENTER);    
            JOptionPane.showMessageDialog(null, label, frase, JOptionPane.PLAIN_MESSAGE);
	}
        
	/**
	 * Este metodo foi criado para mandar uma mensagem sem icone 
	 *  
	 * @param cabecalho que aparecera no topo da mensagem
	 * @param frase     que aparecera dentro da caixa de mensagem
	 */
	public static void MsgSemIcone(String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho, JOptionPane.PLAIN_MESSAGE);
	}
	
	/**
	 * Este metodo foi criado para mandar uma mensagem com o icone de
	 * AVISO
	 *  
	 * @param cabecalho que aparecera no topo da mensagem
	 * @param frase     que aparecera dentro da caixa de mensagem
	 */
	public static void MsgDeAviso (String cabecalho, String frase){
		JOptionPane.showMessageDialog(null, frase, cabecalho, JOptionPane.WARNING_MESSAGE);
	}
	
	public static int ledesenho (String frase){
		int num = 0;
                String ent;
		boolean ERRO;
               
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\EscolhaPersonagemDesenho.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
            
             
		do{
			try{
				ent = JOptionPane.showInputDialog(null, label, frase, JOptionPane.PLAIN_MESSAGE);
				num = Integer.parseInt(ent);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								    "INTEIRO ", "   >>>      ERRO     <<<", 
								    JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);		
		return num;
	}
        
        public static int leescolha (String frase){
		int num = 0;
                String ent;
		boolean ERRO;
               
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\OneDrive\\Documentos\\NetBeansProjects\\JavaApplication\\Jogo\\src\\jogodesenvolvido\\Escolha.png");
                JLabel label = new JLabel(icon, JLabel.CENTER);
            
             
		do{
			try{
				ent = JOptionPane.showInputDialog(null, label, frase, JOptionPane.PLAIN_MESSAGE);
				num = Integer.parseInt(ent);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								    "INTEIRO ", "   >>>      ERRO     <<<", 
								    JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);		
		return num;
	}
        
        public static int learma(){
		int num = 0;
                String ent;
		boolean ERRO;
                ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\EscolhaArmas.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
                do{
        		try{
                		ent = JOptionPane.showInputDialog(null, label, "Escolha sua arma", JOptionPane.PLAIN_MESSAGE);
				num = Integer.parseInt(ent);
				ERRO = false;
                            }
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM NUMERO DO TIPO " +
								    "INTEIRO ", "   >>>      ERRO     <<<", 
								    JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);		
		return num;
	}
        
        
        public static String lecomeco (){
		String Entrada;
		ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Escolha.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
                Entrada = JOptionPane.showInputDialog (null, label, "Entrada de dados", JOptionPane.PLAIN_MESSAGE);
		return Entrada;
	}
        
        public static String leCarta(){
		String Entrada;
		ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Cartas.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
                Entrada = JOptionPane.showInputDialog (null, label, "Escolha uma carta", JOptionPane.PLAIN_MESSAGE);
		return Entrada;
	}
        
        public static String continuar (){
		String Entrada;
		ImageIcon icon = new ImageIcon("C:\\Users\\notbo\\Downloads\\Escolha2.PNG");
                JLabel label = new JLabel(icon, JLabel.CENTER);
            
             
		Entrada = JOptionPane.showInputDialog (null, label, "Entrada de dados", JOptionPane.PLAIN_MESSAGE);
		return Entrada;
	}
        
        
        
        
/**
 * Exemplos...
 * @param args : Entrada de dados do cmd
 */
        public static void main(String [] args){
		String nome = leString("Digite o seu nome: ");
		int idade = leInt("Digite a sua idade: ");
		
		MsgDeInformacao("MsgDeInformacao", nome + " tem " + idade + " anos." );
		MsgSemIcone("MsgSemIcone", nome + " tem " + idade + " anos." );
		MsgDeAviso("MsgDeAviso", nome + " tem " + idade + " anos." );
	}


    
}
