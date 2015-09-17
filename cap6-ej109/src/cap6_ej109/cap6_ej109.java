/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap6_ej109;

import java.util.Scanner;

/**
 *
 * @author Linda Charris
 */
public class cap6_ej109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
         
        int i;
        int pos = 0, neg = 0; 
        int[] numeros = new int[100]; 
        double sumaPos = 0, sumaNeg = 0; 
        
        
        System.out.println("DIGITE LON NUMEROS POR FAVOR: ");
        for (i = 0; i < 100; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }

       
        for (i = 0; i < 100; i++) {
            if (numeros[i] > 0){
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ 
                sumaNeg += numeros[i];
                neg++;
            }
        }

        
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
    }
    
}
