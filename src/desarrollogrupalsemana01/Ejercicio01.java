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
public class Ejercicio01 {
    public static void main(String[] args) {
      double area,lado;
      Scanner lector=new Scanner(System.in);

        System.out.println("Ingrese el area del cuadrado");
        lado=lector.nextDouble();

        area=(lado*lado);
         System.out.println("El resultado es "+area);
    }

}

