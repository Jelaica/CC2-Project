
package pkg8finalactivity;
import java.util.Scanner;
public class Main {
    public static Scanner moon = new Scanner(System.in); 
    public static void main(String[] args) {
      star();
    }
    static void star(){
        System.out.print("What do you want? Factorial/Fibonacci?");
        String unicorn = moon.nextLine();
        tanong(unicorn);
    }
    static void tanong(String unicorn){
        if("Fibonacci".equalsIgnoreCase(unicorn)){
            fibonacci();
       }
        else if("Factorial".equalsIgnoreCase(unicorn)){
            factorial();
       }
        else{
        star();
        }
    }
    static void fibonacci(){
        int universe [] = seahorse();
        for (int stars = 0; stars < universe.length; stars++){
             System.out.print("f("+ universe[stars] +")\t");
        }
        System.out.println("");
        for (int stars = 0; stars < universe.length; stars++){
             System.out.print(planet(universe[stars]) +"\t");
        }
        }
    static int planet (int w) {
        if(w<=1){
            return w;
        }else {
            return planet(w-1)+ planet(w-2);
        }
    }
    static void factorial(){
        int universe [] = seahorse();
         for (int stars = 0; stars < universe.length; stars++){
             System.out.print("f("+ universe[stars] +")\t");
        }
        System.out.println("");
        for (int stars = 0; stars < universe.length; stars++){
             System.out.print(dust(universe[stars]) +"\t");
    }
}
   static int dust (int w) {
        if(w<=2){
            return w;
        }else {
            return (w * dust(w-1));
        }
    } 
     static int[] seahorse(){
           System.out.println("How many element will you put in your array?");
           int planetnum = moon.nextInt();
           int universe[] = new int[planetnum];
           System.out.println("Enter you Element:");
           for (int stars = 0; stars < universe.length; stars++){
               universe[stars] = moon.nextInt();
               }
            return universe;
           
       }
    }