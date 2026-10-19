
public class Main {

    // --- METHOD 1: Returns nothing (void) ---
    public static void sayHello() {
        System.out.println("Hello from a method");
    }
    // --- METHOD 2: Takes parameters and returns a String ---

    public static String greet(String name){
        return "Hello, " + name + "!";
    }
    // --- METHOD 3: Takes numbers and returns an int ---

    public static int add (int a, int b ){
        return a + b;
    }

    // --- THE MAIN METHOD (Where the program starts) ---
    public static  void main(String[] args ){
        sayHello();

        String greeting = ("Sipho");
        System.out.println("5 + 3 = " + add(5, 3));
    }

}