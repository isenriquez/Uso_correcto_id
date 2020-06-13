/*
 *Implementar un algoritmo donde nos permita ingresar un objeto , sus atributos
y sus funciones o servicios con el fin de entrenar el,uso correcto
 */
package uso_correcto_id;

import java.util.Scanner;

/**
 *
 * @author Israen Enriquez
 */
public class Uso_correcto_id {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//new rerva espacio de memoria
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("USO CORRECO DE IDENTIFICADORES");
        System.out.println("Ingrese la clase de objeto:");
        String claseobj1=objeto.nextLine();
        System.out.println("Ingrese los atributos:");
        String atrib1=objeto.nextLine();
        String atrib2=objeto.nextLine();
        String atrib3=objeto.nextLine();
        String atrib4=objeto.nextLine();
        String atrib5=objeto.nextLine();
        System.out.println("Ingrese los servicios :");
        String serv1=objeto.nextLine();
        String serv2=objeto.nextLine();
        String serv3=objeto.nextLine();
        String serv4=objeto.nextLine();
        String serv5=objeto.nextLine();
        System.out.println("Gracias por utilizar el programa");
    }
    }
