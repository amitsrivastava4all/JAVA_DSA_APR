public class LeftPyramid {
    public static void main(String[] args) {
        int n = 7; // Number of Lines
        for(int  line =1; line<=n; line++){
            // Nested Loop for Stars
            for(int star = 1; star<=line; star++){
                System.out.print("*"); // Left to Right
            }
            System.out.println(); // top to Bottom (new Line)
        }
    }
}
