package br.com.entra21.javaavancado.principal.aula03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aula03 {
	static Scanner input = new Scanner(System.in);
	static byte option;
	
	
	public static void learning() {
		
		
		do {
			
			System.out.println("0 - Voltar ao menu principal");
			System.out.println("1 - Datas");
			System.out.println("2 - Anotações");
			System.out.println("3 - Sair do programa");
			option = input.nextByte();
			
			
			switch (option) {
			case 0:
				System.out.println("Retornando ao menu");
				break;
			case 1:
				aprenderDatas();
				break;
			default:
				break;
			}
		}while(option !=0);
	
	}


	private static void aprenderDatas() {
		// TODO Auto-generated method stub
		Instant inicio = Instant.now();   // classe static
		
		
		
		
		
		
		System.out.println("Escolha algo pra passar o tempo");
		long numero = input.nextLong();
		
		
		
		
		
		
		
		
		
		Instant fim = Instant.now();
		
		
		
		Duration tempo = Duration.between(inicio, fim);
		System.out.println("Voce demorou "+ tempo.toSeconds()+" segundos para escolher o numero "+numero);
		System.out.println("Para datas, levamois "+ tempo.toSeconds()+" segundos");
		
		
		
		aprenderDatasHumanizadas();
		
		
		
	}


	private static void aprenderDatasHumanizadas() {
		// TODO Auto-generated method stub

        LocalDate today = LocalDate.now();
        System.out.println("Hoje é: " + today);
 
        LocalDate birthday = LocalDate.of(1994, 8, 3);
        System.out.println("Seu aniversário é: " + birthday);
 
        LocalDate thisThursday = LocalDate.of(2022, Month.JUNE, 3); // Month.JUNE -> ENUM.
        System.out.println("Essa Quinta: " + thisThursday);
 
        // Formata a data para uma melhor visualização
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YY"); // MMM aparece o mes(august)
        System.out.println("\n" + formatter.format(birthday));
 
        System.out.println("----------\n" + DateTimeFormatter.ofPattern("YYYY").format(thisThursday));
 
        Period lifetime = Period.between(birthday, today);
        System.out.println("\nEu vivi um total de: " + lifetime.getYears() + " anos, " + lifetime.getMonths()
                + " meses e " + lifetime.getDays() + " dias.");
 
        LocalTime lanche = LocalTime.of(20, 10);
        LocalTime finalAula03 = LocalTime.of(22, 15);
        LocalTime avaliacao = LocalTime.of(22, 0);
 
        System.out.println("Fomos lanchar as: " + lanche + " Vamos avaliar a aula as " + avaliacao + " temos que aprender tudo até " + finalAula03);


	 
	}
	
	
	
}
