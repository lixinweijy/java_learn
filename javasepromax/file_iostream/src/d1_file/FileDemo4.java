package d1_file;

import java.io.File;

/**
 * 目标：File针对目录得到遍历
 * - public String[] list();
 *      获取当前目录下所有的“一级文件名称”到一个字符串数组中去返回
 * - public File[] listFiles()(常用)
 *      获取当前目录下所有的“一级文件对象”到一个文件对象数组中去返回（重点）
 */
public class FileDemo4 {
    public static void main(String[] args) {
        //1.定位一个目录
        File f=new File("C:\\Users\\20302\\Pictures\\paly");
        String[] names=f.list();
        for (String name:names){
            System.out.println(name);
        }

        //2.一级文件对象
        File[] files=f.listFiles();
        for(File ff:files){
            System.out.println(f.getAbsoluteFile());
        }

        //注意事项
        /*
        当调用者不存在时，返回null
        当调用者是一个文件时，返回null
        是空文件夹时，返回长度为0的数组
        有内容文件夹时，将所有文件和文件夹路径放在File数组中返回
        有隐藏文件夹时，将包含隐藏内容的所有文件夹和文件放在File数组中
         */
    }
}
