
package desarrollogrupalsemana01;

import java.util.Scanner;
public class Ejercicio02 {
     public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        
        
        double a, b, c;   
        int rpt;          
        
        
        System.out.print("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        
        System.out.print("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        
        System.out.print("Ingrese el valor de c: ");
        c = entrada.nextDouble();
        
       
        rpt = (int)((a * a + b * b) / c);
        
       
        System.out.println("El resultado de la fórmula es: " + rpt); 
         
     }
}
