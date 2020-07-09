import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;


        for (int idx = n - 1; idx >= 0 ; idx--){
            if(digits[idx] == 9){
                digits[idx] = 0;
            }else{
                digits[idx]++;
                return  digits;
            }



        }

        digits = new int[n + 1];
        digits[0] = 1;
        return  digits;

    }

    public  static void main(String[] args){
        int[] digits = {9,9,9,9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));

    }
}
