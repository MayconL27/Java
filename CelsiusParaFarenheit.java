package EstruturaSequencial;

import java.util.Scanner;

public class CelsiusParaFarenheit {

	public static void main(String[] args) {
		/* 10. Fa�a um Programa que pe�a a temperatura em graus 
			Celsius, transforme e mostre em graus Farenheit.
			�F = �C � 1, 8 + 32 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Celsius:");
		Double grausC = sc.nextDouble();
		
		Double grausF = grausC * 1.8 + 32; // �F = �C � 1, 8 + 32
		
		System.out.println(grausC + "�C = " + grausF + "�F");

	}

}
