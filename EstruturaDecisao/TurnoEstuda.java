package EstruturaDecisao;
import java.util.Scanner;

public class TurnoEstuda {

	public static void main(String[] args) {
		/* 10. Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a para digitar
		 * M-matutino ou V-Vespertino ou N- Noturno.
		 * imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu turno de estudo: M-matutino ou V-Vespertino ou N- Noturno.");
		String turno = sc.next();
		
		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		}
		else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		}
		else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		} 
		else {
			System.out.println("Inv�lido!");
		}	
	}
}
