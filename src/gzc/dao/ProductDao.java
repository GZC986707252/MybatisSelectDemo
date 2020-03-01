package gzc.dao;

import gzc.po.Product;

import java.util.List;

public interface ProductDao {
    List<Product> selectProductById(Integer id);
}
