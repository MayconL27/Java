package EstruturaDecisao;
import java.util.Scanner;

public class OrdemDecrescente {

	public static void main(String[] args) {
		// 9. Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		int num3 = sc.nextInt();
		
		if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
			System.out.println("Ordem decrescente �: " + num1 + num2 + num3);
		}
		else if (num1 >= num2 && num1 >= num3 && num3 >= num2) {
			System.out.println("Ordem decrescente �: " + num1 + num3 + num2);
		}
		else if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
			System.out.println("Ordem decrescente �: " + num2 + num1 + num3);
		}
		else if (num2 >= num1 && num2 >= num3 && num3 >= num1) {
			System.out.println("Ordem decrescente �: " + num2 + num3 + num1);
		}
		else if (num3 >= num1 && num3 >= num2 && num1 >= num2) {
			System.out.println("Ordem decrescente �: " + num3 + num1 + num2);
		}
		else if (num3 >= num1 && num3 >= num2 && num2 >= num1) {
			System.out.println("Ordem decrescente �: " + num3 + num2 + num1);
		}
		
	}
}


