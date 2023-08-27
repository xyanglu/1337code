class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int max = 1;
        int prev = pairs[0][1];
        
        for (int i=1;i<pairs.length;i++) {
            if ( pairs[i][0] > prev ) {
                prev = pairs[i][1];
                max++;
            }
        }
        
        
        return max;
    }
}