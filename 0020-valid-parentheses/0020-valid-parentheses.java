class Solution {
    public boolean isValid(String s) {
        int i =0;
        int n = s.length();
        Stack <Character> st = new Stack<>();
        if(n%2==1) return false;
        for(i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')st.push(ch);
            else if(st.size()==0&& (ch=='}'||ch==']'||ch==')'))return false;
            else{
                if(ch==')' &&st.peek()=='(')st.pop();
                else if(ch=='}' &&st.peek()=='{')st.pop();
                else if(ch==']' &&st.peek()=='[')st.pop();
                            else return false;

            }
        }
        if(st.size()==0) return true;
        else return false;
    }
}