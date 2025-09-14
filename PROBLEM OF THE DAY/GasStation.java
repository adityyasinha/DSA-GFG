/*There are n gas stations along a circular tour. You are given two integer arrays gas[] and cost[], where gas[i] is the amount of gas available at station i and cost[i] is the gas needed to travel from station i to station (i+1). You have a car with an unlimited gas tank and start with an empty tank at some station. Your task is to return the index of the starting station if it is possible to travel once around the circular route in a clockwise direction without running out of gas at any station; otherwise, return -1.

Note: If a solution exists, it is guaranteed to be unique.
*/

class Solution {
    public int startStation(int[] gas, int[] cost) {
        // code here
          int totalg = 0;
        int totalc = 0;
        for(int i=0;i<gas.length;i++) {
            totalg += gas[i];
            totalc += cost[i];
        }
        if(totalg<totalc){
            return -1;
        }
        int cg = 0;
        int ans = 0;
        for(int i=0;i<gas.length;i++) {
            cg += gas[i]-cost[i];
            if(cg<0) {
                cg = 0;
                ans = i+1;
            }
        }
        return ans;
    }
}