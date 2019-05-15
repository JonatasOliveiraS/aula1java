package com.br.ola.mundo;
import java.util.Scanner;

public class App {

	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		int capacidade = entrada.nextInt();
		int minima = 10;
		
		System.out.println("a média é :" + (capacidade + minima) / entrada.nextInt());
		
	
	}

}
