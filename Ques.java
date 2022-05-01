public class Ques {
    public static void main(String[] args) {
        String str = "Hello How are You";
        String search = "How";
        boolean result = str.contains(search);
        //System.out.println(result);
        if(result){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
