class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
       long ans = 0;
       Arrays.sort(maximumHeight);
       long currentHeight = Integer.MAX_VALUE;
        for(int i = maximumHeight.length-1; i >= 0; i--){
            currentHeight = Math.min(currentHeight, maximumHeight[i]);
            if(currentHeight <= 0){
                return -1;
            }
            ans += currentHeight;
            currentHeight--;
        }
        return ans;
    }
}