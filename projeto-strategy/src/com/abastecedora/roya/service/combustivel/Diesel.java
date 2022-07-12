package com.abastecedora.roya.service.combustivel;

import com.abastecedora.roya.service.Combustivel;

public class Diesel implements Combustivel {

	@Override
	public double calcularPreço(double litros) {
		return litros * 7.96;
	}
	
	
}
