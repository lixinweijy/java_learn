package com.itheima.hello.ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tool {
    public static int menu_1(){
        System.out.println("=========欢迎进入ATM系统========");
        System.out.println("  1.登录账户       2.注册账户");
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    public static int menu_1(String a){
        System.out.println("=========亲爱的"+a+"您好，请选择你的操作==========");
        System.out.println("\t\t1.查询\t\t\t2.存款\n\t\t3.取款\t\t\t4.转账\n\t\t5.修改密码\t\t6.退出\n\t\t7.注销账户");
        System.out.println("=============================================");
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    //登录功能
    public static void login(ArrayList<Account> a){
        System.out.println("请输入您的账号");
        Scanner sc=new Scanner(System.in);
        String accout=sc.next();
        System.out.println("请输入您的密码");
        String password=sc.next();
        for (int i = 0; i < a.size(); i++) {
            Account s=a.get(i);
            String act=s.getAccount();
            if(accout.equals(act)){
                if(s.getPassword().equals(password)){
                    operate(a,s);
                    return;
                }
            }
        }
        System.out.println("对不起，账号或密码输入错误");
    }
    //注册功能
    public static void register(ArrayList<Account> a){
        Account ne_accout=new Account();
        System.out.println("===============欢迎进入开户页面=============");
        System.out.println("请输入账户名称");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        ne_accout.setName(name);
        while(true){
            System.out.println("请输入您的密码");
            String password=sc.next();
            System.out.println("请再次确认您的密码");
            String re_password=sc.next();
            if (password.equals(re_password)){
                ne_accout.setPassword(password);
                break;
            }else{
                System.out.println("两次密码不相同，请重新输入");
            }
        }
        while (true) {
            System.out.println("请您输入限额");
            double max_money=sc.nextDouble();
            if (max_money<0){
                System.out.println("请输入大于0的数");
            }else{
                System.out.println("设置成功");
                ne_accout.setMax_change(max_money);
                break;
            }
        }
        //获得卡号
        String card=Getrandomid(a);
        ne_accout.setAccount(card);
        System.out.println("开户已完成，您的卡号是:"+card);
        a.add(ne_accout);
    }
    //生成随机的8位卡号，与已有的卡号不重复
    public static String Getrandomid(ArrayList<Account> a){
        Random r=new Random();
        while (true) {
            String string="";
            for (int i = 0; i < 8; i++) {
                string += r.nextInt(10);
            }
            Account acc=GetAccoutById(string,a);
            if(acc==null){
                return string;
            }
        }
    }
    //检查卡号是否已经存在
    private static Account GetAccoutById(String card,ArrayList<Account> a){
        for (int i = 0; i < a.size(); i++) {
            Account ac=a.get(i);
            if(ac.getAccount().equals(card)){
                return ac;
            }
        }
        return null;
    }

    public static void operate(ArrayList<Account> a,Account account){
        OUT:
        while (true) {
            int chioce=menu_1(account.getName());
            switch (chioce){
                case 1:
                    search(account);
                    break;
                case 2:
                    money_in(account);
                    break;
                case 3:
                    money_out(account);
                    break;
                case 4:
                    transform(a,account);
                    break;
                case 5:
                    modify_pwd(account);
                    break;
                case 6:
                    break OUT;
                case 7:
                    delete_accout(a,account);
                    break;
            }
        }
    }
    public static void search(Account account){
        System.out.println("=================您当前账户详细信息如下=================");
        System.out.println("卡号:\t"+account.getAccount());
        System.out.println("户主:\t"+account.getName());
        System.out.println("余额:\t"+account.getBalance());
        System.out.println("单次限取额度:\t"+account.getMax_change());
    }
    public static void money_in(Account account){
        System.out.println("=================欢迎进入存款操作=================");
        System.out.println("请您输入存款金额");
        Scanner sc=new Scanner(System.in);
        while (true) {
            double mn=sc.nextDouble();
            if(mn> account.getMax_change()){
                System.out.println("对不起，您输入的金额大于单次交易最大限额，请重新输入");
                System.out.println("最大限额为:"+account.getMax_change());
            }else{
                account.setBalance(account.getBalance()+mn);
                System.out.println("存款成功");
                break;
            }
        }
    }
    public static void money_out(Account account){
        System.out.println("=================欢迎进入取款操作=================");
        System.out.println("请您输入取金额");
        Scanner sc=new Scanner(System.in);
        while (true) {
            Double mn=sc.nextDouble();
            if(mn> account.getMax_change()){
                System.out.println("对不起，您输入的金额大于单次交易最大限额，请重新输入");
                System.out.println("最大限额为:"+account.getMax_change());
            } else if (mn>account.getBalance()) {
                System.out.println("对不起，您的余额不足，请重新输入");
            } else{
                account.setBalance(account.getBalance()-mn);
                System.out.println("取款成功");
                break;
            }
        }
    }
    public static void transform(ArrayList<Account> a,Account account){
        System.out.println("=================欢迎进入转账操作=================");
        System.out.println("请输入需要转账的账户");
        Scanner sc=new Scanner(System.in);
        OUT:
        while (true) {
            String ac=sc.next();
            for (int i = 0; i < a.size(); i++) {
                Account zh=a.get(i);
                if (zh.getAccount().equals(ac)){
                    System.out.println("请您输入取金额");
                    Scanner je=new Scanner(System.in);
                    Double mn=je.nextDouble();
                    while (true) {
                        if(mn> account.getMax_change() || mn>zh.getMax_change()){
                            System.out.println("对不起，您输入的金额大于单次交易最大限额，请重新输入");
                            System.out.println("最大限额为:"+account.getMax_change());
                        } else if (mn>account.getBalance()) {
                            System.out.println("对不起，您的余额不足，请重新输入");
                        } else{
                            account.setBalance(account.getBalance()-mn);
                            zh.setBalance(zh.getBalance()+mn);
                            System.out.println("转账成功");
                            break;
                        }

                    }break OUT;
                }
            }
            System.out.println("账户不存在，请重新输入");
        }

    }
    public static void modify_pwd(Account account){
        System.out.println("=================修改密码=================");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入您的密码");
            String password=sc.next();
            System.out.println("请再次确认您的密码");
            String re_password=sc.next();
            if (password.equals(re_password)){
                account.setPassword(password);
                System.out.println("设置成功");
                break;
            }else{
                System.out.println("两次密码不相同，请重新输入");
            }
        }
    }
    public static void delete_accout(ArrayList<Account> a,Account account){
        System.out.println("=================注销账户=================");
        System.out.println("是否确定要注销账号(Y/N)");
        Scanner sc=new Scanner(System.in);
        Byte choice=sc.nextByte();
        if(choice=='Y'){
            a.remove(account);
            System.out.println("注销成功");
        }else{
            System.out.println("取消注销");
        }
    }
}
