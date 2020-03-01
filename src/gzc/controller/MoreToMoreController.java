package gzc.controller;

import gzc.dao.OrdersDao;
import gzc.po.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MoreToMoreController {
    @Autowired
    private OrdersDao ordersDao;

    public void test() {
        List<Orders> ordersList = ordersDao.selectAllOrdersAndProduct();
        for (Orders order : ordersList) {
            System.out.println(order);
        }
    }

}
