

// Importo el paquete java.util para poder utilizar la clase Scanner

package restar;
import java.util.*;
public class Restar {
   
    
    // Creo las variables A, B y resultado de tipo entero
    
    private int a, b, resultado;
    
    // Creo un nuevo objeto de la clase Scanner
    
    Scanner entrada = new Scanner(System.in);
    
    // Creo el método ejecutaPrograma
    
    public void ejecutaPrograma(){
        
        introduceNumero();
        
         imprimeResultado();
    }
    
    //Creo el método introduceNumero
    
    public void introduceNumero(){
        
        System.out.println("Introduce el primer número: ");
        
        a = entrada.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        
        b = entrada.nextInt();
    }
    // Método para imprimer el resultado
    public void imprimeResultado(){
        
        if (a < b){// Resta b-a si b es mayor que a
            
            resultado = (b - a);
            
            System.out.println("El resultado de restar " + b + " - " + a + " es: " + resultado);// imprime el resultado
        } if(a>b){
            resultado = (a - b);// resta si a es mayor que b
        
        System.out.println("El resultado de restar "+ a +" - " + b + " es: "+ resultado);// imprime el resultado
    }
    }
    
    
            
    
    
    
}
