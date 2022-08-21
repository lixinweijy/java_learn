package d10_genericity_method;

/**
 * 泛型方法：
 *      定义了泛型的方法就是泛型方法
 *
 * 定义格式：
 *      修饰符<泛型变量>返回值类型 方法名称(形参列表){
 *
 *      }
 *      注意：方法定义了是什么泛型变量，后面就只能使用什么泛型变量
 * 需求：一个任何类型的数组，都能返回它的内容，Arrays,toString(数组)的功能
 *
 * 小结：
 *      泛型方法可以让方法更灵活的接收数据，可以做通用技术！
 */
public class GenericityDemo {
    public static void main(String[] args) {
        String[] names={"lxw","yt","zj"};
        Integer[] ages={10,20,30};

        printArray(names);

        printArray(ages);

        //另一个用法  不需要强转了
        Integer[] ages2=getArr(ages);
        String[] names2=getArr(names);
    }

    public static <T> T[] getArr(T[] arr){
        return arr;
    }

    public static <T> void printArray(T[] arr){
        if(arr!=null){
            StringBuilder sb=new StringBuilder("[");
            for(int i=0;i<arr.length;i++){
                sb.append(arr[i]).append((i==arr.length-1)?" ":", ");
            }
            sb.append("]");
            System.out.println(sb);
        }else{
            System.out.println(arr);
        }
    }
}
