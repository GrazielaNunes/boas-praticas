
public class Main {
    public static void main(String[] args) {

        //This is um array de inteiro
        int[] arr = {5, 3, 8, 2, 7};
        // N variable de tamanho
        int n = arr.length;
        int s_u_m = 0;
        for (int i = 0; i < n; i++) {
            s_u_m += arr[i];
        }
        System.out.println("The sum of the array is: " + s_u_m);
        int avg = s_u_m / n;
        System.out.println("The average of the array is: " + avg);
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}