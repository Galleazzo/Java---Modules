module app.calculo {
	
	
	requires transitive app.Logging;
	exports br.com.coder.app.calculo;
	
	/* exports br.com.coder.app.calculo.interno to app.financeiro; */
	
	
	opens br.com.coder.app.calculo to app.Logging, app.financeiro;
	
	requires app.api;
	provides br.com.coder.app.Calculadora with br.com.coder.app.calculo.Calculadoraimpl;
}