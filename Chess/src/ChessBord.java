
public class ChessBord {

	static private ChessBord instance = null;
	
	private ChessBord( ) {}
	static ChessBord getInstance() {
		if (instance == null) {
			instance = new ChessBord();
			return instance;
		}
		else
		   return instance;
	}
	
	public static void main (String args[])
	{
	
		ChessBord tabuleiro = ChessBord.getInstance();
		ChessBord tabuleiro1 = ChessBord.getInstance();
		System.out.println(tabuleiro);
		System.out.println(tabuleiro1);
		
	}
}
