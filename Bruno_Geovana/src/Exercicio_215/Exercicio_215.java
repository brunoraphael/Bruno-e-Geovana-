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
		
		System.out.print("Informe o primeiro n�mero:");
		num1 = teclado.nextInt();
		
		System.out.print("Informe o segundo n�mero:");
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		divisao = num1 / num2;
		multiplicacao = num1 * num2;
		subtracao = num1 - num2;
		
		System.out.printf("A soma �:"+ soma+"\nA divisao � %.2f \nA subtracao �:"+ subtracao+"\nA multiplicacao �:"+ multiplicacao,divisao);
		teclado.close();
		}

}