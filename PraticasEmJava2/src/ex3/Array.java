package ex3;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		int n[] = new int[5];
		System.out.println("escreva 5 números para soma-los e tirar a média");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			soma += n[i];
		}
	System.out.printf("Soma: %.0f\nMédia:%.1f ",soma ,soma/5);
	}

}
