package EstruturaSequencial;
import java.util.Scanner;

public class MetrosParaCentimetos {

	public static void main(String[] args) {
		// 5. Fa�a um Programa que converta metros para cent�metros.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os metros para transforma em cent�metros:");
		Double m = sc.nextDouble(); // Metros.
		
		Double cm = m * 100; // cent�metros
		
		
		System.out.println( m + " metros, convertidos em cent�metros � igual a " + cm + "cm");
		

	}

}
