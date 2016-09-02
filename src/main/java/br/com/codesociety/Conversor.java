package br.com.codesociety;

public class Conversor {

	public String converte(int numero) {
		if (numero == 1) {
			return "I";			
		} else if (numero == 2) {
			return "II";
		} else if (numero == 3) {
			return "III";
		}
		
		return null;
	}

}
