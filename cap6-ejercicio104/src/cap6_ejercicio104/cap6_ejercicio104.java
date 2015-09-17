
package cap6_ejercicio104;

import java.util.Scanner;


public class cap6_ejercicio104 {

   
    public static void main(String[] args){
        
    int i, p, n, candidatoa = 0, candidatob = 0, candidatoc = 0, candidatod = 0, candidatoe = 0, totalvot;
    float porc1, porc2, porc3, porc4, porc5; 
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Cuantos sufragantes votaron?"); 
    p = teclado.nextInt();
 
     for (i = 0; i < p; i++) { 
         
        System.out.println("Digite una opcion"); 
      
        System.out.println(" ");
        System.out.println("1. Candidato A");
        System.out.println("2. Candidato B");
        System.out.println("3. Candidato C");
        System.out.println("4. Candidato D");
        System.out.println("5. Candidato E");
        n = teclado.nextInt(); 
      
        if (n == 1){
            
            candidatoa = candidatoa + 1;
        }
        if (n == 2){
           
            candidatob = candidatob + 1;
       
        }
        if (n == 3){
            
            candidatoc = candidatoc + 1;
           
        }  
         if (n == 4){
           
            candidatoe = candidatoe + 1;
         }     
        if (n == 5){
            
            candidatoe = candidatoe + 1;
        } 
           
    }
     totalvot = candidatoa + candidatob + candidatoc + candidatod + candidatoe;
     
     
     porc1 = (float) (candidatoa * 100 / totalvot);
     porc2 = (float) (candidatob * 100 / totalvot);
     porc3 = (float) (candidatoc * 100 / totalvot);
     porc4 = (float) (candidatod * 100 / totalvot);
     porc5 = (float) (candidatoe * 100 / totalvot);
     
 
       System.out.println ("El candidato A tiene "+candidatoa+" votos."); 
       System.out.println ("El candidato B tiene "+candidatob+" votos.");
       System.out.println ("El candidato C tiene "+candidatoc+" votos.");
       System.out.println ("El candidato D tiene "+candidatod+" votos.");
       System.out.println ("El candidato E tiene "+candidatoe+" votos.");
       System.out.println (" "); 
       System.out.println (" "); 
       
       System.out.println ("El candidato A tuvo una intencion de votos de "+porc1+" %"); 
       System.out.println ("El candidato B tuvo una intencion de votos de "+porc2+" %");
       System.out.println ("El candidato A tuvo una intencion de votos de "+porc3+" %");
       System.out.println ("El candidato A tuvo una intencion de votos de "+porc4+" %");
       System.out.println ("El candidato A tuvo una intencion de votos de "+porc5+" %");
  
  
    }
}
