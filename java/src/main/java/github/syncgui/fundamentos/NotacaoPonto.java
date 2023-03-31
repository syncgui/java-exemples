package github.syncgui.fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", ", Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("pessoinha".toUpperCase());
		
		String x = "pessoinha".toUpperCase();
		System.out.println(x);
		
		String y = "pessoinha boa"
				.replace("pessoinha", "noite")
				.toUpperCase()
				.concat("seboso");
		System.out.println(y);
		
		//tipos primitivos não tem o operador "."
	}
}
