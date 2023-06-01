/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
public class Exercício_Condicional_4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int h, t, d;
System.out.println("Entrada");
h = sc.nextInt();
System.out.println("Saída");
t = sc.nextInt();
if (h<t) { 
	 d = t - h;
}
else {
	d = 24 - h + t;
}
System.out.printf("A DURAÇÃO FOI DE %d HORAS", d);
	}

}
