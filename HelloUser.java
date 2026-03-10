public class HelloUser {

    public static void main(String[] args) {

        // Check if name is provided
        if (args.length == 0) {
            System.out.println("Please provide your name as a command-line argument.");
            return;
        }

        // Get name from command-line argument
        String name = args[0];

        // Display greeting
        System.out.println("Hello " + name);
    }
}