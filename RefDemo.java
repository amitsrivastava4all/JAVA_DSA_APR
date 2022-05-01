public class RefDemo {
    public static void main(String[] args) {
        String name = "Amit"; // name has a reference of Amit
        String msg = "Welcome User , How are You, Hope U r doing good";
        String msg2 = msg;
        System.out.println(msg == msg2); // Compare the Reference
        System.out.println(msg.length());
        // String it is a predefine class
        // String internally char [] --> byte []
        char e = 'A';
        char w [] = {'A', 'm', 'i', 't'};

    }
}
