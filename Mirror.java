public class Mirror {
    public static void main(String[] args) {
        int n = 7; // number of lines
        for(int line = n; line>=1; line-- ){
            // Space
            for(int space =1;space<=n-line; space++ ){
                System.out.print(" ");
            }
            for(int star = 1; star<=line; star++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
