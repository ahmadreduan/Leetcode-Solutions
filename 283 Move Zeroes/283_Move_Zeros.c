void moveZeroes(int* nums, int numsSize) {
    int insertPosition = 0;

    for (int i = 0; i < numsSize; i++) {
        if (nums[i] != 0) {
            nums[insertPosition] = nums[i];
            insertPosition++;
        }
    }
    while (insertPosition < numsSize) {
        nums[insertPosition++] = 0;
    }
}