import java.util.*;
class Solution {
    public String convert(String s, int numRows) {
        
        
       int n = numRows;
        if(n==1)return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for(int i=0;i<n;i++){
            rows.add(new StringBuilder());
        }
        int currentRow = 0;
        boolean goingDown = false;
        
        for(char c: s.toCharArray()){
            
            rows.get(currentRow).append(c);
            if(currentRow == 0 || currentRow == n-1) goingDown = !goingDown;
            currentRow += goingDown?1:-1;
        }
        StringBuilder ret = new StringBuilder();
        rows.forEach(i->ret.append(i));
        return ret.toString();
    }
}
