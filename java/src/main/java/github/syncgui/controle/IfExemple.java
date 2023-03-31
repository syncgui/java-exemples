package github.syncgui.controle;

public class IfExemple {
	
	public static void main(String[] args) {
		
		double nota = 1.3;
		
		if(nota >= 9.0); { // Erro no ; usado após a condicional do If, 
						   //fazendo com que os prints seham executados independentes do If.
			System.out.println("Quadro de honra!");
			System.out.println("Você é foda!");
		}
	}
}	
