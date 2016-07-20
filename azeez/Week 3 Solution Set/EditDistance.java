/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremehackerprep;

/**
 *
 * @author azeez
 * @linkToProb https://leetcode.com/problems/edit-distance/
 */
public class EditDistance {
 
    public static void main(String[] args) {
        EditDistance ed = new EditDistance();
        System.out.println(ed.minDistance("aaaaaa", "a"));
    }
    public int minDistance(String word1, String word2) {
       return dynamicEditDistance(word1.toCharArray(), word2.toCharArray());
    }
    
     public int dynamicEditDistance(char[] str1, char[] str2){
        int temp[][] = new int[str1.length+1][str2.length+1];
        
        for(int i=0; i < temp[0].length; i++){
            temp[0][i] = i;
        }
        
        for(int i=0; i < temp.length; i++){
            temp[i][0] = i;
        }
      
        for(int i=1;i <=str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    temp[i][j] = temp[i-1][j-1];
                }else{
                    temp[i][j] = 1 + min(temp[i-1][j-1], temp[i-1][j], temp[i][j-1]);
                }
            }
        }
      
        return temp[str1.length][str2.length];
        
    }
     private int min(int a,int b, int c){
        int l = Math.min(a, b);
        return Math.min(l, c);
    }
}