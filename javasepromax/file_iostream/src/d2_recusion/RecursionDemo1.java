package d2_recusion;

import java.io.File;

/*
递归
到D盘搜索VisualStudioSetup.exe
 */
public class RecursionDemo1 {
    public static void main(String[] args) {
        File f=new File("D:/");
        searchFile(f,"VisualStudioSetup.exe");
    }
    /*
        搜索目录下的全部文件，找到我们想要的文件
         */
    private static void searchFile(File f,String name) {
        //判断dir是否是目录
        if(f!=null && f.isDirectory()){
            //开始找
            //提取当前目录下的以及文件对象
            File[] files=f.listFiles();
            //不为空才可以遍历
            if(files!=null && files.length>0){
                for(File file:files){
                    //判断是文件还是文件夹
                    if(file.isFile()){
                        //判断是不是要找的文件
                        if(file.getName().contains(name)){
                            System.out.println("找到了：" + file.getAbsoluteFile());
                            return;
                        }
                    }else{
                        searchFile(file,name);
                    }
                }
            }
        }
    }


}
