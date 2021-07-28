package EstruturaSequencial;
import java.util.Scanner;

public class SomaTresNumeros {

	public static void main(String[] args) {
		/* 11. Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
				o produto do dobro do primeiro com metade do segundo .
				a soma do triplo do primeiro com o terceiro.
				o terceiro elevado ao cubo.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro:");
		int num1 = sc.nextInt();	
		System.out.println("Digite o segundo n�mero inteiro:");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero real:");
		float num3 = sc.nextFloat();
		
		// O produto do dobro do primeiro com metade do segundo.
		int calculo1 = (num1 * 2) + (num2/2);
		System.out.println("o produto do dobro do primeiro com metade do segundo: \n" + calculo1);
		
		// A soma do triplo do primeiro com o terceiro.
		float calculo2 = (num1 * 3) + num3;
		System.out.println("soma do triplo do primeiro com o terceiro: \n "+ calculo2);
		
		// o terceiro elevado ao cubo.
		int soma3 = (int) Math.pow(num3, 3);
		System.out.println("O terceiro elevado ao cubo: \n" + soma3);
	}

}
