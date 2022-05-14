class ReverseNumber{
    public static void main(String[] args) {
        int num = 131;
        int copy = num;
        int result = 0;
        int pow = 10;
        while(num!=0){
            int rem = num % 10; // last digit
            result = result * pow + rem;
            num = num /10; // make the number small

        }
        if(copy == result){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not");
        }
        System.out.println(result);
    }
}