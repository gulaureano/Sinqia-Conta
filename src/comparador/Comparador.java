package comparador;

public class Comparador {
	
	public String numerosIguais(int valor1, int valor2){
		if(valor1 == valor2){
			return "n�meros iguais";
		}
		else {
			return "n�meros diferentes";
		}
	}
	
	public String stringsIguaisSemEquals(String string1, String string2) {
		if (string1 == string2){
			return "Strings iguais";
		}
		else {
			return "Strings diferentes";
		}
	}
	
	public String stringsIguaisComEquals(String string1, String string2) {
		if (string1.equals(string2)) {
			return "Strings iguais";
		}
		else {
			return "Strings diferentes";
		}
	}
}
