class First{
    public static void main(String[] args) {
        // Nested Loop

        outerloop: // Label (Labeled Loop)
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                if(i==j){
                    //break outerloop; // exit from the label loop
                    continue outerloop; // skip from the label iteration (i loop iteration skip)
                    //break; // exit from the current loop
                    //continue; // skip from the current iteration
                }
                System.out.println("I is "+i+" and J is "+j);
            }
        }
        System.out.println("Main Ends");
    }
}