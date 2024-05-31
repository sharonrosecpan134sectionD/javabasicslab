public class Main {
    public static void main(String[] args) {
        // Task 1: Variable Declaration and Initialization
        int intValue = 5;
        double doubleValue = 10;
        boolean booleanValue = true;
        String stringValue = "cat";
        // Printing values
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("boolean value: " + booleanValue);
        System.out.println("String value: " + stringValue);
        // Task 2: Control Structures
        checkNumber(5);
        checkNumber(-3);
        checkNumber(0);
        // Task 3: Loops
        printNumbers(5);
        printNumbers(10);
        // Task 4: Methods
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println("Average of array1: " + calculateAverage(array1));
        System.out.println("Average of array2: " + calculateAverage(array2));
        // Task 5: Prime Number Check
        isPrime(11); // Example usage
    }
    // Method for Task 2
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    // Method for Task 3
    public static void printNumbers(int n) {
        System.out.println("Printing numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // for new line
    }
    // Method for Task 4
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    // Method for Task 5: Prime Number Check
    public static void isPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // If a divisor is found, the number is not prime
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
}
