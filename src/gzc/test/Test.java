package gzc.test;

import gzc.controller.UserController;
import gzc.dao.OrdersDao;
import gzc.pojo.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController)appCon.getBean("userController");
        userController.test();
//        userController.test1();
    }
}
