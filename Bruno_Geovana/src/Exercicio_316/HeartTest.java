package Exercicio_316;

import java.util.Scanner;

public class HeartTest {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		System.out.print("Sobrenome: ");
		String sobrenome = input.nextLine();
		
		System.out.println("Data de nascimento.");
		
		System.out.print("Dia: ");
		int dia = input.nextInt();
		
		System.out.print("Mês: ");
		int mes = input.nextInt();

		System.out.print("Ano: ");
		int ano = input.nextInt();
		
		HeartRates resultado = new HeartRates (nome, sobrenome, dia, mes, ano);
		
		System.out.println("O paciente "+nome+" "+sobrenome+" com idade "+resultado.Idade()+" anos,\ntem frequência cardiaca de "
		+resultado.FrequenciaCardia()+" BPM, e um intervalo de "+resultado.Intervalo()+" BPM.");
		input.close();
	}
}
