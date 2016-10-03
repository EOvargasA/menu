/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //asignacion de valores
        int opcion;
        opcion = menu();
    }
    public static int menu (){
        int opcion;
        Scanner teclado=new Scanner(System.in);
       do{
            //Despliege del menu
            System.out.println("*****   Calculo del area   *****");
            System.out.println("*****   Menu   *****");
            System.out.println("Introduzca el tipo de area deseada");
            System.out.println("1. Area de un cuadrado");
            System.out.println("2. Area de un circulo");
            System.out.println("3. Area de un triangulo");
            System.out.println("0. Salir");
            //Seleccion de la opcion
            opcion= teclado.nextInt(); 
       }while (opcion < 0 || opcion > 3);
       return opcion;
    } 
    public static double areas (int a){
        double area;
        switch (a){
            case 0:
                salida();
                break;
            case 1:
                area = areacuadrado();
                break;
            case 2:
                area = areacircular();
                break;
            case 3:
                area = areatriangular();
                break;
            default:
                error();
        }
        return area;
    }
}
