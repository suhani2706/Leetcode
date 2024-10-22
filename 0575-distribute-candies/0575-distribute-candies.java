class Solution {
    public int distributeCandies(int[] candyType) {
        int numOfCandy = candyType.length;
        int maxCandiesToEat = numOfCandy / 2; 

        Arrays.sort(candyType);
        int uniqueCandies = 1;
        for(int i = 1; i < candyType.length; i++){
            if(candyType[i] != candyType[ i - 1]){
                uniqueCandies++;
            }
        }

        return Math.min(uniqueCandies, maxCandiesToEat);
    }
}