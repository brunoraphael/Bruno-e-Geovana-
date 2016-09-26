package Exercicio_216;

import java.util.Scanner;

public class Exercicio_216 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o primeiro nùmero:");
		int num1 = teclado.nextInt();
		
		System.out.print("Informe o segundo nùmero:");
		int num2 = teclado.nextInt();
		
		if (num1 == num2){
			System.out.printf(+ num1 +" e "+ num2+" These numbers are equal." );
		}
		if (num1 > num2){
			System.out.printf(+ num1+" is larger. ");
		}
		if (num1 < num2){
			System.out.printf(+ num2+" is larger. ");
		}
		teclado.close();
	}

}