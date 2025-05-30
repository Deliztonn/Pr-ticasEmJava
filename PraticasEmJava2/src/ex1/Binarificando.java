package ex1;

import java.util.Scanner;

public class Binarificando {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Escolha um para binarificar:");
		int num = sc.nextInt();
		String b = "";
		while (num > 0) {
			 b = num%2 + b;
			num/=2;
		}
		System.out.println("Binário: "+b);
	}

}
