package EstruturaDeRepeticao;
import java.util.Scanner;

public class PopulacaoPais2 {
	
	public static void main(String[] args) {
		/*
         * 5. Altere o programa anterior permitindo ao usu�rio informar as popula��es e
         * as taxas de crescimento iniciais. Valide a entrada e permita repetir a
         * opera��o.
         */
        Scanner sc = new Scanner(System.in);
        Double paisA, paisB, taxaA, taxaB;
        Double cont = 0.0;
        boolean infoValido = false;

        do {
            System.out.println("Informe a popula��o atual do pa�s A:");
            paisA = sc.nextDouble();
        
            if (paisA > 0){
                infoValido = true;
            } else {
                System.out.println("Digite um n�mero maior que zero!");
            }
        }while(!infoValido);

        infoValido = false;

        do {
            System.out.println("Informe a popula��o atual do pa�s B:");
            paisB = sc.nextDouble();
        
            if (paisB > 0){
              infoValido = true;
            } else {
                System.out.println("Digite um n�mero maior que zero!");
            }
        }while(!infoValido);

        infoValido = false;
        
        do {
            System.out.println("Informe a taxa de crescimento do pais A:");
            taxaA = sc.nextDouble();
        
            if (taxaA > 0){
               infoValido = true;
            } else {
                System.out.println("Digite um n�mero maior que zero!");
            }
        }while(!infoValido);

        infoValido = false;

        do {
            System.out.println("Informe a taxa de crescimento do pais B:");
            taxaB = sc.nextDouble();
        
            if (taxaB > 0){
              infoValido = true;
            } else {
                System.out.println("Digite um n�mero maior que zero!");
            }
        }while(!infoValido);

            int contador = 0;

         while (paisA < paisB) {
            paisA += (paisA / 100) * taxaA;
            paisB += (paisB / 100) * taxaB;
            contador++;
         }
         System.out.println(contador + " Anos para passar a popula��o B.");
         System.out.println("Popula��o A: " + paisA);
         System.out.println("Popula��o B: " + paisB);

     
		
		
		
	}

}
