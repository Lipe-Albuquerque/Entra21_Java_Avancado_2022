package br.com.entra21.javaavancado.principal;

import java.util.Scanner;

import br.com.entra21.javaavancado.principal.aula01.enums.PersonagemJogo;

public class Main {
	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public static void main(String[] args) {
		byte option;
		do {

			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Obrigado por usar nosso programado, ate logo!");

				break;
			case 1:
				aprenderWrapper();
				break;
			case 2:
				aprenderENUM();
				break;
			default:
				System.out.println("ERROR!! SELECIONE ALGO VALIDO");
				break;
			}

		} while (option != 0);

	}

	private static String exibirMenu() {

		String menu = "Vamos aprender sobre conceitos avançados em JAVA!";
		menu += "\n 0 - SAIR";
		menu += "\n 1 - WRAPPER";
		menu += "\n 2 - ENUM";
		menu += "\n ESCOLA UMA DAS OPÇÕES";

		return menu;
	}

	private static void aprenderWrapper() {

		char letra = Character.valueOf('C');
		boolean verdade = Boolean.parseBoolean("True");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");

		byte inteiroUm = Byte.parseByte("127");
		short inteiroDois = Short.parseShort("128");
		int inteiroTres = Integer.parseInt("10000");
		long inteiroQuatro = Long.parseLong("100000");

		float decimalUm = Float.parseFloat("1000.10");
		double decimalDois = Double.parseDouble("2000.20 ");

	}

	private static void aprenderENUM() {
		System.out.println("Testando Enum: " + DiasSemana.TERCA);
        boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
        System.out.println(hoje ? "sim" : "não");
 
        for (int dia = 0; dia < DiasSemana.values().length; dia++) {
            System.out.println((dia + 1) + " - " + DiasSemana.values()[dia]);
        }
 
        System.out.println("Gosto desse tipo de personagem: " + PersonagemJogo.ANAO);
        System.out.println("Geralmente a classe " + PersonagemJogo.ANAO + " tem HP = " + PersonagemJogo.ANAO.getHP());
        System.out.println("Veja a caracterisca mais comum dele " + PersonagemJogo.ANAO.getDESCRIPTION());
      
	}
}
