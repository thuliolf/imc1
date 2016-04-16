public class Principal { 

	public static void main(String args[]){ 
		CalcIMC imc = new CalcIMC(); 

		float peso = 98; 
		float altura = 174; 
		float resultado = imc.Calcula(peso, altura); 
		System.out.println(resultado); 

	} 
} 