package EstruturaDecisao;
import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {
		//4.Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma letra:");
		String letra = sc.next();
		
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") 
			|| letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") 
			|| letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
			
		} else {
			System.out.println("Consoante");
		}
	}
}

