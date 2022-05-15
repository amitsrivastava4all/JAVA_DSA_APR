public class ArmStrongNumber {
    public static void main(String[] args) {
        // 153
        for(int i =1; i<=1000; i++){
        int num = i;
        //int copy = num;
        int sum = 0;
        while(num!=0){
            int digit = num%10;
           sum = sum+  (digit * digit * digit);
           num = num/10;
        }
        if(i == sum){
            System.out.println("ArmStrong Number "+i);
        }
        // else{
        //     System.out.println("Not an Armstrong number");
        // }
    }
}
}
