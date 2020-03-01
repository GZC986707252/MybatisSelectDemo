package gzc.test;

import gzc.controller.MoreToMoreController;
import gzc.controller.UserController;
import gzc.dao.OrdersDao;
import gzc.po.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*UserController userController = (UserController)appCon.getBean("userController");
        userController.test();*/
        MoreToMoreController moreToMoreController =(MoreToMoreController)appCon.getBean("moreToMoreController");
        moreToMoreController.test();
    }
}
