package Exercicio_232;

import java.util.Scanner;

public class Exercicio_232 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n=0, pos=0, neg=0, zeros=0;
		
		for(int x=0;x<5;x++){
			System.out.print("Digite o " + (x+1) +  "º número:");
			n = teclado.nextInt();
			if (n>0)
				pos++;
			else if (n<0)
				neg++;
			else zeros++;
		}
		System.out.printf("Positivos: %d, Negativos: %d, Zeros: %d",pos,neg,zeros);
		teclado.close();	
	}
}
