import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Three Numbers Which Number is Greater
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int second = scanner.nextInt();
        System.out.println("Enter the Third Number");
        int third = scanner.nextInt();
        // Nested if else
        if(first>second){
            if(first>third){
                System.out.println("First Number is Greater");
            }
            else if(third>second){
                System.out.println("Third Number is Greater");
            }

        }
        else if (second>third){
            System.out.println("Second is Greater");
        }
        else if(third>second){
            if(third>first){
                System.out.println("Third is Greater");
            }
        }
        // Multiple if else
        /*
        if(first>second && first>third){
            System.out.println("First is Greater");
        }
        else if(second>first && second>third){
            System.out.println("Second is Greater");
        }
        else{
            System.out.println("Third is Greater");
        }*/
        scanner.close();

    }
}
