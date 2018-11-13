package odd.and.even;

import java.util.Arrays;

public class OddAndEven {
    public static void main(String[] args) {
        //public static void main(String[] args) {
      
      int [] array3 = {3,9,15,20,65,23,18,4,2,14,21,12};
      int odd[] = new int [5],  even[] =  new int [5];
      System.out.println("Arrays: " + Arrays.toString (array3));
      
      for (int counter = 0, e = 0, o = 0; counter<10; counter++) {
         switch (array3[counter]%2){
             case 1: odd[o] = array3[counter];
                 o++;
                 break;
             default: even[e] = array3[counter];
                 e++;
                 break; 
         }
     } 
       System.out.println("Even:\tOdd:");
           for (int i = 0; i < 5; i++) {
             System.out.println(even[i] + "\t" + odd[i]);  
           }
    }
}

    

