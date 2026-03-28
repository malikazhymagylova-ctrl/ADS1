    class ADS1 {

    public static void main(String[] args) {

        System.out.println("Task 1: " + sumSquares(4));

        int[] arr = {1, 2, 3, 4};
        System.out.println("Task 2: " + sumArray(arr, arr.length));

        System.out.println("Task 3: " + sumPowers(2, 3));

        System.out.print("Task 4: ");
        reverseArray(arr, arr.length - 1);
    }

    public static int sumSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumSquares(n - 1);
    }

    public static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static int sumPowers(int a, int n) {
        if (n == 1) return a;
        return (int)Math.pow(a, n) + sumPowers(a, n - 1);
    }

    public static void reverseArray(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reverseArray(arr, index - 1);
    }
}
