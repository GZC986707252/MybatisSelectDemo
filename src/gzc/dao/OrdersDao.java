package gzc.dao;

import gzc.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrdersDao {
    List<Orders> selectOrdersByUserId(Integer uid);
}