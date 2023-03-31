package github.syncgui.fundamentos;

public class Primitivos {
	public static void main(String[] args) {
		// Tipos de números inteiros
		byte anosDeEmpresa = 23; 
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos de números reais
		float salario = 11_445.44F;
		double vendasAcumulados = 2_991_797_103.01;
		
		// Tipos booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipo caractere
		char status = 'A'; // Apenas uma letra
		
		// ULTILIZANDO
		
		// byte
		System.out.println(anosDeEmpresa * 365);
		
		// short
		System.out.println(numerosDeVoos / 2);
		
		// double + long
		System.out.println(pontosAcumulados / vendasAcumulados);
		
		// float
		System.out.println(id + ": ganha -> " + salario);
		
		// boolean
		System.out.println(id + ": Esta de ferias? " + estaDeFerias);
		
		// char
		System.out.println("Status: " + status);
	}
}
