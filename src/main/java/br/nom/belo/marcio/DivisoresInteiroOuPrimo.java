package br.nom.belo.marcio;

import java.util.Scanner;

public class DivisoresInteiroOuPrimo {
	public static void main(String[] args) {
		System.out.print("Digite um inteiro:");
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		entrada.close();
		boolean temDivisor = false;
		for (int possivelDivisor = valor - 1; possivelDivisor > 1; possivelDivisor--) {
			if (valor % possivelDivisor == 0) {
				System.out.println(possivelDivisor);
				temDivisor = true;
			}
		}
		if (temDivisor) {
			System.out.println("1");
		} else {
			System.out.println("PRIMO!");
		}
	}
}