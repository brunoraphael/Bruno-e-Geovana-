package Exercicio_315;

import java.util.Scanner;

public class DateTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Issira o dia: ");
		int dia = input.nextInt();
		if (dia>31){
			System.out.println("Data inv�lida.");
		}
		System.out.print("Issira o m�s: ");
		int mes = input.nextInt();
		if (mes>12){
			System.out.println("Data inv�lida.");
		}	
		System.out.print("Insira o ano: ");
		int ano = input.nextInt();
		if (ano>9999){
			System.out.println("Data inv�lida.");
		}
		
		Date date = new Date(dia, mes, ano);
		date.getdisplayDate();
		input.close();	
	}	
	

}
