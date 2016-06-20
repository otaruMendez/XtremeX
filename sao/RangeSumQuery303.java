/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One;

/**
 *
 * @author saopayne
 */
public class RangeSumQuery303 {
    
    int [] nums;
    static int num [] = {-2, 0, 3, -5, 2, -1};
    
    public RangeSumQuery303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        int len = (j-i)+1;
        for (int k = i; k <= j; k++){
            sum += nums[k];
        }
        return sum;
    }
    
    public static void main (String [] args){
        RangeSumQuery303 numArray = new RangeSumQuery303(num);
        System.out.println(numArray.sumRange(0, 5));
    }
}
