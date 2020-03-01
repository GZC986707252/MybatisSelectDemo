package gzc.dao;

import gzc.po.IdCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IdCardDao {
    IdCard selectCodeById(Integer id);
}
