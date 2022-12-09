package pacQuestao02;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int v1[] = new int[9];
		int cont = 0;
		int n = 0;
		Boolean primo = false;

		// leitura de dados
		System.out.print("Lendo vetor ");
		for (int i = 0; i < 9; i++) {
			System.out.print("Vetor[" + i + "]:");
			v1[i] = input.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			// verificar se o n e primo
			// Considerando que 1 e primo
			n = v1[i];
			if (n == 1 || n == 2) {
				cont++;
				System.out.println("O numero " + n + " e primo e esta armazenado na posicao\n" + i);

			} else {
				primo = true;
				for (int j = 2; j < n; j++) {
					if (n % j == 0) {
						primo = false;
					}
				}
				if (primo == true) {
					cont++;
					System.out.println("O numero " + n + " e primo e esta armazenado na posicao\n" + i);
				}

			}

		}

		System.out.println("Total de numeros primos " + cont);

	}

}