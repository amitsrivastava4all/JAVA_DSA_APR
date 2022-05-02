
import java.util.Scanner;
//import java.lang.String; // Auto Import
public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber = scanner.nextInt();
        int third = firstNumber + secondNumber;
        System.out.println("Sum is "+third);
        scanner.close(); // Buffer close
        // System.in - Take Input
        // What is Scanner?
        // Scanner is a Buffer, Scanner is a predefine class
    }
}
