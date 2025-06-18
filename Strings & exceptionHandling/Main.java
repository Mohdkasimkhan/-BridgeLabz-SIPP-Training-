import java.util.Scanner;

   public class Main{

    // This method will throw the exception (intentionally)
    static void generateArrayIssue(String[] names) {
        System.out.println(" Trying to access an index that doesn't exist");
        //  This will crash if not handled
        System.out.println("Accessing index 10: " + names[10]);
    }

    // This method handles the exception 
    static void handleArrayIssue(String[] names) {
        System.out.println(" Let's handle the  index using try-catch:");
        try {
            // Same error, 
            System.out.println("Accessing index 10: " + names[10]);
        } catch(  ArrayIndexOutOfBoundsException e) {
            System.out.println("you're going out of bounds! Error: " + e.getMessage());
        } catch (RuntimeException t) {
            System.out.println("Something went wrong: " + t.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("👋 Let's store some names (5 total):");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Step 1: This will crash the program ;
        // generateArrayIssue(names);

        // Step 2: This will handle the error smoothly
        handleArrayIssue(names);

        System.out.println(" Program didn’t crash, thanks to try-catch 😌");
    }
}
