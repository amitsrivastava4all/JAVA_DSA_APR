

public class LeapYear {
    public static void main(String[] args) {
        int year = 2007;
        if(year % 4 ==0){
            if(year % 100 !=0){
                System.out.println("Leap Year");
            }
             else if(year % 400 ==0){
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not a Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }



}
}