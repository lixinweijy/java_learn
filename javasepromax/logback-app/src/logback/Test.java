package logback;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

/**
 * 目标：快速搭建LogBack日志框架，记录程序的执行情况到控制台到文件中
 */
public class Test {
    //创建Logback的日志对象性，代表了日志技术
    public static final Logger LOGGER= LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        //1.在项目下新建文件夹lib,导入Logback的相关jar包到该文件夹下，并添加到项目依赖库中去

        //2.将Logback的核心配置文件logback.xml直接拷贝到src目录下(必须是src下)

        //3.在代码中获取日志对象
        //public static final Logger LOGGER=loggerFactory.getLogger("类对象");

        //---------------------------------

        try {
            LOGGER.debug("main方法开始执行了~~");
            LOGGER.info("除法");
            int a=10;
            int b=5;
            LOGGER.trace("a="+a);
            LOGGER.trace("b="+b);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
            LOGGER.error("功能出现异常："+e);
        }

/**
 * TRACE<DEBUG<INFO<WARN<ERROR
 * 可以通过设置日志打印级别选择打印信息
 */
    }
}
