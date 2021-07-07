/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actobligatoria2;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Erika
 */
public class ActObligatoria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa tu nombre");
        String nombre = "";
        System.out.println("Ingresa tu apellido");
        String apellido = "";
        System.out.println("Ingresa tu edad (de forma numerica)");
        int edad = 0;
        System.out.println("Ingresa tu hobbie");
        String hobbie= "";
        System.out.println("Ingresa tu codigo editor preferido");
        String editorPref= "";
        System.out.println("¿Que sistema operativo utiliza? Por favor ingreselo");
        String sistOperativo = "";
        
        Scanner entradaEscanner=new Scanner(System.in);
        nombre=entradaEscanner.nextLine();
        apellido=entradaEscanner.nextLine();
        edad=parseInt(entradaEscanner.nextLine());
        hobbie=entradaEscanner.nextLine();
        sistOperativo=entradaEscanner.nextLine();
        
         System.out.println("Su nombre es: "+ " " + nombre ); 
         System.out.println("Su apellido es: " + " " +apellido);
         System.out.println("Su edad es: " + " " +edad);
         System.out.println("Su hobbie es: " + " " +hobbie);
         System.out.println("Su editor de codigo preferido es: " + " " +editorPref);
         System.out.println("El sistema operativo que utiliza es: " + " " + sistOperativo);        
    }
    
}
