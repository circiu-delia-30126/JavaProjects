package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static void findEvenOdd(String input) {
        // Split the input string by commas to extract integers
        String[] numbersStr = input.split(",");
        
        int largestEven = Integer.MIN_VALUE; // Initialize largest even number
        int smallestOdd = Integer.MAX_VALUE; // Initialize smallest odd number
        int largestEvenPosition = -1; // Initialize position of largest even number
        int smallestOddPosition = -1; // Initialize position of smallest odd number
        
        // Iterate through the numbers
        for (int i = 0; i < numbersStr.length; i++) {
            int num = Integer.parseInt(numbersStr[i]);
            
            // Check if the number is even
            if (num % 2 == 0 && num > largestEven) {
                largestEven = num;
                largestEvenPosition = i;
            }
            // Check if the number is odd
            else if (num % 2 != 0 && num < smallestOdd) {
                smallestOdd = num;
                smallestOddPosition = i;
            }
        }
        
        // Display results
        if (largestEvenPosition != -1) {
            System.out.println("Largest even number: " + largestEven + ", position: " + largestEvenPosition);
        } else {
            System.out.println("No even numbers found.");
        }
        
        if (smallestOddPosition != -1) {
            System.out.println("Smallest odd number: " + smallestOdd + ", position: " + smallestOddPosition);
        } else {
            System.out.println("No odd numbers found.");
        }
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        findEvenOdd(input);
    }
}

