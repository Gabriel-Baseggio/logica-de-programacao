package exerciciosVetores3;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {

		String[] nomes = new String[10];
		double[] vendas = new double[nomes.length], comissaoPrct = new double[nomes.length];
		double totalVendas = 0, maiorValor = 0.0, menorValor = 99999.0;
		String nomeMaior = "", nomeMenor = "";
		Scanner sc = new Scanner(System.in);

		for (int pos = 0; pos < nomes.length; pos++) {
			System.out.print("Digite o nome do " + (pos + 1) + "º funcionário: ");
			nomes[pos] = sc.next();
			System.out.print("Digite o total de vendas do " + (pos + 1) + "º funcionário: R$");
			vendas[pos] = sc.nextDouble();
			System.out.print("Digite o valor de comissão em porcentagem do " + (pos + 1) + "º funcionário: ");
			comissaoPrct[pos] = sc.nextDouble();
			
			totalVendas += vendas[pos];
			
			if ((vendas[pos] * (comissaoPrct[pos] / 100)) > maiorValor) {
				maiorValor = vendas[pos] * (comissaoPrct[pos] / 100);
				nomeMaior = nomes[pos];
			}
			
			if ((vendas[pos] * (comissaoPrct[pos] / 100)) < menorValor) {
				menorValor = vendas[pos] * (comissaoPrct[pos] / 100);
				nomeMenor = nomes[pos];
			}
			
		}

		for (int pos = 0; pos < nomes.length; pos++) {
			System.out.println("Nome: " + nomes[pos]);
			System.out.println("Comissão a receber: R$" + (vendas[pos] * (comissaoPrct[pos] / 100)));
		}
		
		System.out.println("Total de vendas de todos os vendedores: R$" + totalVendas);
		System.out.println("O funcionário " + nomeMaior + " receberá a maior comissão: R$" + maiorValor);
		System.out.println("O funcionário " + nomeMenor + " receberá a menor comissão: R$" + menorValor);

		sc.close();

	}

}
