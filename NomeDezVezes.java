package estruturaPosCondicionada;
import java.util.Scanner;

public class NomeDezVezes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String nome;
		int i = 0;

		System.out.println("Digite o seu nome:");
		nome = ler.next();

		while (i < 10) {
			i++;
			System.out.println(nome);
		}
		ler.close();
	}

}
