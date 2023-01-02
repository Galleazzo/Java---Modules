package br.com.coder.app.calculo;

import br.com.coder.app.Calculadora;
import br.com.coder.app.calculo.interno.OperacoesAritmeticas;
import br.com.coder.app.logging.Logger;

public class Calculadoraimpl implements Calculadora{
	
	private String id ="abc";

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
