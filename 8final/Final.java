
package pkg8final;
import java.util.Scanner;
public class Final {
    public static Scanner spain = new Scanner (System.in);
    public static void main (String[]args){
           jelay();
    }

    static void jelay(){
        System.out.print("What do you want to get? Factorial or Fibonacci? ");
        String answer = spain.nextLine(); 
        if (!"factorial".equals(answer) && !"fibonacci".equals(answer)){
            jelay();
        }
        jelayb(answer);
    }
  
    static void jelayb (String answer){
        switch (answer) {
            case "fibonacci":
            case "factorial": 
            System.out.print("Enter the size of the array: ");
            int arrayholder[] = new int [spain.nextInt()];
       
            System.out.print("Enter element/s of the array: ");
                       for (int a=0; a<arrayholder.length; a++) {
                       arrayholder[a] = spain.nextInt();  
        }
                userinput(answer,arrayholder);
                break;
    }  
    }//end of array input
    
    static int fibcalcu (int w){
            if(w<=1){
            return w;
        } else {
            return fibcalcu(w-1) + fibcalcu(w-2);
        }
    }//end of fibcalcu
    
    static int factcalcu (int z){
        if (z<=1){
            return 1;
        } else {
            return z*factcalcu(z-1);
        }
    }//end of factcalcu
            
      
     static void userinput(String answer, int[]arrayholder){
         
          if (answer.equals("factorial")){
              for (int i = 0; i < arrayholder.length; i++){
                  System.out.println("f(" + arrayholder[i] + ")=" + factcalcu(arrayholder[i]));
              }
              
          } else if (answer.equals("fibonacci")) {
               for (int i = 0; i < arrayholder.length; i++){
                  System.out.println("f(" + arrayholder[i] + ")=" + fibcalcu(arrayholder[i]));
              }          
          } else {
              jelay();
          }
              
       
     } 
}
