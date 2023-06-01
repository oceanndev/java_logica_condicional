/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */
public class Exercício_Condicional_5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

double a, tot;
int b;
a = sc.nextDouble();
System.out.println("Kuantidade");
b = sc.nextInt();
if (a == 1) {
	a = 4.00;
	tot = a*b;
	System.out.printf("Total =  %.2f", tot);
}
else if (a == 2) {
	a = 4.5;
	tot = a*b;
	System.out.printf("Total =  %.2f", tot);
}
else if (a == 3) {
	a = 5;
	tot = a*b;
	System.out.printf("Total =  %.2f", tot);
}
else if (a == 4) {
	a = 2;
	tot = a*b;
	System.out.printf("Total =  %.2f", tot);
}
else {
	a = 1.5;
	tot = a*b;
	System.out.printf("Total =  %.2f", tot);
}
	}
}
