package Exercicio_215;
import java.util.Scanner;

public class Exercicio_215 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int soma;
		double divisao;
		int subtracao;
		int multiplicacao;
		
		System.out.print("Informe o primeiro número:");
		num1 = teclado.nextInt();
		
		System.out.print("Informe o segundo número:");
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		divisao = num1 / num2;
		multiplicacao = num1 * num2;
		subtracao = num1 - num2;
		
		System.out.printf("A soma é:"+ soma+"\nA divisao é %.2f \nA subtracao é:"+ subtracao+"\nA multiplicacao é:"+ multiplicacao,divisao);
		teclado.close();
		}

}