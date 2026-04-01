    class ADS1 {

    public static void main(String[] args) {

        System.out.println("Task 1: " + sumSquares(4));

        int[] arr = {1, 2, 3, 4};
        System.out.println("Task 2: " + sumArray(arr, arr.length));

        System.out.println("Task 3: " + sumPowers(2, 3));

        System.out.print("Task 4: ");
        reverseArray(arr, arr.length - 1);
    }
    // O(n)
    //function calls itself n times
    public static int sumSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumSquares(n - 1);
    }

    // O(n)
    //each element is processed once
    public static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    // O(n)
    //one recursive call for each power
    public static int sumPowers(int b, int n) {
        if (n == 0) return 1;
        return (int)Math.pow(b, n) + sumPowers(b, n - 1);
    }

    // O(n)
     //each element is printed once
    public static void reverseArray(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reverseArray(arr, index - 1);
    }
}
