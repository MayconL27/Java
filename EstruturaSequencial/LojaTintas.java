package EstruturaSequencial;
import java.util.Scanner;

public class LojaTintas {

	public static void main(String[] args) {
		/* 16. Fa�a um programa para uma loja de tintas. O programa dever� pedir 
		  	o tamanho em metros quadrados da �rea a ser pintada.
			Considere que a cobertura da tinta � de 1 litro para cada 3 metros quadrados 
			e que a tinta � vendida em latas de 18 litros, que
			custam R$ 80,00. Informe ao usu�rio a quantidades de latas de tinta a serem compradas e o pre�o total.
		*/
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Metros da �rea a ser pintada: ");
		Double metros = sc.nextDouble();
		
		Double litro = metros / 3; // 1 litro para cada 3 metros quadrados 
		Double lataValor = 80.0; // Cada tinta R$ 80,00.
		Double lataCapacidade = 18.0; // latas de 18 litros.
		
		Double latas = litro / lataCapacidade; //quantidades de latas de tinta.
		Double preco = latas * lataValor; // quantidades de latas de tinta.
		
		System.out.println("Tintas a serem usadas: " + latas + " Latas");
		System.out.println("Valor a ser gasto: R$ " + preco);
		
		
		
		
		
		
		
	}

}
