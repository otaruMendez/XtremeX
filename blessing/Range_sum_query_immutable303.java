public class NumArray {

private int[] sumArray;
private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        sumArray  = new int[nums.length];
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum += nums[i];
            sumArray[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        return (sumArray[j] - sumArray[i]) +this.nums[i];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
