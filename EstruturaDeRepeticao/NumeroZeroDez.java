package EstruturaDeRepeticao;
import java.util.Scanner;


public class NumeroZeroDez {

	public static void main(String[] args) {
		/*
		 * 1. Fa�a um programa que pe�a uma nota, entre zero e dez. 
		 * Mostre uma mensagem caso o valor seja inv�lido e continue 
		 * pedindo
		 * at� que o usu�rio informe um valor v�lido.
		 */		
		
		boolean notaValida = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite uma nota entre zero e dez:");
			Double nota = sc.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Sua nota �: " + nota);
			}
			else {
				System.out.println("Nota inv�lida");
			}
		} while (!notaValida);	
	}
}