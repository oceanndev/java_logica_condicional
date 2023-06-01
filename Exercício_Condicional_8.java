/*
 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais
 */
import java.util.Scanner;
public class Exercício_Condicional_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, a, b, c;
		System.out.println("Valor salário: ");
		sal = sc.nextDouble();
		if (sal < 2000) {
			System.out.println("Isento");
		}
		else if (sal <= 3000) {
		      a = sal - 2000;
		      b = sal * 0.08;
		      sal = a +b;
		    		  }
			
		else if (sal <= 4500) {
			a = (sal - 3000) * 0.18;
			b = 1000 * 0.08;
			sal = a+b;
		}
		else {
			a = 1000 * 0.08;
			b = 1500 * 0.18;
			c = (sal - 4500) * 0.28; 
			sal = a+b+c ;
		}
	      System.out.printf("R$: %.2f ", sal);
		sc.close();
	}

}
