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
        double area;
        String forma;        
        //llamado de procesos
        opcion = menu();
        area = areas(opcion);
        forma = forma(opcion);
        mostrar(area,forma);
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
        //obteniendo el area
        switch (a){
            case 0:
                salida();
                area = 0;
                break;
            case 1:
                area = areacuadrado();
                break;
            case 2:
                area = areacirculo();
                break;
            case 3:
                area = areatriangulo();
                break;
            default:
                System.out.println("Datos incompatibles con el sistema");
                salida();
                area = 0;
        }
        return area;
    }
    public static String forma (int a){
        String forma;
        //obteniendo la forma
        switch (a){
            case 1:
                forma = "cuadrado";
                break;
            case 2:
                forma = "circulo";
                break;
            case 3:
                forma = "triangulo";
                break;
            default:
                System.out.println("Datos incompatibles con el sistema");
                salida();
                forma = "nu";
        }
        return forma;
    }
    public static void salida(){
        //salida del sistema
        System.out.println("Saliendo del sistema");
        System.exit(0);
    }
    public static double areacuadrado(){
        double area;
        Scanner teclado = new Scanner (System.in);
        //calculando el area del cuadrado
        System.out.println("*****   Cuadrado   *****");
        System.out.println("Introduce la medida de uno de los lados del cuadrado");
        area=teclado.nextDouble();
        return area*area;
    }
    public static double areacirculo(){
        double area;
        Scanner teclado = new Scanner (System.in);
        //calculando el area del circulo
        System.out.println("*****   Circulo   *****");
        System.out.println("Introduce el radio del circulo");
        area=teclado.nextDouble();
        return 3.14*Math.pow(area,2);
    }
    public static double areatriangulo(){
        double base;
        double altura;
        Scanner teclado = new Scanner (System.in);
        //calculando el area del triangulo
        System.out.println("*****   Triangulo   *****");
        System.out.println("Introduce la base del triangulo");
        base=teclado.nextDouble();
        System.out.println("Introduce la altura del triangulo");
        altura=teclado.nextDouble();
        return base*altura/2;
    }
    public static void mostrar(double area,String forma){
        //desplegando el resultado
        System.out.println("El area del "+forma+" es "+area);
    }
}
