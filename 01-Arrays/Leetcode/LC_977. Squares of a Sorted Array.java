class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int position = nums.length - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {

                ans[position] = leftSquare;
                left++;

            } else {

                ans[position] = rightSquare;
                right--;
            }

            position--;
        }

        return ans;
    }
}
