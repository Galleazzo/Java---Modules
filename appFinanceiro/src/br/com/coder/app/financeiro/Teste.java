package br.com.coder.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.coder.app.Calculadora;


public class Teste {

	public static void main(String[] args) {

		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.println(calc.soma(2, 3, 4));

		/*
		 * OperacoesAritmeticas op = new OperacoesAritmeticas();
		 * System.out.println(op.soma(4, 5, 6));
		 */

		try {
			Field fieldid = calc.class.getDeclaredFields()[0];

			fieldid.setAccessible(true);
			fieldid.set(calc, "def");

			fieldid.setAccessible(false);
			System.out.println(calc.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
