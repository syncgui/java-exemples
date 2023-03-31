package github.syncgui.classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data(10, 02, 2022);

		Data d2 = new Data();
		d2.ano = 2021;
		
		String dataFormatada1 = d1.obterDataFormatada();

		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
