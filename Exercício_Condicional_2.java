/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class Exercício_Condicional_2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int b;
System.out.println("Bota");
b = sc.nextInt();
if (b%2 == 0) {
	System.out.println("PAR");
	}
else {
	System.out.println("IMPAR");
}
	}
}
