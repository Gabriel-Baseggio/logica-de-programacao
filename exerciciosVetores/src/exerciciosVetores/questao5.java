package exerciciosVetores;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		int[] valores = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + (i + 1) + "� valor: ");
			valores[valores.length - 1 - i] = sc.nextInt();
		}
		
		for (int valor : valores) {
			System.out.print(valor + " ");
		}
		
		sc.close();

	}

}
