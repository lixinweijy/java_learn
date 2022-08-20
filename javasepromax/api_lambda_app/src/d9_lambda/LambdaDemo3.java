package d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

/**
 * 省略写法：
 * 参数类型可以省略不写
 * 如果只有一个参数，参数类型可以省略，同时()也可以省略
 * 如果Lambda表达式的方法体代码只有一行代码，可以省略大括号不写，同时要省略分号！
 * 如果Lambda表达式的方法体代码只有一行代码，可以省略大括号不写。此时，如果这行代码是return语句，必须省略return不写，同时也必须省略";"不写
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] ages={23,42,12,46};
        Arrays.sort(ages,(Integer o1,Integer o2)->{ //简化一下
            return o2-o1;
        });

        System.out.println(Arrays.toString(ages));

        System.out.println("-------------------------");
        JFrame win=new JFrame("登录界面");

        JButton btn=new JButton("按钮");
        btn.addActionListener((ActionEvent e) ->{
                System.out.println("啊，我被点了");
            });

        //1.类型不写
//        btn.addActionListener((e) ->{
//            System.out.println("啊，我被点了");
//        });

        //2.()不写
//        btn.addActionListener(e ->{
//            System.out.println("啊，我被点了");
//        });

        //3.省略大括号和分号
//        btn.addActionListener(e ->System.out.println("啊，我被点了"));

        //4.return省略
//        Arrays.sort(ages,(o1,o2)-> o2-o1 );
        win.add(btn);
        win.setSize(400,300);
        win.setVisible(true);
    }
}
