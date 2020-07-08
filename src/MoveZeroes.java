import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        if(nums.length == 1 || nums == null || nums.length == 0){
            return ;
        }
        int left = 0;
        int right = 1;
        while (left < right){
            if (nums[left] == 0){
                if(right < nums.length && nums[right] != 0 ){

                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                    left++;

                }
                }else {
                left++;
            }
            right++;
        }

    }

    public static  void  main(String[] args){
        int[] moveNums = {0,1,0,2,3,};
            moveZeroes(moveNums);
            for (int i : moveNums){
                System.out.print(i);
                System.out.print(" ");
            }

    }
}
