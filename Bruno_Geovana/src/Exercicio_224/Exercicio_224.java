package Exercicio_224;

import java.util.Scanner;

public class Exercicio_224 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int maior;
		int menor;
		int num;
		
		System.out.print("Informe o 1� n�mero:");
		num = teclado.nextInt();
		maior = num;
		menor = num;
		
		for (int x = 1; x < 5; x++) {
			System.out.print("Informa o "+(x+1)+"� n�mero:");
			num = teclado.nextInt();
			
			if(num>maior){
				maior=num;
			}
				
			if(num<menor){
				menor=num;
			}
		}
		
		System.out.println("O maior n�mero �:"+maior);
		System.out.println("O menor n�mero �:"+menor);
		teclado.close();
	}

}
