/* Given an array of integers, which are plotted on a graph, we have to obtain the container area which can hold the most water. check leetcode if problem statement is not clear.*/
class Solution {
    public int maxArea(int[] height) {
     
        int i = 0;
        int j = height.length-1;
       int  min = Integer.MIN_VALUE;
        int max = 0;
        while(i < j){
            
            min = Math.min(height[i], height[j]);
            max = Math.max(max, (j-i)*min);
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
