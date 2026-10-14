/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e16;

/**
 *
 * @author alumno
 */
public class T3E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos variables
        int total = 0;
        
        //Calculamos, imprimimos y aumentamos la variable total con los impares
        for (int i = 20; i < 160; i++){
            if(i % 2 != 0){
                System.out.println(i);
                total++;
            }
        }
        
        //Imprimimos el total
        System.out.println("El total es: " + total);
    }
    
}
