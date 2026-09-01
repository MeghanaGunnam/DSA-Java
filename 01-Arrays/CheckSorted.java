public class CheckSortedArray {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Compare current element with the previous one
            if (arr[i] < arr[i - 1]) {
                return false; // violation found → not sorted
            }
        }
        return true; // no violations → sorted
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 3, 4};

        System.out.println("Array 1 sorted? " + isSorted(arr1));
        System.out.println("Array 2 sorted? " + isSorted(arr2));
    }
}
