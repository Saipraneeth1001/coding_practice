
/* Longest Palindromic Substring of the given string.
*/

import java.lang.Math;
class Solution {
    
    public String longestPalindrome(String s) {
        
        if(s.length()==0){
            return "";
        }
        int start = 0,end = 0;
        boolean [][]arr = new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                arr[i][j] = false;
            }
        }
        int max = 1;
        int n = s.length();
        for(int i=0;i<n;i++){
            arr[i][i] = true;
            
        }
        
        for(int i=0;i<n-1;i++){
            
            if(s.charAt(i)==s.charAt(i+1)){
                
                arr[i][i+1] = true;
                start = i;
                max = 2;
            }
            
        
        }
        
        for(int k=3;k<=n;k++){
            
            for(int i=0;i<n-k+1;i++){
                
                int j = i+k-1;
                
                if(s.charAt(i)==s.charAt(j) && arr[i+1][j-1]==true){
                    arr[i][j]=true;
                    
                     if(k > max){
                        start = i;
                        max = k;
            }
                }
            }
           
        }
        return s.substring(start, start+max);
      }
        
}
