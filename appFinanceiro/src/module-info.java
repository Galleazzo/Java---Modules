
module app.financeiro {
	
	requires java.base; // Padrao sempre colocar
	// requires app.calculo;
	requires app.api;
	uses br.com.coder.app.Calculadora;
}