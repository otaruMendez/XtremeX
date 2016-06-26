/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremehackerprep;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author azeez
 * @linkToProb https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowels_PB_345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reversedVowel = reverseVowels(sc.nextLine());
        System.out.println(reversedVowel);
    }
    public static String reverseVowels(String s) {
 
        List<String> extractedVowels = new ArrayList<>();
        Queue<Integer> indexQueue = new ArrayDeque<>();
        for(int i=0;i<s.length();++i){
            String indChar  = s.charAt(i)+"";
            switch(indChar){
                case "a":
                case "A":
                case "e":
                case "E":
                case "i":
                case "I":
                case "o":
                case "O":
                case "u":
                case "U":
                    extractedVowels.add(indChar);
                    indexQueue.add(i);
                    break;
            }
        }
        Collections.reverse(extractedVowels);
        StringBuilder resultBuilder = new StringBuilder(s);
        for(int k=0;k<extractedVowels.size();++k){
            int charIndex = indexQueue.poll();
            resultBuilder.setCharAt(charIndex, extractedVowels.get(k).charAt(0));
        }
        return resultBuilder.toString();
    }
}