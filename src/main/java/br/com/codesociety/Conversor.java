package br.com.codesociety;

import java.util.HashMap;
import java.util.Map;

public class Conversor {

	private Map<Integer, String> romanosMap = new HashMap<Integer, String>();
	private Map<Integer, String> romanosDezenasMap = new HashMap<Integer, String>(); 
	
	public String converte(int numero) { //25
		construirAlfabeto();
		
		String num = String.valueOf(numero); //'25'
		char[] digitos = num.toCharArray(); // ['2','5']
		
		String dezena = null;
		if(digitos.length > 1){
			dezena = romanosDezenasMap.get(digitos[0]);
		}
		
		
		
		return romanosMap.get(numero);
	}

	private void construirAlfabeto() {
		romanosMap.put(1, "I");
		romanosMap.put(2, "II");
		romanosMap.put(3, "III");
		romanosMap.put(4, "IV");
		romanosMap.put(5, "V");
		romanosMap.put(6, "VI");
		romanosMap.put(7, "VII");
		romanosMap.put(8, "VIII");
		romanosMap.put(9, "IX");
		romanosMap.put(10, "X");
		
		romanosDezenasMap.put(10,"X");
		romanosDezenasMap.put(20,"XX");
	}

}
