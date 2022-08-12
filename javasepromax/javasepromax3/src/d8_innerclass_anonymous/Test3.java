package d8_innerclass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 目标：通过GUI编程 理解匿名内部类的真实使用场景
 */
public class Test3 {
    public static void main(String[] args){
        //1.创建窗口
        JFrame win=new JFrame("登录界面");
        JPanel panel=new JPanel();
        win.add(panel);

        //2.创建一个按钮对象
        JButton btn =new JButton("登录");

        //注意:讲解匿名内部类的使用
        btn.addActionListener(new ActionListener() {    //监听按钮
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"点我一下说明爱我");
            }
        });
        //上面简化
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win,"哈哈哈"));
        //3.把按钮对象添加到窗口上展示
        panel.add(btn);

        //4.展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
