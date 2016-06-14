public class Solution {
    public static ArrayList<Integer> rotateArrayToList(int[] nums, int k) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int index = 0;
        for (int i : nums) {
            if (index < (nums.length - k)) {
                list1.add(i);
            } else {
                list2.add(i);
            }
            index++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list2);
        list.addAll(list1);
        return list;
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        ArrayList<Integer> list = rotateArrayToList(nums, k);
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
    }
}
