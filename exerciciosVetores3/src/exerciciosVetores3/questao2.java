package exerciciosVetores3;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {

		int[] vetor = new int[6];
		int qtdPares = 0;
		Scanner sc = new Scanner(System.in);
		;

		for (int pos = 0; pos < vetor.length; pos++) {
			System.out.print("Digite o " + (pos + 1) + "º número inteiro do vetor: ");
			vetor[pos] = sc.nextInt();

			if (vetor[pos] % 2 == 0) {
				qtdPares++;
			}
		}
		
		System.out.println("Quantidade de números pares: " + qtdPares);
		System.out.print("Valores pares: ");
		for (int valor : vetor) {
			if (valor % 2 == 0) {				
				System.out.print(valor + " ");
			}
		}
		System.out.println("\nQuantidade de números ímpares: " + (vetor.length - qtdPares));
		System.out.print("Valores ímpares: ");
		for (int valor : vetor) {
			if (valor % 2 != 0) {				
				System.out.print(valor + " ");
			}
		}

		sc.close();

	}

}
