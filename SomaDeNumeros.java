package estruturaPosCondicionada;

public class SomaDeNumeros {

	public static void main(String[] args) {
		int i = 1, soma = 0;

		while (i <= 15) {
			soma = i + soma;
			i++;
			System.out.println(soma);
		}
	}

}
