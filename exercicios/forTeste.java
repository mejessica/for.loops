public class forTeste {

	public static void main(String[] args) {
		
		String texto = "nota 10";
		for(int i=0; i<texto.length(); i++) {
		if(texto.charAt(i)==' ') continue;
		System.out.println(texto.charAt(i));
		}
	}

}
