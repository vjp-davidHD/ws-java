/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e27;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3E27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//Creamos el escaner entrada 
        // TODO code application logic here
        
        //Declaramos las variables
        int num1; 
        int num2;
        int valor;
        int resultado;
        
        //Pedimos los dos números
        System.out.print("Introduce el primer número:    ");
        num1 = entrada.nextInt();
        
        System.out.print("Introduce el segundo número:    ");
        num2 = entrada.nextInt();
        
        //Primer do que hace que el bucle se ejecute hasta que se decida salir del programa valor ==5
        do {
            //Segundo do muestras las opciones y damos a elegir una
            do{
                System.out.println("-=ELIGE UNA OPCIÓN=-");
                System.out.println("     1.- Sumar los números.");
                System.out.println("     2.- Restar los números.");
                System.out.println("     3.- Multiplicar los números.");
                System.out.println("     4.- Dividir los números.");
                System.out.println("     5.- Salir del programa.");
                System.out.print("Introducir valor:    ");
                valor = entrada.nextInt();
            
            }while(valor < 1 && valor > 6);
        
            //La opción seleccionada es guardada en valor
                switch (valor) {
                    case  1:    //Sumamos
                                resultado = num1 + num2;
                                System.out.println("La suma es: " + resultado);
                                break;
                            
                    case  2:    //Restamos
                                resultado = num1 - num2;  
                                System.out.println("La resta es: " + resultado);
                                break;
                            
                    case  3:    //Multiplicamos
                                resultado = num1 * num2;  
                                System.out.println("La multiplicación es: " + resultado);
                                break;   
                            
                    case  4:    //Dividimos con un try para asegurar que los datos son correctos
                                try{
                                    resultado = num1 / num2;
                                }catch(ArithmeticException e){
                                    System.out.println("ERROR: " + e.getMessage());
                                    resultado = 0;
                                }
                                System.out.println("La división es: " + resultado);
                                break;
                
                    case  5:    //Salimos del programa
                                System.out.println("Se ha salido del programa");
                                
                     default :  System.out.println("ERROR: Numero incorrecto");
                }
                //Dejamos unas lineas blancas para separar mejor todo
                System.out.println("");
                System.out.println("");
                System.out.println("");
        }while(valor !=5);
    }
    
}
