
package cap6.ejercicio107;

import java.util.Scanner;


public class Cap6Ejercicio107 {

  
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner Teclado = new Scanner(System.in);

          double numes = 0, codigo, edad, mayoredad = 0, menoredad = 0, promediomayor = 0, promediomenor = 0;
        
          
       System.out.println("Digite Numero De Estudiantes");
      numes = Teclado.nextInt();
      
    
      
        for (int i = 0; i < numes; i++) {
               System.out.println("Digite Codigo Del Estudiante");
      codigo = Teclado.nextDouble();
      
      System.out.println("Digite La edad Del Estudiante");
      edad = Teclado.nextDouble();
            if  (edad > 21){
               mayoredad = mayoredad +1;
          
               
            }
               
            else {
                menoredad = menoredad +1;
           }
         
        }
        
        
        
        promediomayor =( mayoredad * 100) / numes;
        
        promediomenor = (menoredad  *100 )/ numes;
        
        
      
        System.out.println("El Promedio De Estudiantes Mayores De 21 Es: " +promediomayor);
        
        System.out.println("El Promedio De Estudiantes Menores De 21 Es: " +promediomenor);
        

        
        
        
          
      
      
      
      
        
        
        
    }
    
}
