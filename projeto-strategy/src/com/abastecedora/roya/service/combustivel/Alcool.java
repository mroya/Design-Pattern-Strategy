package com.abastecedora.roya.service.combustivel;

import com.abastecedora.roya.service.Combustivel;

public class Alcool implements Combustivel {
	
	@Override
	public double calcularPreço(double litros) {
		return litros * 4.96;
	}

}
