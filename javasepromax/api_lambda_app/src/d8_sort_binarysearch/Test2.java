package d8_sort_binarysearch;

import java.util.Arrays;

/**
 * 二分查找
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr1={1,2,5,7,9,0,3,2,23,4,5,53,6};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int num=search(arr1,8);
        System.out.println(num);

    }

    public static int search(int[] arr,int num){
        int left=0,right=arr.length-1,mid=0;
        while (left<=right){
            mid=(left+right)/2;
            if (arr[mid]>num){
                right=mid-1;
            } else if (arr[mid]<num) {
                left=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
