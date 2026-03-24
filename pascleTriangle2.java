class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i =0;i<=rowIndex;i++){
            arr.add(new ArrayList<>());
            for(int j =0;j<=i;j++){
                if(j==0||j==i){
                    arr.get(i).add(1);
                }
                else{
                    int val = arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    arr.get(i).add(val);
                }
            }

        }
        return arr.get(rowIndex);
    }
}
