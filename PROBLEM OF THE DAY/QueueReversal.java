class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st=new Stack<>();
        
        
        while(!q.isEmpty()){
            int a=q.poll();
            st.push(a);
        }
        while(st.size()>0){
            int b=st.peek();
            st.pop();
            q.add(b);
        }
    }
}
