public class Janela{
	public static Janela instancia;
	private Janela(){
	}
	public static Janela getInstancia(){
		if(instancia == null)
			instancia = new Janela();
		return instancia;
	}
}
