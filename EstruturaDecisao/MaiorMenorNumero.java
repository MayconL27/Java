package EstruturaDecisao;
import java.util.Scanner;

public class MaiorMenorNumero {

	public static void main(String[] args) {
		// 7.Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		int num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		int num3 = sc.nextInt();
		
		//Maior n�mero
		
		int maior = num1;
		
		if (num2 > num1 && num2 > num3) {
			maior = num2;
			System.out.println(maior + " � o maior.");
		}
		else if (num3 > num1 && num3 > num2) {
			maior = num3;
			System.out.println(maior + " � o maior.");
		}
		else {
			System.out.println(maior + " � o maior.");
		}
		
		//Menor numero
		
		int menor = num1;
		
		if (num2 < num1 && num2 < num3) {
			menor = num2;
			System.out.println(menor + " � o menor.");
		}
		else if (num3 < num1 && num3 < num2) {
			menor = num3;
			System.out.println(menor + " � o menor.");
		}
		else {
			System.out.println(menor + " � o menor.");
		}
				
		

	}

}
