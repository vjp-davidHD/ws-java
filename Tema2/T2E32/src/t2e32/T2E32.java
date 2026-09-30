/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2e32;
import java.util.Scanner; // importamos escanner
/**
 *
 * @author alumno
 */
public class T2E32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        
        //declaramos variables
        int dinero;
        int v50 = 0;
        int v20 = 0;
        int v10 = 0;
        int v5 = 0;
        int v2 = 0;
        int v1 = 0;
        int inicio;
        //pedimos la cantidad de dinero
        System.out.println("Introduce una cantidad de euros: ");
        dinero = entrada.nextInt();
        
        inicio = dinero;
        // hacemos los calculos para dividir el dinero en billetes de la fomra más eficiente
        v50 = dinero / 50;
        dinero = dinero % 50;
        
        v20 = dinero / 20;
        dinero = dinero % 20;
        
        v10 = dinero / 10;
        dinero = dinero % 10;
        
        v5 = dinero / 5;
        dinero = dinero % 5;
        
        v2 = dinero / 2;
        dinero = dinero % 2;
        
        v1 = dinero / 1;
        dinero = dinero % 1;
        
        //mostramos el resultado
        System.out.println(inicio + " euros se descomponen en " +
                           v50 + " billetes de 50, " +
                            v20 + " billetes de 20, " +
                            v10 + " billetes de 10, " +
                            v5 + " billetes de 5, " +
                            v2 + " monedas de 2, " +
                            v1 + " monedas de 1, ");
        
        
        
    }
    
}
