/*
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
public class Exercício_Condicional_3 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a, b;
  System.out.println("Primeiro: ");
  a = sc.nextInt();
  System.out.println("Segundo");
  b = sc.nextInt();
  if (a/b == 0 || b/a == a) {
	  System.out.println("Multiplos");
  }
  else {
	  System.out.println("Não são multiplos");
  }
  sc.close();
	}

}
