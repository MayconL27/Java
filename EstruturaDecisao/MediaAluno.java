package EstruturaDecisao;
import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		/* 5.Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular 
		    a m�dia alcan�ada por aluno e apresentar:
			A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
			A mensagem "Reprovado", se a m�dia for menor do que sete;
	 		mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota:");
		Double nota1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota:");
		Double nota2 = sc.nextDouble();
		
		Double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media < 10) {
			System.out.println("Parab�ns voc� foi aprovado: " + media);		
		}
		else if (media >= 10) {
			System.out.println("Aprovado com Distin��o: " + media);
		}
		else {
			System.out.println("Reprovado: " + media);
		}
			
	}

}
