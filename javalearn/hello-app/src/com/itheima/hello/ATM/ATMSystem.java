package com.itheima.hello.ATM;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
* 任务需求:
* 1.登录账户
* 2.注册账户
*
* 1：
* a.查询
* b.存款
* c.取款
* d.转账
* e.修改密码
* f.退出
* g.注销账户

* 2:
* a.输入账户
* b.输入密码
* c.确认密码
*

* */
public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<>();
        while(true){
            int choice=Tool.menu_1();
            switch(choice){
                case 1:
                    Tool.login(accounts);
                    break;
                case 2:
                    Tool.register(accounts);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }

}

