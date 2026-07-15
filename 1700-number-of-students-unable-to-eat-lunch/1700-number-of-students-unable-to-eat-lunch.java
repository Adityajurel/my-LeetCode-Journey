class Solution {
    public int countStudents(int[] st, int[] sw) {
        int n= st.length;
        Queue<Integer> q= new LinkedList<>();
        for(int i =0;i<n;i++){
            q.add(st[i]);
        }
            int i =0;
int lback=0;
        while(q.size()!=0&&lback!=q.size()){
            if(q.peek()==sw[i]){
                q.remove();
                i++;
                lback=0;
            }
            else{
                q.add(q.remove());
                lback++;
            }
        }
return q.size();
    }
}