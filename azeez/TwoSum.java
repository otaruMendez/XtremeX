/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremehackerprep;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author azeez
 * @linkToProblem https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
       HashMap<Integer, Integer> hashmap= new HashMap<>();
       for(int i=0;i<nums.length;++i){
           int complement = target - nums[i] ;
           if(hashmap.containsKey(complement) && hashmap.get(complement) != i){
               result[0] = hashmap.get(complement);
               result[1]= i;
           }else{
               hashmap.put(nums[i], i);
           }
       }
        return result;
    }
}

