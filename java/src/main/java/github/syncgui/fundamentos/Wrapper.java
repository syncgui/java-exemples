package github.syncgui.fundamentos;

public class Wrapper {
	public static void main(String[] args) {

		Byte a = 100;
		Short b = 1000;
		Integer c = 10000;
		Long d = 1000000L;
		// Integer.parseInt(entrada.next());

		System.out.println(a.byteValue());
		System.out.println(b.toString());
		System.out.println(c * 3);
		System.out.println(d / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double g = 1234.5678;
		System.out.println(g);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character e = '#';
		System.out.println(e + "...");
	}
}
