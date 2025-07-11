class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
    Arrays.sort(nums);        
    List<List<Integer>> result = new ArrayList<>();
    
    //Using Two Pointers Approach, CONVERT PROBLEM into two sum problem
    // x + y + z = 0
    //x + y = -z
    //x + y = target   .......Here, target = -z
    
    for(int i=0; i<nums.length; i++){
        
        if(i==0 || (i>0 && nums[i] != nums[i-1])){
            
            int low=i+1, high=nums.length-1,target = 0-nums[i];                     //low is i+1 because we consider ith element as our target and high from last index
            
            while(low<high){
                int sum = nums[low] + nums[high];                                   //Do sum of both element, at low index and at high index
                if( sum == target){                                                 //if sum is equal to target
                    
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));        //add into our resultant array
                    
                    while(low<high && nums[low] == nums[low+1])                     //solution set must not contain duplicate triplets.So, for removing that duplicacy
                        low++;                                                      //we will increase low by 1 till previous and current index value is same
                    while(low<high && nums[high] == nums[high-1])                   //Doing same for high, decrease by 1
                        high--;
                    
                    low++;                                                          //at last to get new element (not duplicate) low++ and high--
                    high--;
                     
                 }
                else if(sum>target){                                                //As we know array is sorted now, So if sum is greater then decrease by 1 and vice versa for low
                    high--;
                }else
                    low++;                    
            }         
        }            
    }
    
    return result;       
}
}