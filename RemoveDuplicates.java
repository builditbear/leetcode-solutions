class RemoveDuplicates {
    // A better solution written by my friend. Saved for study and reference.
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int i = 1;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] == nums[j-1]) {
                continue;    
            } else {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    // My solution
    // public static int removeDuplicates(int[] nums) {
    //     // An empty array or an array with one element cannot have duplicates.
    //     if(nums.length == 0) {
    //         return 0;
    //     } else if(nums.length == 1) {
    //         return 1;
    //     } else {
    //         int subArraySize = nums.length;
    //         // The initial value is something that is guaranteed not
    //         // to be in the array by problem description, and is very unlikely in any case.
    //         int lastSeen = Integer.MIN_VALUE;
    //         for(int i = 0; i < nums.length; i++) {
    //             if(i >= subArraySize) {
    //                 return subArraySize;
    //             } else if(nums[i] != lastSeen) {
    //                 lastSeen = nums[i];
    //             } else {
    //                 int limit = nums.length - i;
    //                 int counter = 0;
    //                 while(nums[i] == lastSeen) {
    //                     // If we've reached the loop limit, all remaining values are dupes, so we're done.
    //                     if(counter == limit) {
    //                         return subArraySize;
    //                     }
    //                     // Shift all values left and assign the identified dupe to the rear.
    //                     int dupeValue = nums[i];
    //                     for(int j = i; j < nums.length - 1; j++) {
    //                         nums[j] = nums[j + 1];
    //                     }
    //                     nums[nums.length - 1] = dupeValue;
    //                     subArraySize--;
    //                     counter++;
    //                 }
    //                 lastSeen = nums[i];
    //             }
    //         }
    //         // Execution should reach here whenever an array is entirely unique integers.
    //         return subArraySize;     
    //     }
    // }
}