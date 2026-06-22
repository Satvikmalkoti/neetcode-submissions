class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i:piles){
            if(i>max) max=i;
        }
        int l = 1;
        int r = max;
        int k= max;
        while(l<=r){
            int mid = l+(r-l)/2;
            int sum = 0;
            for(int i:piles){
                sum+=(int)Math.ceil((double)i/mid);
            }
            if(sum>h){
                l = mid+1;
            }else{
                r = mid-1;
                k =mid;
            }
        }
        return k;
    }
}
