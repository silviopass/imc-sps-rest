package Java.imc.model;

public class ImcModel {

	public static double calcularImc(String altura, String peso) {
		double alturaThis = Double.parseDouble(altura);
		double pesoThis = Double.parseDouble(peso);

		double imc = pesoThis / Math.pow(alturaThis, 2);
		return imc;
	}
	
	public static String resultadoImc(String altura, String peso, String sexo) {
		double imc = calcularImc(altura, peso);
		
		if (sexo.equals("M")) {
			if (imc < 20.7) {
				return "Abaixo do peso";
			} else if (imc >= 20.7 && imc < 26.4) {
				return "No peso normal"; 
			} else if (imc >= 26.4 && imc < 27.8) {
				 return "Marginalmente acima do peso"; 
			} else if (imc >= 27.8 && imc < 31.1) {
				 return "acima do peso ideal";
			} else if (imc >= 31.1) {
				 return "Obeso"; 
			}
		} else if (sexo.equals("F")) {
			if (imc < 19.1) {
				 return "Abaixo do peso"; 
			} else if (imc >= 19.1 && imc < 25.8) {
				 return "No peso normal"; 
			} else if (imc >= 25.8 && imc < 27.3) {
				 return "Marginalmente acima do peso"; 
			} else if (imc >= 27.3 && imc < 32.3) {
				 return "acima do peso ideal"; 
			} else if (imc >= 32.3) {
				 return "Obeso"; 
			}
		}
		return "Ops erro";
	}
}
