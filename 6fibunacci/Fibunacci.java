l;
package fibunacci;
import java.util.Scanner;
public class Fibunacci {
    public static void main(String[] args) {
        milkyway();
    }
    
    static int planet (int w) {
        if(w<=1){
            return w;
        }else {
            return planet(w-1)+ planet(w-2);
        }
    }
    static void milkyway(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int universe = new Scanner(System.in).nextInt();
        
           for (int stars=0; stars<= universe; stars++){
                System.out.print("f("+ stars +")\t");
           }
           System.out.println();
              for (int spaceship=0; spaceship<= universe; spaceship++){
                  for (int sun=0; sun<= spaceship; sun++){
                   System.out.print(planet(sun)+ "\t"); 
               }  
            System.out.println();
        }
    }
}
