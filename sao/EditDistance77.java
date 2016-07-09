/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One;

import java.util.Scanner;

/**
 *
 * @author saopayne
 */
public class EditDistance77 {
    
    public static int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
 
	int[][] dp = new int[len1 + 1][len2 + 1];

	for (int i = 0; i <= len1; i++) {
		dp[i][0] = i;
	}
	for (int j = 0; j <= len2; j++) {
		dp[0][j] = j;
	}
	//iterate though, and check last char
	for (int i = 0; i < len1; i++) {
            char c1 = word1.charAt(i);
            for (int j = 0; j < len2; j++) {
                char c2 = word2.charAt(j);

                //if last two chars equal
                if (c1 == c2) {
                    //update dp value for +1 length
                    dp[i + 1][j + 1] = dp[i][j];
                } else {
                    int replace = dp[i][j] + 1;
                    int insert = dp[i][j + 1] + 1;
                    int delete = dp[i + 1][j] + 1;

                    int min = replace > insert ? insert : replace;
                    min = delete > min ? min : delete;
                    dp[i + 1][j + 1] = min;
                }
            }
	}
	return dp[len1][len2];
   
    }
    
    public static void main(String [] args){
      Scanner input = new Scanner(System.in);
      String word1 = input.nextLine();
      String word2 = input.nextLine();
      
        System.out.println(minDistance(word1, word2));
    }
    
    
    static class Util{
        
        private Util(){}
        
        public static int replaceCost(String word1, String word2, int index1, int index2){
            return (word1.charAt(index1) == word2.charAt(index2)) ? 0 : 1;
        }
        
        public static int min(int... numbers){
            int result = Integer.MAX_VALUE;
            for (int each : numbers){
                result = Math.min(each, result);
            }
            return result;
        }
        
    }
    
}
