import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase
        
        // Check if the input is a pangram
        boolean isPangram = checkIfPangram(input);
        
        // Display the result
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }
    
    // Method to check if a string is a pangram
    public static boolean checkIfPangram(String str) {
        // Create a boolean array to mark the presence of each letter
        boolean[] present = new boolean[26]; // 26 letters from a to z
        
        // Iterate through the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Mark the presence of the letter in the array
                present[ch - 'a'] = true;
            }
        }
        
        // Check if all letters are present
        for (boolean isPresent : present) {
            if (!isPresent) {
                return false;
            }
        }
        
        return true;
    }
}

