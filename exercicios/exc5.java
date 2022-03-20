

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Escreva uma frase");
		String frase = input.nextLine();
		
		
		int letra;
		
		StringBuilder nome = new StringBuilder(frase);

		
		for(letra = 0; letra < frase.length(); letra++ ){
			if(frase.charAt(letra) == 'a'||frase.charAt(letra) == 'e'||frase.charAt(letra) == 'i'||frase.charAt(letra) == 'o'||frase.charAt(letra) == 'u')
		  {
					nome.setCharAt(letra,'*');
		  }
		}
		
		System.out.print(nome);

	}

}
