/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremehackerprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author azeez
 */
public class NumArray_PB_303 {
    int[] sums;

    public NumArray_PB_303(int[] nums) {
        sums = new int[nums.length+1];
        for(int i=0; i<nums.length; ++i){
            sums[i+1] = sums[i] + nums[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 0 ,4, 6};
        NumArray_PB_303 x = new NumArray_PB_303(a);
        System.out.println(x.sumRange(0, 3));

    }

    public int sumRange(int i, int j) {
        return sums[j+1] - sums[i];
    }
}
