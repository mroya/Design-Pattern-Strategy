package com.abastecedora.roya;

import java.util.Scanner;

import com.abastecedora.roya.service.Combustivel;
import com.abastecedora.roya.service.TipoCombustivel;

public class Teste {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Qual tipo de combustível?" );
			System.out.println("[1] Alcool [2] Gasolina Comum [3] Gasolina Aditivada [4] Diesel");
			int tipo = input.nextInt();
			System.out.print("Quantos litros? ");
			double litros = input.nextDouble();
				
			TipoCombustivel tipoCombustivel = TipoCombustivel.values()[tipo -1];
			
			Combustivel combustivel = tipoCombustivel.obterValor();
			double preco = combustivel.calcularPreço(litros);
			System.out.printf("O valor total é de R$%.2f", preco);
		}
		
	}

}
