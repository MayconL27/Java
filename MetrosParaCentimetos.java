package EstruturaSequencial;
import java.util.Scanner;

public class MetrosParaCentimetos {

	public static void main(String[] args) {
		// 5. Faša um Programa que converta metros para centÝmetros.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os metros para transforma em centÝmetros:");
		Double m = sc.nextDouble(); // Metros.
		
		Double cm = m * 100; // centÝmetros
		
		
		System.out.println( m + " metros, convertidos em centÝmetros Ú igual a " + cm + "cm");
		

	}

}
