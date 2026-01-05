import java.util.*;

class Solution {
    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int hMax =0, vMax = 0;
        hMax = Math.max(hMax,horizontalCuts[0]-0);
        vMax = Math.max(vMax,verticalCuts[0]-0);

        for(int i=1; i<horizontalCuts.length; i++) {
            hMax = Math.max(hMax,horizontalCuts[i]- horizontalCuts[i-1]);
        }

        if(horizontalCuts.length >= 1) {
            hMax = Math.max(hMax,h - horizontalCuts[horizontalCuts.length-1]);
        } 
// -----------------------------------------------------------------------------------------

        for(int i=1; i<verticalCuts.length; i++) {
            vMax = Math.max(vMax,verticalCuts[i]- verticalCuts[i-1]);
        }

        if(verticalCuts.length >= 1) {
            vMax = Math.max(vMax,w - verticalCuts[verticalCuts.length-1]);
        }
// -----------------------------------------------------------------------------------------

        System.out.println(vMax +" "+ hMax);
        int MOD = 1_000_000_007;

        return (int) ((long) vMax * hMax % MOD);
    }


    public static void main(String[] arr) {
        int[] arr1 = {1,2,4} ;
        int[] arr2 = {1,3};
        System.out.println(maxArea(5,4, arr1,arr2));
    }


    
}