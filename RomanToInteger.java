import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the Roman numeral
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        
        // Convert the Roman numeral to an integer
        int result = romanToInteger(romanNumeral);
        
        // Display the result
        System.out.println("Integer equivalent: " + result);
        
        scanner.close();
    }
    
    // Method to convert Roman numeral to integer
    public static int romanToInteger(String romanNumeral) {
        // Define the values of Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int result = 0;
        int i = 0;
        
        // Iterate through the symbols
        for (int j = 0; j < symbols.length; j++) {
            // Compare the current symbol with the Roman numeral string
            while (romanNumeral.startsWith(symbols[j], i)) {
                // Add the corresponding value to the result
                result += values[j];
                // Move the index to the next position after the current symbol
                i += symbols[j].length();
            }
        }
        
        return result;
    }
}
