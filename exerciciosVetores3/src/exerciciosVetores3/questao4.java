package exerciciosVetores3;

import java.util.ArrayList;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		String nomePesquisa = "";
		int opcao, posAlterar = 0, posExcluir = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\n ======== MENU ========\n"
					+ "1) Cadastrar nome\n"
					+ "2) Pesquisar nome\n"
					+ "3) Listar todos os nomes\n"
					+ "4) Alterar um nome\n"
					+ "5) Excluir um nome\n"
					+ "0) Sair do programa\n"
					+ "——————–\n"
					+ "Digite sua escolha: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("\nDigite o próximo nome a ser salvo: ");
				nomes.add(sc.next());
				System.out.println("Nome salvo com sucesso!");
				break;
			case 2:
				System.out.print("\nDigite o nome para pesquisar: ");
				nomePesquisa = sc.next();
				for (int pos = 0; pos < nomes.size(); pos++) {
					if (nomePesquisa.equals(nomes.get(pos))) {
						System.out.println("Nome existente na posição " + pos);
						break;
					} else if (pos == (nomes.size() - 1) && nomes.size() > 0) {
						System.out.println("Nome inexistente na ArrayList!");
					} else if (nomes.size() == 0) {
						System.out.println("Nenhum nome na ArrayList");
					}
				}
				break;
			case 3:
				System.out.println("\n ======== Lista de nomes ======== ");
				for (int pos = 0; pos < nomes.size(); pos++) {
					System.out.println(pos + " - " + nomes.get(pos));
				}
				break;
			case 4:
				System.out.print("\nDigite a posição do nome a ser alterado: ");
				posAlterar = sc.nextInt();
				if (posAlterar < 0 || posAlterar >= nomes.size() && nomes.size() > 0) {
					System.out.print("Digite o novo nome: ");
					nomes.set(posAlterar, sc.next());					
					System.out.println("Nome alterado com sucesso!");
				} else {
					System.err.println("Posição inexistente na ArrayList");
				}
				break;
			case 5:
				System.out.print("\nDigite a posição do nome a ser excluído: ");
				posExcluir = sc.nextInt();
				if (posExcluir < 0 || posExcluir >= nomes.size() && nomes.size() > 0) {
					System.out.println("Nome excluido com sucesso!");
					nomes.remove(posExcluir);
				} else {
					System.err.println("Posição inexistente na ArrayList");
				}
				break;
			case 0:
				System.out.println("\nSaindo do programa!");
				break;
			default:
				System.out.println("\nOpção incorreta!");
			}
			
		} while (opcao != 0);
		
		
		
		sc.close();

	}

}
