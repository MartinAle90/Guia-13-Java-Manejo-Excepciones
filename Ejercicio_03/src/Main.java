import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args)  throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        /*Ejercicio 2

        int[] vectorsito = new int[5];


        try {
            vectorsito[6]=1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El vector no tiene ese tamaño");
            System.out.println("Error: "+e.getMessage());
        }*/

        //Ejercicio 3 y 4
        System.out.println("Dame los 2 numeros:");

        try {
            int num1=leer.nextInt();
            String num2=leer.next();
            //double tres= Double.parseDouble(num1);
            //int uno = Integer.parseInt(num1);
            int dos = Integer.parseInt(num2);
            //System.out.println(uno/dos);
            System.out.println(num1/dos);

        } catch (NumberFormatException e) {
            System.out.println("Error: "+e.getMessage());
            System.out.println("No se pudo convertir esa cadena a numero entero");

        } catch (ArithmeticException e){
            System.out.println("Error :"+e.getMessage());
            System.out.println("Division no permitida");
        } catch (InputMismatchException e){
            System.out.println("Error :"+e.getMessage());
            System.out.println("Tipo de dato no válido");
        } finally {
            System.out.println("Te mando saludes");
        }
    }
}