package EstruturaDecisao;
import java.util.Scanner;

public class SexoMasculinoOuFeminino {

	public static void main(String[] args) {
		/* 3.Fa�a um Programa que verifique se uma letra digitada � "F" ou "M".
		   Conforme a letra escrever: F - Feminino, M - Masculino, SexoInv�lido.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite F para Feminino ou M para Masculino:");
		String sexo = sc.next();
		
		if (sexo.equalsIgnoreCase("F")) { //sexo.equals compara��o de String
			System.out.println("Sexo feminino");
		}
		else if (sexo.equalsIgnoreCase("M")){
			System.out.println("Sexo masculino");
		}
		else {
			System.out.println("Op��o invalida");
		}
	}

}
