/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    //Ejercicio 3 y 4
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            int num1 = leer.nextInt();
            String num2 = leer.next();
            //double tres= Double.parseDouble(num1);
            //int uno = Integer.parseInt(num1);
            int dos = Integer.parseInt(num2);
            //System.out.println(uno/dos);
            System.out.println(num1 / dos);

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
            System.out.println("No se pudo convertir esa cadena a numero entero");

        } catch (ArithmeticException e) {
            System.out.println("Error :" + e.toString());
            System.out.println("Division no permitida");

        } catch (InputMismatchException e) {
            System.out.println("Error :" + e.toString());
            System.out.println("Tipo de dato no válido");

        } finally {
            System.out.println("Te mando saludes");
        }
    }
}
