package Exercicio_2;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um n�mero:");
		int num = teclado.nextInt();
		
		int fat = 1;
		while(num>0){
		fat = fat * num;
		num--;
		}
		System.out.print("O n�mero fatorial �:" + fat);
		teclado.close();	
		}
}