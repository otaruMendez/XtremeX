public class Leetcode_question_185{
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int[] shift = Arrays.copyOfRange(nums, length - k, length);
        if (k > 0) {
            for (int i = length - k-1, n = length-1, counter = 0; i >= 0; i--, counter++) {
                nums[n-counter] = nums[i];
            }
            length = shift.length;
            for(int j = 0; j< length; j++){
                nums[j] = shift[j];
            }
        }
    }
    
    }
