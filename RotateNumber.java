public class RotateNumber {
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        //int r = 7;
        int r = -2;
        int count = 0;

        // Count Digits
        while(copy!=0){
            count++;
            copy = copy/10; // Make Number Small
        }
        if(r<0){
            r =count - r;
        }
        r = r % count;
        int leftPartCount= count - r; // 5 - 2 // 3
        int rightPartPower  = (int)Math.pow(10,r); // 100
        int rightPart = num % rightPartPower; // 12345 % 10^r
        int leftPart= num / rightPartPower; // 12345/100
        int rightValue = rightPart * (int)Math.pow(10, leftPartCount); // 45 * 10 ^ leftPartCount // 45 * 1000
        int result = rightValue + leftPart;
        System.out.println(result);

    }

}
