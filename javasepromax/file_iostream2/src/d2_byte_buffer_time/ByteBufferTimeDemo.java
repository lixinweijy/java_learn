package d2_byte_buffer_time;

import java.io.*;
//缓冲区有8kb大小
public class ByteBufferTimeDemo {
    private static final String SRC_FILE="file_iostream2/src/cover.jpg";
    private static final String DEST_FILE="file_iostream2/src/cover(1).jpg";
    public static void main(String[] args) throws Exception{
        copy01();  //使用低级的字节流按照一个一个字节的形式复制文件
        copy02();  //使用低级的字节流按照一个一个字节数组的形式复制文件
        copy03();  //缓冲流一个一个字节复制
        copy04();  //缓冲流一个一个字节数组复制

    }

    private static void copy04() {

        long startTime=System.currentTimeMillis();
        try(
                //1.创建低级的字节输入流与源文件接通
                InputStream is=new FileInputStream(SRC_FILE);
                //a.把原始的字节输入流包装成高级得到缓冲字节输入流
                InputStream bis=new BufferedInputStream(is);
                //2.创建低级得到字节输出流与目标文件接通
                OutputStream os=new FileOutputStream(DEST_FILE);
                //b.把字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos=new BufferedOutputStream(os);
        ){
            //3.定义一个字节
            int len;
            byte[] buffer=new byte[1024];
            while ((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用高级的字节流按照一个一个字节数组的形式复制文件耗时:" + (endTime - startTime));
    }

    private static void copy03() {
        long startTime=System.currentTimeMillis();
        try(
                //1.创建低级的字节输入流与源文件接通
                InputStream is=new FileInputStream(SRC_FILE);
                //a.把原始的字节输入流包装成高级得到缓冲字节输入流
                InputStream bis=new BufferedInputStream(is);
                //2.创建低级得到字节输出流与目标文件接通
                OutputStream os=new FileOutputStream(DEST_FILE);
                //b.把字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos=new BufferedOutputStream(os);
                ){
            //3.定义一个字节
            int b;
            while ((b=bis.read())!=-1){
                bos.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用高级的字节流按照一个一个字节的形式复制文件耗时:" + (endTime - startTime));
    }

    private static void copy02() {

        long startTime=System.currentTimeMillis();
        try(
                //1.创建低级的字节输入流与源文件接通
                InputStream is=new FileInputStream(SRC_FILE);
                //2.创建低级得到字节输出流与目标文件接通
                OutputStream os=new FileOutputStream(DEST_FILE);
        ){
            //3.定义一个字节数组转移数据
            int len;
            byte[] buffer=new byte[1024];
            while ((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节数组的形式复制文件耗时:" + (endTime - startTime));
    }

    private static void copy01() throws Exception{
        long startTime=System.currentTimeMillis();
        try(
                //1.创建低级的字节输入流与源文件接通
                InputStream is=new FileInputStream(SRC_FILE);
                //2.创建低级得到字节输出流与目标文件接通
                OutputStream os=new FileOutputStream(DEST_FILE);
                ){
            //3.定义一个变量记录每次读取的字节（一个一个字节复制）
            int b;
            while ((b=is.read())!=-1){
                os.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节的形式复制文件耗时:" + (endTime - startTime));
    }
}
