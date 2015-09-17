
package cap6.ejercicio103;

import java.util.Scanner;


public class Cap6Ejercicio103 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  Teclado = new Scanner(System.in);
        
       
       int edad, nacionalidad, estatura, hindualto = 0, latinomediano = 0, germanosbajos = 0,germanosmenores = 0,latinosbajosmenores = 0;
       int totallatinos = 0;
       System.out.println("\nEscoja Su Estatura \n 1-Alto  2-Mediano   3.Bajo");
         estatura = Teclado.nextInt();
       
             System.out.println("\nEscoja Su Nacionalidad \n 1-Latino   2-Germano   3-Hindu");
                   nacionalidad = Teclado.nextInt();
               
                     System.out.println("\nDigite Su Edad");
                          edad = Teclado.nextInt();
                          
        for (int i = 0; i < 300; i++) {
            
        if  (estatura == 1 && nacionalidad == 3){
          hindualto = hindualto +1;
        }
       
          else if (estatura ==2 && nacionalidad == 1){
              latinomediano = latinomediano +1;
           }
        
          else if (estatura == 3 && nacionalidad ==2){
              germanosbajos = germanosbajos +1; 
        }   
        
        if (nacionalidad == 1){
            totallatinos = totallatinos +1;
        }
         
        if (nacionalidad == 2 && edad < 30){
            germanosmenores = germanosmenores +1;   
        }
        
        if (nacionalidad == 1 && estatura == 3 && edad <40){
           latinosbajosmenores = latinosbajosmenores +1;
           
        }
        System.out.println("\nEscoja Su Estatura \n 1-Alto  2-Mediano   3.Bajo");
         estatura = Teclado.nextInt();
       
             System.out.println("\nEscoja Su Nacionalidad \n 1-Latino   2-Germano   3-Hindu");
                   nacionalidad = Teclado.nextInt();
               
                System.out.println("\nDigite Su Edad");
                          edad = Teclado.nextInt();
        }
        System.out.println("El Numero De Hindues Altos Es: \n" +hindualto);
        
             System.out.println("El Total De Latinos es: \n" +totallatinos);
        
                 System.out.println("El Numero De Latinos Medianos es: \n" +latinomediano);
                 
                    System.out.println("Y El Numero De Latinos Bajos Menores De 40 Años Es: \n" +latinosbajosmenores);
                  
                     System.out.println("Numero De Germanos Bajos Es \n" +germanosbajos);
                     
                         System.out.println("El Total De Germanos Menores De 30 Años Es: \n" +germanosmenores);
                         
           
            
        }
                 

        
    }
    
