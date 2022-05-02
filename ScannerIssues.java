import java.util.Scanner;

public class ScannerIssues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        System.out.println("Enter the Name");
        //String name = scanner.next();
        scanner.nextLine(); // eat \n
        String name = scanner.nextLine(); // till \n
        System.out.println("Welcome "+name+" Age "+age);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the City");
        String city = scanner2.next();
        System.out.println("City is "+city);
        scanner2.close();
        scanner.close(); // Buffer close + System.in close
    }
}
