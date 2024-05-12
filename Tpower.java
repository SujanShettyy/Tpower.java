//Write a program to find if a number is a power of 2 or not.
import java.util.Scanner;

public class Tpower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sc.nextInt();

         // You can change this number to test different values
        
        if (isTpower(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }
    
    public static boolean isTpower(int n) {
        // If n is less than or equal to 0, it cannot be a power of 2
        if (n <= 0) {
            return false;
        }
        
        // A power of 2 has only one bit set in its binary representation
        // So, if we AND the number with (number - 1), it should result in 0
        // For example: 8 & 7 => 1000 & 0111 => 0000
        return (n & (n - 1)) == 0;
    }
}
