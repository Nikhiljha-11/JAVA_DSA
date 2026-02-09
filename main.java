
import java.util.Scanner;
public class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in );
        System.out.println("Enter the number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the number b: ");
        int b =scanner.nextInt();
        int sum = a+b;
        System.out.println("The result is: "+ sum +"  now the multiplication is "+a*b);
        scanner.close();
    }
    
}
