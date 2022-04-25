public  class SalarySlipPrint {
    public strictfp static void main(String[] args) {
        // Name print in Proper Case
        // name is a variable it store the String value
        // What is String?
        // Collection of characters
        // String internally char array
        // String - S Capital . Internally it is a predefine class.
        String name = "aMIT shashi srivastAVA"; // Amit Shashi Srivastava
        // Logic for Proper Case
        /*
          Name Split with Space
          amit
          shashi
          srivastava
          amIt - first character UpperCase
          rest of characters mIt - LowerCase
        */
        // Box Syntax [] - Array
        // names["amit", "shashi","srivastava"]
        String names [] = name.split(" ");
        char singleChar = names[0].charAt(0); // a
        // charAt(index) - give single char of that index
        String capitalLetter = String.valueOf(singleChar).toUpperCase(); // A
        String subString = names[0].substring(1); // mIT;
        // substring(index) , it give the remaining string from that index.
        subString = subString.toLowerCase();
        String fullName = capitalLetter+ subString;
        System.out.println(fullName);
        // input -  "amit shashi srivastAVA"
        // output -  "Amit Shashi Srivastava"
        double basicSalary = 10000;
        double hra = basicSalary * 0.50;
        float da = (float)(basicSalary * 0.20); // Explicit Type casting
        double ta = basicSalary  * 0.40;
        double ma = basicSalary * 0.30;
        float pf = (float) (basicSalary * 0.05);
        float totalPF =pf + pf;
        double grossSalary = basicSalary + hra + da + ta + ma;
        double tax = grossSalary * 0.10;
        double netSalary = grossSalary - pf - tax;
        System.out.println("Salary Slip");
        System.out.println("Name \t "+name);
        System.out.println("basic Salary "+basicSalary);
        System.out.println("HRA "+hra);
        System.out.println("DA "+da);
        System.out.println("TA "+ta);
        System.out.println("MA "+ma);
        System.out.println("PF "+pf);
        System.out.println("Gross Salary "+grossSalary);
        System.out.println("Tax "+tax);
        System.out.println("Net Salary "+netSalary);
        System.out.println("Total PF "+totalPF);
        // double is a data type used to store decimal value.
        // 10000.20 , it can store 8 byte of data
        // float is smaller than double , float store 4 byte of decimal values.
    }
}
