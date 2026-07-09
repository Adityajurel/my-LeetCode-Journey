class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        List<Integer> l=new ArrayList<>();
        Stack <Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            boolean alive=true;
            while(st.size()!=0&&st.peek()>0&&asteroids[i]<0){
                
                    if(Math.abs(st.peek())==Math.abs(asteroids[i])){
                        st.pop();
                        alive=false;
                        break;
                    }
                  else  if(st.peek()>0&&asteroids[i]<0){
                        if(Math.abs(asteroids[i])>Math.abs(st.peek())){
                            st.pop();
                        }
                        else{
                            alive =false;
                            break;}
                    }
                
            }
             if(st.size()==0&&alive)st.push(asteroids[i]);
             else if(alive)  st.push(asteroids[i]);
             }
             while(st.size()!=0){
                l.add(st.pop());
             }
            Collections.reverse(l);
            int []arr= new int[l.size()];
            for(int i =0;i<l.size();i++){
                arr[i]=l.get(i);
            }
return arr;
        
    }
}