class StringDemo2{
    public static void main(String[] args) {
        // There  are 2 ways to create String Object
        // a) Literal Way e.g String a = "Amit";
        // b) new object e.g String a = new String("Amit");
        String a = "Amit"; // String a = "Amit".intern();
        String b = new String("Amit"); // create a new one in heap
        // 2 or 1 object (new)
        String c = new String("Amit").intern(); // refer the Pool one
        System.out.println(a==b); // false
        System.out.println(a==c); // true
        // what intern() will  do
        // intern - check in a pool , object is exist or not
        // if exist so refer the exist one , otherwise create new

    }
}