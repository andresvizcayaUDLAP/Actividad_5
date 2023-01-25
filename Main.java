package Geometria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String opcion;
		char opcion1;
		Scanner scan = new Scanner(System.in);
		boolean validacion;
		
		do {
			
			System.out.println("¿Qué figura quieres crear? ");
			opcion = scan.nextLine();
			
			if(opcion.equalsIgnoreCase("cuadrado")) {
				
				double lado;
				System.out.print("¿Cuanto mide el lado del cuadrado? ");
				lado = Double.parseDouble(scan.nextLine());
				
				System.out.println("a) Diagonal");
				System.out.println("b) Perimetro");
				System.out.println("c) Area");
				
				System.out.println("Indica la letra de la opción que deseas calcular: ");
				opcion1 = scan.next().charAt(0);
				
				Cuadrado cuadrado1 = new Cuadrado(lado);
				System.out.println("Cuadrado");
				
				switch(opcion1) {
				case 'a': System.out.println("Diagonal: " + cuadrado1.diagonal()); break;
				case 'b': System.out.println("Perímetro: " + cuadrado1.perimetro()); break;
				case 'c': System.out.println("Área: " + cuadrado1.area()); break;
				default: System.out.println("No es válido"); break;
				}
	
				
			} else if(opcion.equalsIgnoreCase("circulo")) {
				
				double radio = 0;
				System.out.println("¿Cuanto mide el radio del círculo? ");
				radio = Double.parseDouble(scan.nextLine());
				
				System.out.println("a) Circunferencia");
				System.out.println("b) Área");
				
				System.out.println("Indica la letra de la opción que deseas calcular: ");
				opcion1 = scan.next().charAt(0);
				System.out.println(radio);
			
				Circulo circulo1 = new Circulo(radio);
				System.out.println("Círculo");
				
				switch(opcion1) {
					case 'a': System.out.println("Circunferencia: " + circulo1.circunferencia()); break;
					case 'b': System.out.println("Área: " + circulo1.area()); break;
					default: System.out.println("No es válido");  break;
				}
				
			} else System.out.println("Elige una opción correcta");
			
			if(opcion.equalsIgnoreCase("cuadrado")||opcion.equalsIgnoreCase("circulo")) {
				validacion = true;
			} else {
				validacion = false;
			}
			
		} while(validacion==false);
		
		scan.close();
	}
		
}
