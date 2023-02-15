public class Recursion {
    public static void main(String[] args) {
        sayHi();
    }

    public static void sayHi() {
        System.out.println("Hi");
        sayHi();

        // that is a infinite loop call and this fill the stack memory and throws the stackOverflowError in the terminal.
    }
}
