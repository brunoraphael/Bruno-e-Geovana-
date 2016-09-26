package Exercicio_1;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[][] matrizA;
		int[][] matrizB;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a dimensão da 1ª matriz, com linha e coluna");
		int linhas = leitor.nextInt();
		int coluna = leitor.nextInt();
		matrizA = new int[3][2];
		
		int linhas1 = leitor.nextInt();
		int coluna2 = leitor.nextInt();
		matrizB = new int[2][2];
		
		matrizA[0][0] = 3;
		matrizA[0][1] = 2;
		matrizA[1][0] = 4;
		matrizA[1][1] = 5;
		matrizA[2][0] = 2;
		matrizA[2][1] = 7;
		
		matrizB[0][0] = 2;
		matrizB[0][1] = 3;
		matrizB[1][0] = 4;
		matrizB[1][1] = 1;

		multi(matrizA, matrizB);
	}

	public static void multi(int[][] matA, int[][] matB) {

		int[][] matC = matA;
		System.out.println(matA[0].length);
		System.out.println(matB.length);
	
		if (matA[0].length == matB.length) {

			for (int i = 0; i < matB[0].length; i++) {
				for (int j = 0; j < matA.length; j++) {
				matC[j][i] = matA[j][i] * matB[i][i]; 	
				}
			}
			
			for (int i = 0; i < matB[0].length; i++) {
				for (int j = 0; j < matA.length; j++) {
				matC[j][i] = (matC[j][i] + matA[j][i]) * matB[i][i]; 	
				}
			}
			
			System.out.println(matC[0][0]);
			
		} else {
			System.out.println("Não satifaz a condição de linhas e colunas");
		}

	}

}


