package EstruturaDecisao;
import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		/* 11. As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contraram para desenvolver o
			programa que calcular� os reajustes.
			Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio
			atual:
			sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
			sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
			sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
			sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na tela:
			o sal�rio antes do reajuste;
			o percentual de aumento aplicado;
			o valor do aumento;
			o novo sal�rio, ap�s o aumento.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu sal�rio atual:");
		Double salario = sc.nextDouble();
		Double salarioAumento;
		Double salarioTotal;
		
		System.out.println("Seu sal�rio �: R$ " + salario);
		if (salario < 280.00) {
			salarioAumento = (salario/100)*20; // 20%
			salarioTotal = salario + salarioAumento;
			System.out.println("Percetual de aumento de 20%: R$% " + salarioAumento);
			System.out.println("Seu sal�rio agora �: R$ " + salarioTotal);
		}
		else if (salario >= 280.00 && salario <= 700.00) {
			salarioAumento = (salario/100)*15; // 15%
			salarioTotal = salario + salarioAumento;
			System.out.println("Percetual de aumento de 15%: R$% " + salarioAumento);
			System.out.println("Seu sal�rio agora �: R$ " + salarioTotal);
		}
		else if (salario > 700.0 && salario <= 1500.00) {
			salarioAumento = (salario/100)*10; // 10%
			salarioTotal = salario + salarioAumento;
			System.out.println("Percetual de aumento de 10%: R$% " + salarioAumento);
			System.out.println("Seu sal�rio agora �: R$ " + salarioTotal);
		}
		else if (salario > 1500.00) {
			salarioAumento = (salario/100)*5; // 5%
			salarioTotal = salario + salarioAumento;
			System.out.println("Percetual de aumento de 5%: R$% " + salarioAumento);
			System.out.println("Seu sal�rio agora �: R$ " + salarioTotal);
		}
		else {
			System.out.println("Op��o invalida");
		}
		

	}

}
