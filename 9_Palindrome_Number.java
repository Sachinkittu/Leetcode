class Solution {
    public boolean isPalindrome(int x) {
       int i = x;
        int sum = 0;
        if(i<0)
            return false;
        while(x!=0)
        {
            int j = x % 10;
            x = x / 10;
            sum = (sum*10) + j;
        }
        if(i == sum)
            return true;
        return false;
    }
}
