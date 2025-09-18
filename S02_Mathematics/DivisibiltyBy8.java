class Solution {
    int DivisibleByEight(String s) {
        // code here
        if(s.length()<3)
        {
           int h=Integer.parseInt(s);
           if(h%8==0)
           {
               return 1;


           } 
        }
        else{
        int sum=0;
        int digit=0;
        for(int i=s.length()-3;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int h=Integer.parseInt(String.valueOf(ch));
             digit=digit*10+h;
            

        }
        if(digit%8==0)
        {
            return 1;
        }
        }
        return -1;
    }
}
