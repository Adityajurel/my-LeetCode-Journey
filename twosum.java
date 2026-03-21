import java.util.Scanner;
class Solution {
    public static  int[] twoSum(int[] arr, int target) {
    
    
        int [] ans= new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                ans[0] =i;
                ans [1] = j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements=");
        int[] arr = new int[4];
        for (int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        twoSum(arr,9);
    
    }

}
