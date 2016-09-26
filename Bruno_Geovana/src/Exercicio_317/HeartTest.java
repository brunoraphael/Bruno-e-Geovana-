package Exercicio_317;

import java.util.Scanner;

import Exercicio_317.HeartTest;

public class HeartTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		System.out.print("Sobrenome: ");
		String sobrenome = input.nextLine();

		System.out.print("Sexo: ");
		String sexo = input.nextLine();
		
		System.out.println("Data de nascimento.");
		
		System.out.print("Dia: ");
		int dia = input.nextInt();
		
		System.out.print("Mês: ");
		int mes = input.nextInt();

		System.out.print("Ano: ");
		int ano = input.nextInt();

		System.out.print("Altura: ");
		double altura = input.nextDouble();

		System.out.print("Peso: ");
		double peso = input.nextDouble();

		
		HeartProfile resultado = new HeartProfile (nome, sobrenome, sexo, dia, mes, ano, altura, peso);
		
		System.out.println("Paciente: "+nome+" "+sobrenome+".\nIdade: "+resultado.Idade()+" anos.\nSexo: "+sexo+"\nAltura: "+resultado.Polegadas()+
		" polegadas.\nPeso: "+resultado.Libras()+" libras.\nFrequência cardiaca de "
		+resultado.FrequenciaCardia()+" BPM, e um intervalo de "+resultado.Intervalo()+" BPM.\nO indice de massa corporal é: "+resultado.IMC());
		input.close();
	}
}
