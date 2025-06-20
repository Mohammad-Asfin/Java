public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        for (int n : arr) {
            sum += n;
        }

        double avg = (double) sum / arr.length;
        System.out.println("Average: " + avg);
    }
}
