/*@linkToProblem: https://leetcode.com/problems/reverse-vowels-of-a-string/*/
public class Solution {
    public String reverseVowels(String s) {
        Stack stack = new Stack();
        LinkedList<Integer> qe=new LinkedList<Integer>();
        
        char[] sChars = s.toCharArray();
        
        int length = s.length();
        
        for(int i = 0; i < length; i++ ){
            
            if(isVowel(sChars[i])){
                stack.push(sChars[i]);
                qe.add(new Integer(i));
            }
        }
        
        length = qe.size();
         for(int i = 0; i < length; i++ ){
                sChars[qe.remove()] = (Character)stack.pop();
        }
        
        return new String(sChars);
        
    }
    
    boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
