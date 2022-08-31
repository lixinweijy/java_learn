package d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * 目标：File类的获取功能的API
 * -public String getAbsolutePath();    返回此File的绝对路径名
 * -public String getPath()   获取创建文件对象的时候用的路径
 * -public String getName()     返回文件/文件夹的名称
 * -public long length()        返回长度,文件夹不准确
 */
public class FileDemo2 {
    public static void main(String[] args) {
        //创建一个文件对象
        File f=new File("C:\\Users\\20302\\Pictures\\paly\\z.jpg");
        //a.获取绝对路径
        System.out.println(f.getAbsoluteFile());
        //b.获取文件定义的时候使用的路径
        System.out.println(f.getPath());
        //c.获取文件名称，带后缀
        System.out.println(f.getName());
        //d.获取文件大小，字节个数
        System.out.println(f.length());
        //e.获取文件最后修改时间 时间毫秒值
        System.out.println(f.lastModified());
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(f.lastModified()));

        //f.判断是文件还是文件夹
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.exists());
    }
}
