

public class for6 {
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        System.out.println("\fa tabuada de qual numero deseja?");
        int numero = teclado.nextInt();
        int ultimo = numero * 10;
        
        
        int contador;
        for(contador = numero; contador <= ultimo ; contador+=numero){
            System.out.println( contador );
        }
        System.out.println("Obrigado por utilizar o sistema!");
  
    }
}
