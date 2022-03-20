


public class for4{
    public static void main(String[] args){
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        int soma = 0;
        for (int i = 1; i < 20; i++){ 
            System.out.println("Digite um numero");
            int numero = teclado.nextInt();
            
            soma = soma + numero;
        }
        System.out.println("A soma dos numeros ditos:  " +soma);
       
        
    }   
}
