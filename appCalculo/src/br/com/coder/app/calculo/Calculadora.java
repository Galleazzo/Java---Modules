package br.com.coder.app.calculo;

import br.com.coder.app.calculo.interno.OperacoesAritmeticas;
import br.com.coder.app.logging.Logger;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
}
