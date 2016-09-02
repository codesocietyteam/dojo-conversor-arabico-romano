package br.com.codesociety;

import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {

	private Conversor conversor = new Conversor();
	
	@Test
	public void test1DeveRetornarI() {
		String resultado = conversor.converte(1);
		Assert.assertEquals("I", resultado);
	}
	
	@Test
	public void test2DeveRetornarII() {
		String resultado = conversor.converte(2);
		Assert.assertEquals("II", resultado);
	}
	
	@Test
	public void test3DeveRetornarIII() {
		String resultado = conversor.converte(3);
		Assert.assertEquals("III", resultado);
	}
}
