public class RemoveDuplicates {
    public static  int removeDuplicates(int[] nums) {

        if(nums.length == 0)
            return 0;

        int len = 0;

        for(int len1 = 1; len1 < nums.length ; len1++){

            if (nums[len] != nums[len1]){
                len++;
                nums[len] = nums[len1];



            }

        }
        return len + 1;

    }

    public  static void main(String[] args){

        int[] numbers = {1,1,2,2,3,3,4,4,4,5,5,6,6,7};
        int num = removeDuplicates(numbers);
        System.out.println(num);

    }
}

