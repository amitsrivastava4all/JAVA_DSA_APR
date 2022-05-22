import java.util.Scanner;

public class ArrayOperations {
    static int arr[] = new int[10];
    static int sizeOfArray = 0;
    static void insert(int pos, int value){
        int i;
        if(arr.length == sizeOfArray){
            System.out.println("Array is Full...");
            return ;
        }
        if(pos>sizeOfArray){
            System.out.println("Invalid Pos ");
            return ;
        }
        for( i = sizeOfArray; i>=pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = value;
        sizeOfArray++;
        System.out.println("Inserted....");
    }

    static void print(){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void remove(int pos){
        if(sizeOfArray==0){
            System.out.println("Array is Empty");
            return ;
        }
        if(pos>sizeOfArray){
            System.out.println("Wrong Pos ");
            return;
        }
        for(int i = pos; i<sizeOfArray; i++){
            arr[i] = arr[i+1];
        }
        arr[sizeOfArray] = 0;
        sizeOfArray--;
        System.out.println("Deleted.....");
    }

    static void search(int value){
        // Linear Search
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == value){
                System.out.println("Element Found....");
                return;
            }
        }
        System.out.println("Element Not Found...");
    }

    static void update(){
        // 1. Search Element , Index
        // Index value replace new value
    }

    static void max(){

    }
    static void min(){

    }
    static void sum(){

    }
    static void maxSecondAndThird(){

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while(true){
        System.out.println("1. Add in Array");
        System.out.println("2. Delete From Array");
        System.out.println("3. Print Array");
        System.out.println("4. Search in Array");
        System.out.println("5. Update in Array");
        System.out.println("6. Exit");
        System.out.println("7. Max Element in Array");
        System.out.println("8. Min Element in Array");
        System.out.println("9. Sum of All Even and Odd Element in Array");
        System.out.println("10. Second Max and Third Max Element in Array");
        System.out.println("Enter the Choice");
        int choice = scanner.nextInt();
        int pos = 0;
        int value = 0;
        switch(choice){
            case 1:
            System.out.println("Enter the Pos ");
             pos = scanner.nextInt();
            System.out.println("Enter the Value");
             value = scanner.nextInt();
            insert(pos, value);
            break;
            case 2:
            System.out.println("Enter the Pos");
             pos = scanner.nextInt();
            remove(pos);
            break;
            case 3:
            print();
            break;
            case 4:
            System.out.println("Enter the Value");
            value = scanner.nextInt();

            search(value);
            break;
            case 6:
            return ;
            default:
            System.out.println("Wrong Choice");
        }

        }
    }
}
