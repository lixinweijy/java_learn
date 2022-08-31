package d1_file;

import java.io.File;

/**
 * 目标：学会创建File对象定位操作系统的文件（文件、文件夹）
 */
public class FileDemo {
    public static void main(String[] args) {
        //1.常见的File对象
//        File f=new File("C:\\Users\\20302\\Pictures\\paly\\z.jpg");
//        File f=new File("C:/Users/20302/Pictures/paly/z.jpg");
        File f=new File("C:"+File.separator+"Users"+File.separator+"20302"+File.separator+"Pictures"+File.separator+"paly"+File.separator+"z.jpg");
        long size=f.length();//返回文件字节个数，但是返回文件夹字节数不准确
        //可以删除、获取文件信息，不能读取内容
        //不存在则创建
        //相对路径以这个工程为标准
    }

}
