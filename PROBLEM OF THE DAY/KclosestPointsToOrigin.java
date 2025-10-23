class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
          int n = points.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(points, java.util.Comparator.comparingInt(o -> o[0]*o[0] + o[1]*o[1]));
        int idx = 0;
        
        while(k --> 0){
            ArrayList<Integer> list = new ArrayList<>();
            
            list.add(points[idx][0]);
            list.add(points[idx++][1]);
            
            ans.add(list);
        }
        
        return ans;
    }
}