package EstruturaDecisao;
import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {
		// 2.Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se � positivo ou negativo: ");
		int num1 = sc.nextInt();
		
		if (num1 > 0) {
			System.out.println(num1 + " � um n�mero positivo");
		}
		else if (num1 < 0){
			System.out.println(num1 + " � um n�mero negativo");
		}
		else {
			System.out.println("N�mero 0 n�o � postivo nem negativo");
		}
	}
}
