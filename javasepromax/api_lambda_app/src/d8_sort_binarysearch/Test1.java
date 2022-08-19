package d8_sort_binarysearch;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr={6,2,4,7,1};

        //2.定义一个循环控制选择几轮，arr.length-1
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                }
            }
        }
        //打印数组
        System.out.println(Arrays.toString(arr));
    }
}
