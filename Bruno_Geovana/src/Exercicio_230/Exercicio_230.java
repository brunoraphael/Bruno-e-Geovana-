package Exercicio_230;

import java.util.Scanner;
	
public class Exercicio_230 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	int num;
	

	System.out.print("Digite 5 números: ");
	num = teclado.nextInt();
	
	char[] lista = String.valueOf(num).toCharArray();
	
	if((num>99999) || (num<=9999)){
		System.out.print("Número invalido.");
		
	}else{
		for(char d : lista){
		System.out.print(d+"   ");
		}
	teclado.close();	
	}
	}
}
