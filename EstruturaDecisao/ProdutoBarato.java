package EstruturaDecisao;
import java.util.Scanner;

public class ProdutoBarato {

	public static void main(String[] args) {
		/* 8. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual 
			produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do produto um:");
		Double p1 = sc.nextDouble();
		
		System.out.println("Digite o pre�o do produto dois:");
		Double p2 = sc.nextDouble();
		
		System.out.println("Digite o pre�o do produto tr�s:");
		Double p3 = sc.nextDouble();
		
		if (p1 < p2 && p1 < p3) {
			System.out.println("O primeiro produto � mais barato: R$ " + p1);
		} 
		else if (p2 < p1 && p2 < p3) {
			System.out.println("O segundo produto � mais barato: R$ " + p2);
		}
		else if (p3 < p1 && p3 < p2) {
			System.out.println("O terceiro produto � mais barato: R$ " + p3);
		}
		

	}

}
