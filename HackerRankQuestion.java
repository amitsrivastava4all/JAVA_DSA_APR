import java.util.Scanner;

public class HackerRankQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        long x = sc.nextLong();
        //long x = 213333333333333333333333333333333333L;

        if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
            System.out.println("* byte");

        }
        if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
            System.out.println("* short");

        }
        if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
            System.out.println("* int");

        }
        if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
            System.out.println("* long");

        }
    }
    catch(Exception e){
        System.out.println("can't be fitted anywhere.");
    }


    }
}
