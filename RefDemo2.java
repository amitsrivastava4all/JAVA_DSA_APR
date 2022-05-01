public class RefDemo2 {
    public static void main(String[] args) {
        // 1 Memory (Object)
        String x = "Amit".intern();
        //String x = "Amit"; // Allocate a Memory for Amit
        //x contains the reference of Amit Memory
        String y = "Amit"; // 0 Memory (Object)
        System.out.println(x == y); // true
        String z = new String("Amit").intern();  // 1 Object
        // Force to create a fresh memory outside the String Pool
        // new reserve keyword , Allocate Fresh Memory
        System.out.println(x == z); // false true
        String d = new String("ram"); // 2 Object
        // 1 . In Pool // 2. Heap


    }
}
