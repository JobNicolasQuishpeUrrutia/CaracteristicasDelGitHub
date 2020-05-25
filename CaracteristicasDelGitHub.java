/*
Implementar un algoritmo que me permita ingresar por teclado
las caracteristicas principales de GitHub
 */
package caracteristicasdelgithub;

/**
 *
 * @author: Quishpe Urrutia Job Nicolas
 */

import java.util.Scanner;
public class CaracteristicasDelGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner (System.in); //new, reserva espacio de memoria.
        
        System.out.println("Ingrese la caracteristica más importante de GitHub:");
        String caracteristicaimportante=objeto.nextLine();
        
        System.out.println("Ingrese la primera caracteristica de GitHub:");
        String primera=objeto.nextLine();
        
        System.out.println("Ingrese la segunda caracteristica de GitHub:");
        String segunda=objeto.nextLine();
        
        System.out.println("Ingrese la tercera caracteristica de GitHub:");
        String tercera=objeto.nextLine();
        
        System.out.println("Ingrese la cuarta caracteristica de GitHub:");
        String cuarta=objeto.nextLine();
        
        System.out.println("Ingrese la quinta caracteristica de GitHub:");
        String quinta=objeto.nextLine();
    
    }
    
}
