/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2e23;
import java.util.Scanner; // importamos escanner
/**
 *
 * @author alumno
 */
public class T2E23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); // damos nobre entrada al escanner
        
        // declaramos las variables
        int precio;
        int unidades;
        int total;
        
        //pedimos datos
        System.out.println("Introduce el precio: "); 
        precio = entrada.nextInt();
        System.out.println("");
        System.out.println("Introduce las unidades: ");
        unidades = entrada.nextInt();
        // calculamos
        total = precio * unidades;
        
        //indicamos el precio final
        System.out.println("El precio total es: " + total);
        
        
    }
    
}
