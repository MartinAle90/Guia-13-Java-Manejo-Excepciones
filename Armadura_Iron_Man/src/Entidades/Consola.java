/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Martin
 */
public class Consola {
    
    public void escribir(frase mensaje) {
        System.out.println(mensaje);
    }

    public enum frase {
        BUENOS_DIAS_TONY,
        HOLA_DE_NUEVO_JEFE,
        NECESITA_MI_AYUDA_JEFE,

    }

}
