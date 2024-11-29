public class sort012 {
    public static void sort01(int[] arr) {
        int i = 0, j = 0, k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sort01(arr);
        for (int a : arr)
            System.out.print(a + " ");

    }
}
