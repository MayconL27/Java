package EstruturaSequencial;
import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		/* 15. Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		   Calcule e mostre o total	do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o 
		   Imposto de Renda, 8% para o INSS e 5% para o	sindicato, fa�a um programa que nos d�: sal�rio bruto.
		   quanto pagou ao INSS.
		   quanto pagou ao sindicato.
		   o sal�rio l�quido.
			calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
			+ Sal�rio Bruto : R$
			- IR (11%) : R$
			- INSS (8%) : R$
			- Sindicato ( 5%) : R$
			= Sal�rio Liquido : R$
			Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.
		 */
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora?");
		Double salarioHora = sc1.nextDouble();
		
		System.out.println("N�mero de horas trabalhadas no m�s?");
		Double horaTrabalho = sc1.nextDouble();
		
		Double salarioBruto = salarioHora * horaTrabalho;
		System.out.println("O sal�rio referido a este m�s � de: R$ " + salarioBruto); //Salario Bruto
		
		Double impostoRenda = (salarioBruto / 100) * 11; //IR de 11%
		System.out.println("IR (11%) : R$ " + impostoRenda);
		
		Double Inss = (salarioBruto / 100)  * 8; // INSS de 8%
		System.out.println("INSS (8%) : R$: " + Inss);
		
		Double Sindicato = (salarioBruto / 100)  * 5; //Sindicato 5%
		System.out.println("Sindicato (5%) : R$: " + Sindicato);
		
		Double descontos = impostoRenda + Inss + Sindicato; // soma de todos os descontos 
		Double salarioLiquido = salarioBruto - descontos; //total Sal�rio Liquido
		
		System.out.println("Sal�rio Liquido: " + salarioLiquido);
		
		
	}

}
