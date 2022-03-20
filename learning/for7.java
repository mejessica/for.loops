
public class for7{ 
    public static void main(String[] args){
        java.util.Scanner teclado= new java.util.Scanner(System.in);
        
        int numero;
        int armaz = 0;
        for(int i = 1; i <= 20 ; i++){
            System.out.println("Digite um numero inteiro positivo ou negativo ");
            
            numero = teclado.nextInt();
            
            
            if(numero < 0) {
                armaz = armaz + 1;
            }    
            
            
        }
        
        System.out.println("\f A quantidade de numeros negativos: "+armaz);
    }
}  
