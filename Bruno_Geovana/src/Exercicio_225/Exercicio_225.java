package Exercicio_225;

import java.util.Scanner;

public class Exercicio_225 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Informe um número:");
	int num = teclado.nextInt();
	
	if (num%2==0){
		System.out.print("O número informado é par.");
	}else{
		System.out.print("O númer informado é impar.");
	}
	teclado.close();
	}

}
