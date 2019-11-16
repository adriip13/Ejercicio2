package EjerciciosObligatorios;

import java.util.Scanner;

public class Ejercicio18_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sr = new Scanner(System.in);

		double precio=0;
		int articulo;
		int cantidad; // Litros
		int facturas = 0;
		int total = 0;
		int emitir = 0;
		double litros;
		int tlitros = 0;

		do {

			
			
			facturas++;
			System.out.println("Factura Nº " + facturas);
			System.out.println("Introduce el codigo del Artículo : ");
			articulo=sr.nextInt();
			System.out.println("Litros vendidos del producto");
			cantidad = sr.nextInt();
			
			switch (articulo) {
			
			case 1 : 
				precio = 0.6;
				break;
				
			case 2 :
				precio = 3;
				break;
				
			case 3 : 
				precio = 1.25;
				
			}

			
			tlitros += cantidad;
			litros = cantidad * precio;
			total += litros;

			if (total >= 600) {
				emitir++;
			}
			
			if (articulo > 3) {
				System.out.println("ERROR , PRECIO NO ENCONTRADO");
			}
		} while (facturas < 5);

		System.out.println("La facturación Total fue de " + total + "€");
		System.out.println("La cantidad en Litros es de " + tlitros);
		System.out.println("Se emetieron " + emitir + " Facturas de mas de 600 €");
		sr.close();
		

	}

}
