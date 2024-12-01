class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int index=0;
        
        while(index<nums.length){
            int element=nums[index];
            int AP=element-1;

            if (element !=nums[AP])
            Swap(nums,index,AP);
            else
            index++;

        }
             List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) 
                result.add(i + 1);
            }

        return result;
    }
       
    
        

  

    public static void Swap(int[] nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;


    }
    
   

        
    
    
}
        
 