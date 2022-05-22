class Demo{
    /*
    What is Array?
    Array is an oldest DS
    Used to store multiple values (Homogeneous Values/ Same kind of values)
    index start with 0 , maintain Base Address
    e.g 100 employee salary store
    e.g 1000 student marks
    e.g 10000 order store
    Adv
    1. Random Access arr[5]  = Base Address + index * size
    2. Cache Friendly / Contigogus memory / Fast Traverse
    */
    public static void main(String[] args) {
        double salary = 9000.0;
        // One - D Array
        //double empSalary [] = {8888,222,444,555,666,777};
        //double []empSalary  = {8888,222,444,555,666,777};
         //double []empSalary  = new int[]{8888,222,444,555,666,777};
        double [] empSalary = new double[10]; //10 size array and all are filled with zero
        for(int  i = 0; i<empSalary.length; i++){
            System.out.println(empSalary[i]);
        }
        System.out.println(empSalary);
        Demo demo = new Demo();
        System.out.println(demo);
        int e [] = new int[10];
        System.out.println(e);
    }
}