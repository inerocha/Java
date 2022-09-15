public class Calculadora {

	public static void main(String[] args) {
		
		System.out.println("Calculadora");
		soma(3, 6); 
		subtracao(21, 10);
		multiblicacao(6, 2);
		divisao(8, 4);
	}
	
	public static void soma (double n1, double n2) {
		double result = n1 + n2; 
		System.out.println(result);
	}
	
	public static void subtracao(double n1, double n2) {
		double result = n1 - n2; 
		System.out.println(result);
	}
	
	public static void multiblicacao(double n1, double n2) {
		double result = n1 * n2; 
		System.out.println(result);
	}
	
	public static void divisao(double n1, double n2) {
		double result = n1 / n2;
		System.out.println(result);
	}
}
