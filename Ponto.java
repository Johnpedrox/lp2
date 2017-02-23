public class Ponto{
	private double x, y;
	public Ponto(){
		System.out.println("Construtor 1 - " + this);
	}
	public Ponto(double x){
		System.out.println("Construtor 2 - " + this);
		this.x = x;
		this.y = y;
	}
	public void setX(double x){
		this.x = x;
	}
	public double getX(){
		return this.x;
	}

	public void setY(double y){
		this.y = y;
	}
	public double getY(){
		return this.y;
	}










	public static void main(String args[]){
		System.out.println("JoaoPedro");
		Ponto p1 = new Ponto();
		p1.setX(10.0);
		p1.setY(15.0);
		Ponto p2 = new Ponto(9.00);
		p2.setX(20.0);
		p2.setY(30.0);
	//	Ponto p3 = new Ponto();
	//	p3.setX(50.0);
	//	p3.setY(70.0);
	//	p3 = p1;
	//	Ponto p4 = p3;
	//	System.out.println (p1.getX()+" "+p1.getY());
	//	System.out.println (p2.getX()+" "+p2.getY());
	//	System.out.println (p3.getX()+" "+p3.getY());
	//	double distancia, px, py, soma;
	//	px = (p2.getX() - p1.getX());
	//	py = (p2.getY() - p2.getY());
	//	soma = ((Math.pow(px,2)) +(Math.pow(py,2)));
	//	distancia = Math.sqrt(soma);
	//	System.out.println (distancia);
		Reta r1 = new Reta();
		r1.getP1().setX(10);
		r1.getP1().setY(15);
		r1.getP2().setX(20);
		r1.getP2().setX(30);
		System.out.println (r1.getP1().getX()+" /  "+r1.getP1().getY()+" /  "+r1.getP2().getX()+" /  "+r1.getP2().getX());
		
	}

}
