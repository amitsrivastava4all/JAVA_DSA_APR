public class ImmutableDemo {
    public static void main(String[] args) {
        String a = "Amit";
        String b = "Amit";
        String c = "Amit";
        String d = new String("Amit");
        String e = "AMIT";
        a = "Amit Srivastava";
        // = means assignment
        // == compare
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a==d);
        System.out.println(a==e); // false
        System.out.println(a.equals(d));
        System.out.println(a.equals(e)); // false
        System.out.println(a.equalsIgnoreCase(e)); // true
        // == vs equals
        // == in case of object so it compare the reference
        // .equals - compare object value
    }
}
