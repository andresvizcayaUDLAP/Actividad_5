package Geometria;

public class Cuadrado {
	
	double lado;
	
	public Cuadrado() {
		this(178190);
	}
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double diagonal() {
		double d = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
		return d;
	}
	
	public double perimetro() {
		double p = 4 * lado;
		return p;
	}
	
	public double area() {
		double a = lado * lado;
		return a;
	}
}
