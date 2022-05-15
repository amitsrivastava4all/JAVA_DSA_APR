public class PrimeNumber {
   public static void main(String[] args) {
       // 1 to 1000 Prime Number
       for(int j = 1; j<=1000; j++){
       int num = j;
       boolean isPrime = true;
       for(int i= 2 ; i<=Math.sqrt(num); i++){
           if(num%i ==0){
                isPrime = false;
                break;
           }
       }
        if(isPrime){
            System.out.println("Prime No "+num);
        }
       //System.out.println(isPrime?"Prime No "+num:" Not a Prime No "+num);
    }
   }
}
