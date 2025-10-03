class Solution {
     static Map<Integer, List<Character>>map;
     
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
       map = new HashMap<>();
        map.put(0, new ArrayList<>());
        map.put(1, new ArrayList<>());
        map.put(2, Arrays.asList('a', 'b', 'c'));
        map.put(3, Arrays.asList('d', 'e', 'f'));
        map.put(4, Arrays.asList('g', 'h', 'i'));
        map.put(5, Arrays.asList('j', 'k', 'l'));
        map.put(6, Arrays.asList('m', 'n', 'o'));
        map.put(7, Arrays.asList('p', 'q', 'r', 's'));
        map.put(8, Arrays.asList('t', 'u', 'v'));
        map.put(9, Arrays.asList('w', 'x', 'y', 'z'));
        
        int n = arr.length;
        ArrayList<String>list = new ArrayList<>();
        solve(list, new StringBuilder(), arr, 0);
        return list;
    }
    
    private void solve(ArrayList<String>list, StringBuilder str, int[] arr, int ind) {
        
        if(ind == arr.length) {
            list.add(new String(str.toString()));
            return;
        }
        
        int x = arr[ind];
        if(x<0 || x>9) return;
        if(x == 0 || x == 1) solve(list, str, arr, ind+1);
        
        List<Character>l = map.get(x);
        for(char ch : l) {
            str.append(ch);
            solve(list, str, arr, ind+1);
            str.deleteCharAt(str.length()-1); 
    }
}
}