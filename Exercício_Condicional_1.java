/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
public class Exercício_Condicional_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Bota");
        a = sc.nextInt();
        if (a>0) {
            System.out.println("POSITIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }
    }

}
