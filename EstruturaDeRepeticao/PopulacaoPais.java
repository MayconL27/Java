package EstruturaDeRepeticao;

public class PopulacaoPais {

	public static void main(String[] args) {
		 /*
         * 4.Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com
         * uma taxa anual de crescimento de 3% e que a popula��o de B seja 200000
         * habitantes com uma taxa de crescimento de 1.5%. Fa�a um programa que calcule
         * e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A
         * ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.
         */
        Double paisA = 80.000;
        Double paisB = 200.000;
        Double cont = 0.0;

        while (paisA < paisB) {

            paisA += (paisA / 100) * 3; // 3% de crescimento da popula��o A.
            paisB += (paisB / 100) * 1.5; // 1.5% de cresimento da popula��o B.
            cont++;
        }
        System.out.println("Popula��o A " + paisA);
        System.out.println("Popula��o B " + paisB);
        System.out.println("Anos:" + cont);
    }

}


