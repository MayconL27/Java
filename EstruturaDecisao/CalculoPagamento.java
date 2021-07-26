package EstruturaDecisao;
import java.util.Scanner;

public class CalculoPagamento {

	public static void main(String[] args) {
		/* 12. Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o do Imposto de Renda, que
				depende do sal�rio bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Sal�rio Bruto,
				mas n�o � descontado (� a empresa que deposita). O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. O
				programa dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas trabalhadas no m�s.
				Desconto do IR:
				Sal�rio Bruto at� 900 (inclusive) - isento
				Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
				Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
				Sal�rio Bruto acima de 2500 - desconto de 20% 
				Imprima na tela as informa��es, dispostas conforme o exemplo abaixo. No exemplo o
				valor da hora � 5 e a quantidade de hora � 220.
				Sal�rio Bruto: (5 * 220) : R$ 1100,00
					(-) IR (5%) : R$ 55,00
					(-) INSS ( 10%) : R$ 110,00
					(-) FGTS (11%) : R$ 121,00
					Total de descontos : R$ 165,00
					Sal�rio Liquido : R$ 935,00
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite horas trabalhadas:");
		Double horaTrabalho = sc.nextDouble();
		System.out.println("Digite quanto voc� ganha por hora:");
		Double salarioHora = sc.nextDouble();
		
		Double salarioBruto = horaTrabalho * salarioHora;
		
		// Desconto do IR
		Double cinco = (salarioBruto / 100) * 5; // IR 5%
		Double dez = (salarioBruto / 100) * 10; // IR 10%
		Double vinte = (salarioBruto / 100) * 20; // IR 20%
		
		Double inss = (salarioBruto / 100) * 10; // INSS 10%
		Double fgts = (salarioBruto / 100) * 11; // FGTS 11%
		Double sindicato = (salarioBruto / 100) * 3; // Sindicato 3%
		
		
		// Sal�rio Bruto at� 900 (inclusive) - IR isento
		if (salarioBruto <= 900) {
			System.out.println("Seu sal�rio bruto � de: " + salarioBruto);
			System.out.println("(-) IR Insento");
			System.out.println("(-) INSS 10%: R$ " + inss);
			System.out.println("(-) FGTS 11%: R$ " + fgts);
			System.out.println("Sal�rio Liquido: R$ " + (salarioBruto - inss));					
		}
		// Sal�rio Bruto at� 1500 (inclusive) - desconto IR de 5% 
		else if (salarioBruto > 900 && salarioBruto <= 1500) {
			System.out.println("Seu sal�rio bruto � de: " + salarioBruto);
			System.out.println("(-) IR 5%: R$ " + cinco);
			System.out.println("(-) INSS 10%: R$ " + inss);
			System.out.println("(-) FGTS 11%: R$ " + fgts);
			System.out.println("Sal�rio Liquido: R$ " + (salarioBruto - (cinco + inss )));		
		} 
		// Sal�rio Bruto at� 2500 (inclusive) - desconto IR de 10%
		else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			System.out.println("Seu sal�rio bruto � de: " + (salarioBruto - vinte));
			System.out.println("(-) IR 10%: R$ " + dez);
			System.out.println("(-) INSS 10%: R$ " + inss);
			System.out.println("(-) FGTS 11%: R$ " + fgts);
			System.out.println("Sal�rio Liquido: R$ " + (salarioBruto - (dez + inss)));							
		}
		// Sal�rio Bruto acima de 2500 - desconto IR de 20%
				else if (salarioBruto > 2500) {
					System.out.println("Seu sal�rio bruto � de: " + (salarioBruto - vinte));
					System.out.println("(-) IR 20%: R$ " + vinte);
					System.out.println("(-) INSS 10%: R$ " + dez);
					System.out.println("(-) FGTS 11%: R$ " + fgts);
					System.out.println("Sal�rio Liquido: R$ " + (salarioBruto - (vinte + inss)));		
		}
	}					
}


