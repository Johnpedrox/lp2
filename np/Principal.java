	public class Principal{
		public static void main(String [] args){
			Exemplo e1 = new Exemplo();
			e1.incrementar();
			Exemplo e2 = new Exemplo();
			System.out.println(Exemplo.x);  // 3
			Exemplo e3 = new Exemplo();
			e3.incrementar();
			System.out.println(Exemplo.x); // 4
			Exemplo.dec();
			System.out.println(Exemplo.x); // 3
		}
	}
