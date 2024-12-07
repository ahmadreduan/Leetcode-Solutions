//import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0] , votes = 1;

        for(int i = 1 ; i < nums.length; i++){
            if(votes == 0){
                votes++;
                majority = nums[i];
            }else if (majority == nums[i]){
                votes++;
            }else{
                votes--;
            }
        }
        return majority;
    }

    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter array size ");
    //     int size = sc.nextInt();

    //     int [] nums = new int[size];


    //     for(int i = 0 ; i < nums.length ; i++){
    //         nums[i] = sc.nextInt();
    //     }

    //     Solution solution = new Solution();

    //     int majority = solution.majorityElement(nums);
    //     System.out.println("The majority element is : "+majority);
    // }
}