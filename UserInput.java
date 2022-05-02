class UserInput{
    // String args [] - Command Line Arguments
    // main() is a function , entry point of every java program
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]); // String cast into int
        int second =Integer.parseInt(args[1]);
        int third = first + second;
        System.out.println(third);
    }
}

