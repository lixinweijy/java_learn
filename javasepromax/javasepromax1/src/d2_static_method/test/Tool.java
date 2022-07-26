package d2_static_method.test;

public class Tool {
    /**
     * 私有构造器
     */
    private Tool(){
    }
    /**
     * 工具方法：静态方法
     */

    public static String toString(int[] arr){
        //1.一些校验
        if(arr==null){
            return null;
        }
        //2.拼接内容并返回
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            result +=( i==arr.length-1 ?arr[i]+"]":arr[i]+",");
        }
        return result;
    }
}
