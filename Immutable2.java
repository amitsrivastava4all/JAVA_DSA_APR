public class Immutable2 {
    public static void main(String[] args) {
       /* String sql = "select * from product where type=‘mobile’";
        sql = sql + " and price between 2000 and 5000 ";
        sql = sql + " and rating>=4";*/
        // Mutable (Modify)
        // Allow Multiple Threads to access resource parallel
        StringBuilder sb= new StringBuilder(); // Java 1.5
        //StringBuffer sb = new StringBuffer(100); // Java Initial
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Amit"); // synchronized (Blocking) StringBuffer (One Thread only enter others need to wait)
        sb.ensureCapacity(200);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("Shashi Srivastava");
        sb.append("ngdfjkghdjkfghjkdfgh gjdkhfgkjhdf  kghdkgd gdkhgkj");
        System.out.println(sb.capacity());
        System.out.println(sb.length());


    }
}
