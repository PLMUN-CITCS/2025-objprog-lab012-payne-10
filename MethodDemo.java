public class MethodDemo {
    // Main method: Entry point of the program
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!"); // Calling the printMessage method with a parameter
    }

    // Method to print a greeting message
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }

    // Method to print a user-defined message
    public static void printMessage(String message) {
        System.out.println(message);
    }
}