/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e29;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3E29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Iniciamos el Escaner entrada
        
        //Declaramos las variables
        int num;
        double aleatorio;
        int intento = 0;
        
        //Creamos un número aleatorio
        aleatorio =  (Math.random()*100);
        aleatorio =   Math.floor(aleatorio);
        
        /*Repetimos un bucle en el que se comprueba si el número que pasamos
        es mayor o menos y nos va guiando dependiendo del numero que metemos 
        */
        
        do{
            System.out.println("Introduce un número:    ");
            num = entrada.nextInt();
            
            if (aleatorio < num){
                System.out.println("El número es menor");
                //Contamos los intentos
                intento++;
            }else if (aleatorio > num){
                System.out.println("El número es mayor");
                //Contamos los intentos
                intento++;
            }else if (num == aleatorio){
                System.out.println("Ehorabuena, has encontrado el número");
            }   
        }while(num != aleatorio);
        
        System.out.println("Has usado " + intento + " intentos");
        
        // TODO code application logic here
    }
    
}
