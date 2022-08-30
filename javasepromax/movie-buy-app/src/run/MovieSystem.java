package run;

import bean.Business;
import bean.Customer;
import bean.Movie;
import bean.User;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {
    /**
     * 定义系统的数据容器用户存储数据
     * 1.存储很多用户（客户对象，商家对象）
     */
    public static final List<User> ALL_USERS=new ArrayList<>();

    /**
     * 2.存储系统全部商家和其排片信息
     *      商家1=[p1,p2,p3,.....]
     *      商家2=[p1,p2,......]
     */
    public static Map<Business,List<Movie>> ALL_MOVIES=new HashMap<>();

    //定义一个静态的登录成功的用户
    public static User loginUser;
    public static SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    //打印log
    public static final Logger logger= LoggerFactory.getLogger("MovieSystem.class");

    /**
     * 3.准备一些测试数据
     */
    static{
        Customer c=new Customer();
        c.setLoginName("buguai");
        c.setMoney(100000);
        c.setPassWord("lxwhhh");
        c.setPhone("110");
        c.setSex('男');
        c.setUserName("李新伟");
        ALL_USERS.add(c);

        Customer c1=new Customer();
        c1.setLoginName("buguai1");
        c1.setMoney(300);
        c1.setPassWord("ythhh");
        c1.setPhone("120");
        c1.setSex('女');
        c1.setUserName("袁涛");
        ALL_USERS.add(c1);

        Business b1=new Business();
        b1.setLoginName("BOSS1");
        b1.setMoney(30000000);
        b1.setPassWord("zjhhh");
        b1.setPhone("119");
        b1.setSex('女');
        b1.setUserName("张娟");
        b1.setAddress("haven");
        b1.setShopName("天堂欢迎您");
        ALL_USERS.add(b1);
        //注意：商家一定需要加入到店铺排片信息中去
        List<Movie> movies1=new ArrayList<>();
//        movies1=null;
        ALL_MOVIES.put(b1,movies1);

        Business b2=new Business();
        b2.setLoginName("BOSS2");
        b2.setMoney(20000000);
        b2.setPassWord("lshhh");
        b2.setPhone("12138");
        b2.setSex('男');
        b2.setUserName("李四");
        b2.setAddress("hell");
        b2.setShopName("地狱欢迎您");
        ALL_USERS.add(b2);
        List<Movie> movies2=new ArrayList<>();
        ALL_MOVIES.put(b2,movies2);
    }

    public static final Scanner SYS_SC=new Scanner(System.in);

    public static void main(String[] args) {
        showMain();
    }

    private static void showMain() {
        System.out.println("=====================阿伟电影首页==============");

        while (true) {
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.println("请输入操作命令：");
            switch(SYS_SC.nextLine()){
                case "1":
                    //登录了
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("该命令不存在!");
                    break;
            }
        }
    }

    private static void login() {
        System.out.println("请输入登录名:");
        String loginName=SYS_SC.nextLine();
        System.out.println("请输入登录密码:");
        String loginWord=SYS_SC.nextLine();

        //1.根据登录名查询用户对象
        User u=getUserByLoginName(loginName);
        if (u!=null){
            if(u.getPassWord().equals(loginWord)){
                //登录成功
                loginUser=u;//记住登录成功的用户
                //判断类型为普通用户还是商家用户
                if(u instanceof Customer){
                    //普通用户
                    showCustomerMain();
                }else {
                    //商家用户
                    showBusinessMain();
                }
            }else{
                System.out.println("密码有误，请重新输入");
            }
        }else {
            System.out.println("用户名错误，请重新输入");
        }
    }

    private static void showCustomerMain() {
        System.out.println("=============阿伟电影客户界面===============");
        System.out.println("欢迎尊敬的 " + loginUser.getLoginName() +(loginUser.getSex()=='男'?"先生":"女士")+ " 进入");
        while (true){
            System.out.println("请选择要操作的功能:");
            System.out.println("1、展示全部影片信息功能");
            System.out.println("2、根据电影名称查询电影信息");
            System.out.println("3、评分功能");
            System.out.println("4、购票功能");
            System.out.println("5、退出功能");
            switch (SYS_SC.nextLine()){
                case "1":
                    //展示全部影片信息
                    showAllMovies();
                    break;
                case "2":
                    //根据电影名称查询电影信息
                    break;
                case "3":
                    //评分功能
                    break;
                case "4":
                    //购票功能
                    buyMovies();
                    break;
                case "5":
                    //退出功能
                    System.out.println("退出该用户");
                    return;
                default:
                    System.out.println("该命令不存在！");
                    break;
            }
        }
    }

    private static void buyMovies() {
        showAllMovies();
        System.out.println("==================用户购票功能==============");
        while (true) {
            System.out.println("请输入您需要买票的门店：");
            String shopName=SYS_SC.nextLine();
            //1.查询是否存在该商家
            Business business=getBusinessByShopName(shopName);
            if (business==null){
                System.out.println("对不起，没有该商家~");
            }else {
                //2.此商家全部排片
                List<Movie> movies=ALL_MOVIES.get(business);
                if (movies.size()>0){
                    while (true) {
                        //选购
                        System.out.println("请您输入需要购买的电影名称");
                        String movieName=SYS_SC.nextLine();
                        //去当前商家下，查询该电影名称
                        Movie movie=getMovieByShopAndName(business,movieName);
                        if(movie!=null){
                            //开始购买
                            System.out.println("请输入您要购买的电影片数:");
                            String number=SYS_SC.nextLine();
                            Integer number1=Integer.valueOf(number);
                            if (number1>movie.getNumber()){
                                System.out.println("对不起，余票数不足");
                                System.out.println("您当前最多只能购买" + movie.getNumber() + "张");
                                System.out.println("是否继续购票:y/n");
                                String command=SYS_SC.nextLine();
                                switch (command){
                                    case "y":
                                        break;
                                    default:
                                        System.out.println("好的！");
                                        return;
                                }
                            }else{
                                //票数足够
                                double money= BigDecimal.valueOf(movie.getPrice()).multiply(BigDecimal.valueOf(number1)).doubleValue();
                                if (loginUser.getMoney()>=money){
                                    //终于可以买票了
                                    System.out.println("您成功购买了" + movie.getName() + number1 + "张票!总金额是：" + money + "元");
                                    movie.setNumber(movie.getNumber()-number1);
                                    loginUser.setMoney(loginUser.getMoney()-money);
                                    business.setMoney(business.getMoney()+money);
                                    return;
                                }else{
                                    //钱不够
                                    System.out.println("很抱歉，您的钱包不够~~");
                                    System.out.println("是否继续买票?y/n");
                                    String command=SYS_SC.nextLine();
                                    switch(command){
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("好的~");
                                            return;
                                    }
                                }

                            }
                        }else{
                            System.out.println("对不起，您的电影名称有问题");
                        }
                    }
                }else{
                    System.out.println("该电影院关门了~~");
                    System.out.println("是否继续买票？y/n");
                    switch (SYS_SC.nextLine()){
                        case "y":
                            break;
                        default:
                            System.out.println("ok");
                            return;
                    }
                }
            }
        }
    }

    private static Movie getMovieByShopAndName(Business business,String movieName) {
        List<Movie> movies=ALL_MOVIES.get(business);
        for (Movie m : movies) {
            if(m.getName().equals(movieName)){
                return m;
            }
        }
        return null;
    }

    /**
     * 根据商家名称查询商家对象
     */
    public static Business getBusinessByShopName(String shopName){
        Set<Business> businesses=ALL_MOVIES.keySet();
        for (Business business: businesses) {
            if (business.getShopName().contains(shopName)){
                return business;
            }

        }
        return null;
    }

    //展示所有信息
    private static void showAllMovies() {
        ALL_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone() + "\t\t地址：" + business.getAddress());

            System.out.println("片名\t\t\t主演\t\t时长\t\t票价\t\t余票数\t\t放映时间");

            for (Movie movie :movies) {
                System.out.println("\t\t\t"+movie.getName() + "\t\t\t" +
                        movie.getActor() + "\t\t" +
                        movie.getTime() + "\t\t" + movie.getPrice() +
                        "\t\t" + movie.getNumber() + "\t\t" +
                        sdf.format(movie.getStartTime()));
            }
        });
    }

    private static void showBusinessMain() {
        System.out.println("============阿伟电影商家界面=============");
        System.out.println("欢迎尊敬的商家 " + loginUser.getLoginName() +(loginUser.getSex()=='男'?"先生":"女士")+ " 进入界面");
        while (true) {
            System.out.println("请选择您要进行的操作:");
            System.out.println("1、展示详情");
            System.out.println("2、上架电影");
            System.out.println("3、下架电影");
            System.out.println("4、修改电影");
            System.out.println("5、退出");
            switch (SYS_SC.nextLine()){
                case "1":
                    //展示全部影片信息
                    showBusinessInfos();
                    break;
                case "2":
                    //上架电影信息
                    addMovie();
                    break;
                case "3":
                    //下架电影信息
                    dedleteMovie();
                    break;
                case "4":
                    //修改电影信息
                    modifyMovie();
                    break;
                case "5":
                    //退出
                    System.out.println("欢迎下次光临");
                    return;
                default:
                    System.out.println("您输入的指令有误！");
            }
        }

    }

    private static void modifyMovie() {
        System.out.println("====================修改电影================");
        Business business=(Business) loginUser;
        List<Movie> movies=ALL_MOVIES.get(business);
        if(movies.size()==0){
            System.out.println("当前无影片可以修改~~");
            return;
        }
        //2、选择修改的电影名称
        while (true) {
            System.out.println("请输入您要修改的影片名:");
            String name=SYS_SC.nextLine();

            //3.查询有没有这个影片对象
            Movie movie=getMovieByName(name);
            if(movie==null){
                System.out.println("当前影片不存在");
                System.out.println("请问继续吗？y/n");
                String command=SYS_SC.nextLine();
                switch (command){
                    case "y":
                        break;
                    default:
                        System.out.println("好的！");
                        return;
                }
            }else {
                System.out.println("请输入修改后的片名：");
                String name1=SYS_SC.nextLine();
                System.out.println("请输入修改后的主演：");
                String actor=SYS_SC.nextLine();
                System.out.println("请输入修改后的时长：");
                String time=SYS_SC.nextLine();
                System.out.println("请输入修改后的票价：");
                String price=SYS_SC.nextLine();
                System.out.println("请输入修改后的余票数：");
                String totalNumber=SYS_SC.nextLine();
                System.out.println("请输入修改后影片开始放映时间：");
                String stime=SYS_SC.nextLine();
                try {
                    movie.setName(name1);
                    movie.setActor(actor);
                    movie.setTime(Double.valueOf(time));
                    movie.setPrice(Double.valueOf(price));
                    movie.setNumber(Integer.valueOf(totalNumber));
                    movie.setStartTime(sdf.parse(stime));
                    System.out.println("您已经成功修改了《" + name1+"》");
                    showBusinessInfos();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.error("添加电影解析出现问题~~");
                    System.out.println("需要重新输入吗？y/n");
                    if(SYS_SC.nextLine()!="y"){
                        return;
                    }
                }
            }
        }
    }

    /**
     * 影片下架功能
     */
    private static void dedleteMovie() {
        System.out.println("=============删除电影============");
        Business business=(Business) loginUser;
        List<Movie> movies=ALL_MOVIES.get(business);
        if(movies.size()==0){
            System.out.println("当前无影片可以下架~~");
            return;
        }
        //2、选择下架的电影名称
        while (true) {
            System.out.println("请输入您要下架的影片名:");
            String name=SYS_SC.nextLine();

            //3.查询有没有这个影片对象
            Movie movie=getMovieByName(name);
            if(movie==null){
                System.out.println("当前影片不存在");
                System.out.println("请问继续吗？y/n");
                String command=SYS_SC.nextLine();
                switch (command){
                    case "y":
                        break;
                    default:
                        System.out.println("好的！");
                        return;
                }
            }else {
                movies.remove(movie);
                showBusinessInfos();
                System.out.println("成功下架《" + movie.getName()+"》");
                return;
            }
        }
    }

    public static Movie getMovieByName(String movieName){
        Business business=(Business) loginUser;
        List<Movie> movies=ALL_MOVIES.get(business);
        for (Movie movie: movies) {
            if(movie.getName().contains(movieName)){
                return movie;
            }
        }
        return null;
    }
    /**
     * 商家进行电影商家
     */
    private static void addMovie() {
        System.out.println("================添加电影==================");
        Business business=(Business) loginUser;
        List<Movie> movies=ALL_MOVIES.get(business);
        System.out.println("请输入新片名：");
        String name=SYS_SC.nextLine();
        System.out.println("请输入主演：");
        String actor=SYS_SC.nextLine();
        System.out.println("请输入时长：");
        String time=SYS_SC.nextLine();
        System.out.println("请输入票价：");
        String price=SYS_SC.nextLine();
        System.out.println("请输入余票数：");
        String totalNumber=SYS_SC.nextLine();
        System.out.println("请输入影片开始放映时间：");
        String stime=SYS_SC.nextLine();
        try {
            Movie movie=new Movie(name,actor,Double.valueOf(time), Double.valueOf(price),Integer.valueOf(totalNumber), sdf.parse(stime));
            movies.add(movie);
            showBusinessInfos();
            System.out.println("您已经成功上架了《" + name+"》");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("添加电影解析出现问题~~");
        }
    }

    private static void showBusinessInfos() {
        //根据商家对象，作为Map集合的键，提取对应的值就是全部排片
        System.out.println("==============商家详情界面============");
        Business business=(Business) loginUser;
        System.out.println(business.getShopName() + "\t\t联系电话：" + business.getPhone() + "\t\t地址：" + business.getAddress());
        List<Movie> movies=ALL_MOVIES.get(business);
        System.out.println("片名\t\t\t主演\t\t时长\t\t票价\t\t余票数\t\t放映时间");
        if (movies.size()>0) {
            for(Movie movie:movies){
                System.out.println(movie.getName() + "\t\t\t" +
                        movie.getActor() + "\t\t" +
                        movie.getTime() + "\t\t" + movie.getPrice() +
                        "\t\t" + movie.getNumber() + "\t\t" +
                        sdf.format(movie.getStartTime()));
            }
        } else {
            System.out.println("您的店铺当前无影片放映~~~");
        }
    }

    public static User getUserByLoginName(String loginName){
        for(User user:ALL_USERS){
            //判断这个用户的登陆名称是否为我们需要的
            if(user.getLoginName().equals(loginName)){
                return user;
            }
        }
        return null;
    }
}
