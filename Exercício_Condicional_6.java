/*
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”
 */
import java.text.DecimalFormat;
public class Exercício_Condicional_6 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 DecimalFormat df = new DecimalFormat("#,###.00");
 df.format(1234.36); 
 double x;
	System.out.println("Insira um número");
	x = sc.nextDouble();
	if (0 > x || x <= 25) {
		System.out.printf("Intervalo entre (0, 25]");
	}
	else if (25 > x || x <= 50.0) {
		System.out.printf("Intervalo entre (25, 50]");
		
	}
	else if (50 > x || x <= 75 ) {
		System.out.printf("Intervalo entre (50, 75]");
	}
	else if (75 > x || x <= 100 ) {
		System.out.printf("Intervalo entre (75, 100]");
	}
else {
	System.out.printf("Fora do Intervalo");
}
	}
}
