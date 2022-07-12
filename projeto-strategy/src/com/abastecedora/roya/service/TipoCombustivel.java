package com.abastecedora.roya.service;

import com.abastecedora.roya.service.combustivel.Alcool;
import com.abastecedora.roya.service.combustivel.Diesel;
import com.abastecedora.roya.service.combustivel.GasolinaAditivada;
import com.abastecedora.roya.service.combustivel.GasolinaComum;

public enum TipoCombustivel {
	
	ALCOOL {

		@Override
		public Combustivel obterValor() {
			return new Alcool();
		}
		
	},
	GASOLINA_COMUM {

		@Override
		public Combustivel obterValor() {
			return new GasolinaComum();
		}
		
	},
	GASOLINA_ADITIVADA {

		@Override
		public Combustivel obterValor() {
			return new GasolinaAditivada();
		}
		
	},
	DIESEL {

		@Override
		public Combustivel obterValor() {
			return new Diesel();
		}
		
	};
	
	public abstract Combustivel obterValor();

}
