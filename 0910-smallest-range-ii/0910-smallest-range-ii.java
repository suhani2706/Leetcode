class Solution {
    public int smallestRangeII(int[] n, int k) {
        Arrays.sort(n);
        int  l = n.length;
        int min_diff = n[l-1] - n[0];
        
        if(l == 1)
            return 0;
        
        for(int i=0;i<l-1;i++)
        {
            int a = Math.min(n[0]+k , n[i+1]-k);
            int b = Math.max(n[l-1]-k , n[i]+k);
            min_diff = Math.min(min_diff,b-a);
        }
        return min_diff;
    }
}