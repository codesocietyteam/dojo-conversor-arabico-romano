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
	
	@Test
	public void test4DeveRetornarIV() {
		String resultado = conversor.converte(4);
		Assert.assertEquals("IV", resultado);
	}
	
	@Test
	public void test5DeveRetornarV() {
		String resultado = conversor.converte(5);
		Assert.assertEquals("V", resultado);
	}
	
	@Test
	public void test6DeveRetornarVI() {
		String resultado = conversor.converte(6);
		Assert.assertEquals("VI", resultado);
	}
	
	@Test
	public void test7DeveRetornarVII() {
		String resultado = conversor.converte(7);
		Assert.assertEquals("VII", resultado);
	}
	
	@Test
	public void test8DeveRetornarVIII() {
		String resultado = conversor.converte(8);
		Assert.assertEquals("VIII", resultado);
	}
	
	@Test
	public void test9DeveRetornarIX() {
		String resultado = conversor.converte(9);
		Assert.assertEquals("IX", resultado);
	}
	
	@Test
	public void test10DeveRetornarX() {
		String resultado = conversor.converte(10);
		Assert.assertEquals("X", resultado);
	}
	
	@Test
	public void test25DeveRetornarXXV() {
		String resultado = conversor.converte(25);
		Assert.assertEquals("XXV", resultado);
	}
}
