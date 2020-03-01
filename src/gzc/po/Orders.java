package gzc.po;

import java.util.List;

public class Orders {
    //对应数据表的字段
    private Integer id;
    private String ordersn;
    //多对多中的一对多
    private List<Product> productList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(String ordersn) {
        this.ordersn = ordersn;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", ordersn='" + ordersn + '\'' +
                ", productList=" + productList +
                '}';
    }
}
