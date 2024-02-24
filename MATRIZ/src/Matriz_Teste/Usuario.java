package Matriz_Teste;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número de linhas da matriz:");
		int linhas = scanner.nextInt();
		System.out.println("Digite o número de colunas da matriz:");
		int colunas = scanner.nextInt();

		int[][] matriz = new int[linhas][colunas];

		// Preencher a matriz
		System.out.println("Digite os elementos da matriz:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		// Imprimir a matriz
		System.out.println("Matriz inserida:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Exemplo de operação com a matriz (somar todos os elementos)
		int soma = 0;
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				soma += matriz[i][j];
			}
		}
		System.out.println("A soma de todos os elementos da matriz é: " + soma);

		scanner.close();
	}
}
