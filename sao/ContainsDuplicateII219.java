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
public class ContainsDuplicateII219 {
    
   /*Given an array of integers and an integer k, 
     * find out whether there are two distinct indices i and j in the array such 
     * that nums[i] = nums[j] and the difference between i and j is at most k.
     * @param args 
     */

    public static void main(String [] args){
        
    }
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if(k<0) return false;
        Map <Integer, Integer> keyMap = new HashMap <> ();
        for (int i = 0; i < nums.length; i++) {
            if (!keyMap.containsKey (nums[i]) || i - keyMap.get (nums[i]) > k) {
            } else {
                return true;
            }
            keyMap.put (nums[i], i);
        }
        return false;
    }
    }
