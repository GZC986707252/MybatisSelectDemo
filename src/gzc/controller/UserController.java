package gzc.controller;

import gzc.dao.OrdersDao;
import gzc.dao.UserDao;
import gzc.pojo.Orders;
import gzc.pojo.User;
import gzc.pojo.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    public void test() {
        //查询一个用户信息
        User user1 = userDao.selectUserById_1(1);
        System.out.println(user1);
        System.out.println("------------------------------------");
       /* User user2 =userDao.selectUserById_2(1);
        System.out.println(user2);
        System.out.println("------------------------------------");
        UserDetail user3 =userDao.selectUserById_3(1);
        System.out.println(user3);*/
    }

}
