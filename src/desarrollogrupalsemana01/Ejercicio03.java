/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollogrupalsemana01;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args){
        double monto_total, monto_IGV, monto_original;
        Scanner dinero = new Scanner(System.in);
        System.out.println("Bienvenido!");
        System.out.println("Por favor ingrese su monto total:");
        System.out.print("S/. ");
        monto_total = dinero.nextDouble();
        monto_original = monto_total/1.18;
        monto_IGV = monto_total - monto_original;
        
        
    
    }
}
