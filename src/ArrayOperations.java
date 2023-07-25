public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 7};
        int size = numbers.length;

        int sum = calculateSum(numbers);
        int average = calculateAverage(sum, size);
        int max = findMaxElement(numbers);

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
        System.out.println("The maximum element in the array is: " + max);
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static int calculateAverage(int sum, int size) {
        if (size == 0) {
            return 0;
        }
        return sum / size;
    }

    private static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}