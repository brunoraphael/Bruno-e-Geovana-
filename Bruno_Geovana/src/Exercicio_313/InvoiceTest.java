package Exercicio_313;

import java.util.Scanner;

public class InvoiceTest {
	
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		
		String numero;
		String descricao;
		int quantidade;
		double preco;
		
		System.out.print("Digite um nome:");
		descricao = input.nextLine();
		
		System.out.print("Digite o número:");
		numero = input.nextLine();
		
		System.out.print("Digite a quantidade:");
		quantidade = input.nextInt();
		
		System.out.print("Digite o preço");
		preco = input.nextDouble();
		
		Invoice fatura_1 = new Invoice(numero, descricao, quantidade, preco);
		
		System.out.print(fatura_1.getInvoiceAmount());
		input.close();	
		}

}