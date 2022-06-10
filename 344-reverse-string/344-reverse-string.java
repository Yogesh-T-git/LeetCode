import static java.lang.System.*;
import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        
        int last = s.length - 1;
        char t;
        for (int start = 0; start < s.length/2; start++) {
            t = s[last];
            s[last--] = s[start];
            s[start] = t;
        }
        
        out.print(Arrays.toString(s));
        
    }
}