
public class ChessBord {

	static private ChessBord instance = null; //instancia unica
	/*instance = null PRA NÃO FICAR CRIANDO OBJETOS SEMPRE QUE EU RODAR O PROGRAMA
	 *if (instance == null) SO VAI CRIAR O OBJETO SE ELE AINDA NÃO FOI CRIADO
	 * */
	
	private ChessBord( ) {} //privado pra nenhuma outra classe criar outra instancia
	static ChessBord getInstance() { //modo de chamar a instancia
		if (instance == null) {
			instance = new ChessBord();
			return instance;
		}
		else
		   return instance;
	}
	
	public static void main (String args[])
	{
	
		ChessBord tabuleiro = ChessBord.getInstance(); //objeto 
		ChessBord tabuleiro1 = ChessBord.getInstance();
		System.out.println(tabuleiro);
		System.out.println(tabuleiro1);
		
	}
}
