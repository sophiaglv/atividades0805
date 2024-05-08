package estruturaPosCondicionada;
import java.util.Scanner;

public class NomeVezes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 0, vezes;
		String nome;

		System.out.println("Informe o seu nome: ");
		nome = ler.next();
		System.out.println("Informe quantas vezes vai aparecer: ");
		vezes = ler.nextInt();

		while (i < vezes ) {
			i++;
			System.out.println(nome);
		}
		ler.close();
	}

}
