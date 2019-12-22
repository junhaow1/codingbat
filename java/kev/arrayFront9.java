public boolean arrayFront9(int[] nums) {
    // return true;
    int count =0;
    if (nums.length < 4) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                return true;
            } else {
                count++;
            }
        }


    } else if(nums.length >= 4) {
        for (int j = 0; j < 4; j++) {
            if (nums[j] == 9) {
                return true;
            } else {
                count++;
            }
        }
    }
    return false;
}



// 15min so dumb . following is the sample solution


public boolean arrayFront9(int[] nums) {
  // First figure the end for the loop
  int end = nums.length;
  if (end > 4) end = 4;

  for (int i=0; i<end; i++) {
    if (nums[i] == 9) return true;
  }

  return false;
}
