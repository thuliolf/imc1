public class Principal { 

	public static void main(String args[]){ 
		IMC imc = new IMC(); 

		float peso = 98; 
		float altura = 174; 
		float resultado = imc.CalculoImc(peso, altura); 
		System.out.println(resultado); 

	} 
} 