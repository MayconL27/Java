package EstruturaDecisao;
import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		// 1.Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro n�mero inteiro:");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " � maior que " + num2);
		}
		else if (num2 > num1){
			System.out.println(num2 + " � maior que " + num1);
		}
		else {
			System.out.println("N�meros iguais");
		}	
	}
}
