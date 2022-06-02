package br.com.entra21.javaavancado.principal.aula02.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class LearningCollections {
	static Scanner input = new Scanner(System.in);

	public static void learning() {
		byte option;

		do {

			System.out.println("Escolha uma das opções:");
			System.out.println(" 0 - Voltar ao menu principal");
			System.out.println(" 1 - Aprender ArrayList");
			System.out.println(" 2 - Aprender LinkedList");
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Thanks   exit...");
				break;
			case 1:
				aprenderArrayList();
				break;
			case 2:
				aprenderLinkedList();
				break;
			default:
				System.out.println("Error!! digite algo valido");
				break;
			}

		} while (option != 0);

	}

	private static void aprenderArrayList() {

		// criou a lista nomes
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Geovani");
		nomes.add("Geovanne");
		nomes.add(0, "Primeiro"); // colocando um número no inicio, definimos a posição
		nomes.add("Geovane"); // caso contrário ele adiciona no final
		nomes.add("Rubem");

		System.out.println("Quantos nomes? " + nomes.size());

		// foreach > ctrl + espaço > resultado abaixo
		for (String item : nomes) { // esse tipo de for trabalha com uma variavel temporária. Percorrendo todos os
									// itens da lista

			System.out.println("O nome no momento é " + item);

		}

		for (int nome = 0; nome < nomes.size(); nome++) {

			System.out.println("No índice " + nome + " temos o valor " + nomes.get(nome));

		}

		System.out.println("O primeiro nome é: " + nomes.get(0));
		System.out.println("O terceiro nome é: " + nomes.get(2));

		nomes.set(0, "Primierissimo"); // o primeiro lugar no indice passa a ter outro nome desse jeito
		nomes.set(0, nomes.get(0).toUpperCase()); // assim ele pega o valor atual e coloca tudo em caixa alta
		nomes.set(0, nomes.get(3).toLowerCase()); // atualizei um valor e deixei tudo em caixa baixa
		System.out.println("Agora o primeiro nome é: " + nomes.get(0));

		System.out.println("Onde será que está o Rubem? " + nomes.indexOf("Rubem")); // usando o index para pegar a
																						// posição do elemento
		System.out.println("Vou deletar quem estiver no índice 2 " + nomes.get(2));
		nomes.remove(2); // removendo o item no indice 2
		nomes.remove(nomes.indexOf("Rubem")); // removendo o índice onde o Rubem está
		// fazendo dessa maneira consigo fazer de forma dinamica, já que a lista está
		// sempre sendo alterada

		// Criar uma lista de interesses
		// Inclua 5 interesses
		// Liste todos os interesses
		// Dessa lista escolha 2 que são favoritos para mostrar
		// Exclua um item por posição e outro por valor.
		// um syso para cada ação dessa

		ArrayList<String> interesses = new ArrayList<>();
		interesses.add("Entrar na Capgemini");
		interesses.add("Jantar hoje");
		interesses.add("Batatas");
		interesses.add("Futebol");
		interesses.add("Dormir");

		for (String string : interesses) {
			System.out.println(string);
		}

		System.out.println("Esse: " + interesses.get(0) + " e esse: " + interesses.get(2) + " são meus favoritos");

		System.out.println("Vou excluir o: " + interesses.get(1));
		interesses.remove(1);
		System.out.println("E vou excluir esse tambem: " + interesses.get(3));
		interesses.remove(interesses.indexOf("Futebol"));

		System.out.println("Tudo que o proff pediu foi feito, aguardando o: " + interesses.get(0));

	}

	private static void aprenderLinkedList() {

	}

}
