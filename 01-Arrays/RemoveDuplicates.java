public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0; // index for unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {   // found a new unique element
                j++;
                arr[j] = arr[i];      // move it forward
            }
        }
        return j + 1; // length of unique array
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(arr);

        System.out.print("Unique Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
