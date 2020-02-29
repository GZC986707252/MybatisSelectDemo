package gzc.dao;

import gzc.pojo.User;
import gzc.pojo.UserDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    User selectUserById_1(Integer id);

    User selectUserById_2(Integer id);

    UserDetail selectUserById_3(Integer id);
}
