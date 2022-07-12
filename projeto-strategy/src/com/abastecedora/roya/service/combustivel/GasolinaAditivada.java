package com.abastecedora.roya.service.combustivel;

import com.abastecedora.roya.service.Combustivel;

public class GasolinaAditivada implements Combustivel {
	
	@Override
	public double calcularPreço(double litros) {
		return litros * 6.46;
	}
}
