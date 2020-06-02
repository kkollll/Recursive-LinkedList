public class Sum {

    public static int sum1(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res + arr[i];
        }
        return res;
    }

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum1(arr));
        System.out.println(sum(arr));
    }
}
