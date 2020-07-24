public class MergeSortedArrays {
    public void merge(int[] nums1, int m , int[] nums2, int n){
        int[] nums3 = new int[m+n];
        int i =0 , j = 0, k = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                nums3[k] = nums1[i];
                i++;
                k++;
            }else{
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < m){
            nums3[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n){
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        for(int l = 0 ; l < nums3.length ; l++) {
            nums1[l] = nums3[l];
        }

    }

    public static void main(String[] args){

        }





}
