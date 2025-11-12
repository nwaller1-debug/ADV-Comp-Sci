public class ArrayOpsTester {
    public static void main(String[] args) {
        
        String[] stringArr1 = { "apple", "banana", "kiwi", "orange" };
        ArrayOps.printStringArray(stringArr1); // Output: [apple, banana, kiwi, orange]

        String[] stringArr2 = { "cat", "dog", "elephant", "lion" };
        ArrayOps.printStringArray(stringArr2); // Output: [cat, dog, elephant, lion]

        String[] stringArr3 = { "red", "green", "blue", "yellow" };
        ArrayOps.printStringArray(stringArr3); // Output: [red, green, blue, yellow]

        // Testing if two arrays are equal
        String arrayString1 = ArrayOps.printStringArray(stringArr1);
        String arrayString2 = ArrayOps.printStringArray(stringArr2);
        System.out.println("Are the arrays the same? " + arrayString1.equals(arrayString2));

        int[] intArr1 = { 1, 2, 3, 4, 5 };
        ArrayOps.printIntegerArray(intArr1); // Output: [1, 2, 3, 4, 5]

        int[] intArr2 = { 10, 20, 30, 40, 50 };
        ArrayOps.printIntegerArray(intArr2); // Output: [10, 20, 30, 40, 50]

        int[] intArr3 = { -1, -2, -3, -4, -5 };
        ArrayOps.printIntegerArray(intArr3); // Output: [-1, -2, -3, -4, -5]
    }
}