package EstruturaDecisao;
import java.util.Scanner;

public class MaiorTresNumeros {

	public static void main(String[] args) {
		// 6. Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros diferentes, Digite o primeiro n�mero:");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero:");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		int num3 = sc.nextInt();
				
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " � maior que " + num2 + " e " + num3);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " � maior que " + num1 + " e " + num3);
		}
		else if (num3 > num1 && num3 > num1) {
			System.out.println(num3 + " � maior que " + num1 + " e " + num2);
		}
		
	}

}
