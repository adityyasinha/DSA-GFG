class Solution {
    
    
    public ArrayList<String> findExpr(String s, int target) {
        // code here
         ArrayList<String> result = new ArrayList<>();
        backtrack(s, target, 0, 0, 0, "", result);
        return result;
    }
    
    private void backtrack(String s, int target, int index, long currentVal, 
                          long prevOperand, String expression, ArrayList<String> result) {
     
        if (index == s.length()) {
            if (currentVal == target) {
                result.add(expression);
            }
            return;
        }
        
       
        for (int i = index; i < s.length(); i++) {
            
            if (i > index && s.charAt(index) == '0') {
                break;
            }
            
           
            long currentNum = Long.parseLong(s.substring(index, i + 1));
            
            
            if (index == 0) {
                backtrack(s, target, i + 1, currentNum, currentNum, 
                         expression + currentNum, result);
            } else {
                
                backtrack(s, target, i + 1, currentVal + currentNum, currentNum, 
                         expression + "+" + currentNum, result);
                
               
                backtrack(s, target, i + 1, currentVal - currentNum, -currentNum, 
                         expression + "-" + currentNum, result);
                
               
                long newVal = currentVal - prevOperand + (prevOperand * currentNum);
                backtrack(s, target, i + 1, newVal, prevOperand * currentNum, 
                         expression + "*" + currentNum, result);
            }
    }
}
}
