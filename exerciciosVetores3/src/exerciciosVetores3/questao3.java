package exerciciosVetores3;

import java.util.Random;

public class questao3 {

	public static void main(String[] args) {

		Random random = new Random();
		double[] temperaturas = new double[121];
		double maiorTemp = 0, menorTemp = 999, somaTemps = 0;

		for (int pos = 0; pos < temperaturas.length; pos++) {
			temperaturas[pos] = ((double) random.nextInt(2500) + 1500) / 100;
			if (temperaturas[pos] > maiorTemp) {
				maiorTemp = temperaturas[pos];
			}
			if (temperaturas[pos] < menorTemp) {
				menorTemp = temperaturas[pos];
			}
			somaTemps += temperaturas[pos];
		}

		System.out.println("A maior temperatura foi de: " + maiorTemp + "C°");
		System.out.println("A menor temperatura foi de: " + menorTemp + "C°");
		System.out.println("A temperatura média foi de: " + (somaTemps / temperaturas.length) + "C°");

	}

}
