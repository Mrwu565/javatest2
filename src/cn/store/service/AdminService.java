package cn.store.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import cn.store.domain.Category;
import cn.store.domain.Order;
import cn.store.domain.Product;


public interface AdminService {

	public List<Category> findAllCategory();

	public void saveProduct(Product product) throws SQLException;

	public List<Order> findAllOrders();

	public List<Map<String, Object>> findOrderInfoByOid(String oid);

}
