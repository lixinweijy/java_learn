package d1_junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * 测试类
 */
public class TestUserService {
    /*
    测试方法
    注意点：
        1.必须是公开的，无参数，无返回值的方法
        2.测试方法必须使用@Test注解标记
     */
    @Test
    public void testLoginName(){
        Userservice userService=new Userservice();
        String rs=userService.loginName("admin1","123456");

        //进行预期结果的正确性测试：断言
        Assert.assertEquals("您的功能业务出现问题","登陆成功",rs);
    }
}

/**
 * @Before          修饰实例方法  任务执行之前执行一次
 * @After                       任务执行之后执行一次
 * @BeforeClass     修饰静态方法  任务执行之前执行一次
 * @AfterClass                  任务执行之后执行一次
 */
