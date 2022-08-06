import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
      double a, b, c;
        
        Scanner edge1 = new Scanner(System.in);
        Scanner edge2 = new Scanner(System.in);

      System.out.println("Enter the 1st side length:");
      a = edge1.nextDouble();

      System.out.println("Enter the 2nd side length");
      b = edge2.nextDouble();
        

        c = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2)); 
        System.out.println("hipotenus is:" + c);
    }
}