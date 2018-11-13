
package pkg5.userin.pkg2d;
import java.util.Scanner;
public class UserIn2d {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
System.out.print ("Enter the number of Row:");
int x = sc.nextInt();
  System.out.print ("Enter the number of Column:");
int y = sc.nextInt();
int [][] arr = new int [x][y];

     for (int i=0; i < arr.length ; i++) {
         for (int j=0; j<arr[i].length ; j++){
              System.out.print ("Enter the value for Row" + (i) + " and Column" + (j) + ":");
              arr [i][j] = sc.nextInt();
              
         }
     }
System.out.print("The array is : \n");
  for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr.length; j++) {
        System.out.print (arr[i][j]+ " ");
      }}
  System.out.println();
    }
}

   
      