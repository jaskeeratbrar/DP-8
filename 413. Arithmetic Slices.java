class Solution {
    public int numberOfArithmeticSlices(int[] nums) {

        int result = 0;
        int curr = 0;
        int n = nums.length;

        for(int i = n -2 ; i > 0; i--){

            if(nums[i+1] - nums[i] == nums[i] - nums[i-1]){
                curr += 1;
                result += curr;
            }
            else{
                curr = 0;
            }
        }
        
        return result;
    }
}


// T(C): O(n)
// S(C): O(1)
