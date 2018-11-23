
package pkg7arrayfib;
public class Main {
    
        public static void main(String[] args) {
        int galaxy[] = {3,5,7,13,2,3,9,7,5,8,3};
        int galaxy2[] = {3,5};
        display (galaxy2);
        
        
   }
        
  static void display(int[] galaxy){
      for(int i = 0; i < galaxy.length; i++) {
        
        
          System.out.print("f(" + galaxy[i] +")\t");
          System.out.print(fib(galaxy[i]));
          System.out.print("\n");
    }
   }
  
  static int fib(int nth) {
    if (nth == 0) {
        return 0;
    }
    if (nth == 1){
        return 1;
    } else {
        return fib(nth - 1) + fib(nth - 2);
    }
    }
    
}
