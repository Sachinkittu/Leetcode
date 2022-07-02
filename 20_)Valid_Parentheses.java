import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            if(x=='(' ||  x=='[' || x=='{')
            {
                st.push(x);
                continue;
            }
            if(st.isEmpty())
                return false;
            char j;
            switch(x)
            {
                case ')':
                    j = st.pop();
                    if(j=='{' || j=='[')
                        return false;
                    break;
                case '}':
                    j = st.pop();
                    if(j=='(' || j=='[')
                        return false;
                    break;
                case ']':
                    j = st.pop();
                    if(j=='{' || j=='(')
                        return false;
                    break;
                    
            }

        }
                    return st.isEmpty();
    }
}
