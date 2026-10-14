/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e9;
import java.util.Scanner; // importamos el escaner
/**
 *
 * @author alumno
 */
public class T3E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        
        // Declaramos las variables;
        int num1;
        int num2;
        int num3;
        int num4;
        int temp;
        
        // pedimos los valores
        
        System.out.println("Introduce el numero 1º: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el numero 2º: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduce el numero 3º: ");
        num3 = entrada.nextInt();
        
        System.out.println("Introduce el numero 4º: ");
        num4 = entrada.nextInt();
        
        //Hacemos los cáculos para ordenar las variables de menor a mayor
        if(num1 > num2){temp = num1; num1 = num2; num2 = temp;} 
        if(num1 > num3){temp = num1; num1 = num3; num3 = temp;} 
        if(num1 > num4){temp = num1; num1 = num4; num4 = temp;}
        
        if(num2 > num3){temp = num2; num2 = num3; num3 = temp;}
        if(num2 > num4){temp = num2; num2 = num4; num4 = temp;}
        
        if(num3 > num4){temp = num3; num3 = num4; num4 = temp;}
        
        //Imprimimos la solución
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Numero 3: " + num3);
        System.out.println("Numero 4: " + num4);
    }
    
    
}
