/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremehackerprep;

import java.util.HashMap;

/**
 *
 * @author azeez
 */
public class ContainsDuplicate_II_PB_219 {

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 1};
        System.out.println(new ContainsDuplicate_II_PB_219().containsNearbyDuplicate(a, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        boolean duplicateExist = false;
        if (nums.length <= 1) {
            return duplicateExist;
        } else {
            for (int i = 0; i < nums.length; ++i) {
                if (tracker.containsKey(nums[i])) {
                    System.out.println("prev: "+tracker.get(nums[i]));
                    int indexDiff = Math.abs(i - tracker.get(nums[i]));
                    if (indexDiff <= k) {
                        duplicateExist = true;
                        break;
                    }
                } 
                    tracker.put(nums[i], i);
            }
            System.out.println(tracker);
        }
        return duplicateExist;
    }

}
