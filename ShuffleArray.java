import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create the array
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        
        // Shuffle the array
        shuffleArray(array);
        
        // Print the shuffled array
        System.out.println("Shuffled array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
    // Method to shuffle an array
    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index j such that 0 <= j <= i
            int j = rand.nextInt(i + 1);
            
            // Swap array[i] with array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
