class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        // for(int i =0;i<n/2;i++){
        //     char temp = s[0];
        //     s[0] = s[n-i-1];
        //     s[n-i-1] = temp;
        // }

        int right =n-1;
        int left = 0;
        while(left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;right--;
        }
    }
}