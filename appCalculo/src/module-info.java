
module app.calculo {
	
	
	requires transitive app.Logging;
	exports br.com.coder.app.calculo;
	
	exports br.com.coder.app.calculo.interno to app.financeiro;
	
}