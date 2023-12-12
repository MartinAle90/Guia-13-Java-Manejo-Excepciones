/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02;

/**
 *
 * @author Martin
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{

        int [] vectorsito = new int[5];
        
        try {
            vectorsito[6]=1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El vector no tiene ese tamaño");
            System.out.println("Error: "+ e.toString());

        }
        
        
    }
    
}
