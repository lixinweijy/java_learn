package d11_api_stringbuilder;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        int[] aa={1,2,3,4,5};
        String ra=toString(aa);
        System.out.println(ra);
    }
    /**
     * 1.定义方法接收任意整形数组，返回数组内容格式
     */

    public static String toString(int[] arr){
        //2.开始拼接内容
        if(arr!=null){
            StringBuilder sb=new StringBuilder("[");
            for(int i=0;i<arr.length;i++){
                sb.append(arr[i]).append(i==arr.length-1?"":" ,");
            }
            sb.append("]");
            String rs=sb.toString();
            return rs;
        }else{
            return null;
        }

    }

}

