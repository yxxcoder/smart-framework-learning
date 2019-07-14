package com.simple.smart.ioc.demo.service;


import com.simple.smart.ioc.annotation.Service;
import com.simple.smart.ioc.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 */
@Service
public class CustomerService {
    /**
     * 模拟数据库中数据
     */
    private static List<Customer> customers = new ArrayList<>();

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {
        return customers;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        for (Customer customer : customers) {
            if (id == customer.getId()) {
                return customer;
            }
        }
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        Customer customer = new Customer();
        customer.setId(fieldMap.get("id") != null ? (long) fieldMap.get("id") : -1);
        customer.setContact(String.valueOf(fieldMap.get("contact")));
        customer.setName(String.valueOf(fieldMap.get("name")));
        customer.setEmail(String.valueOf(fieldMap.get("email")));
        customer.setTelephone(String.valueOf(fieldMap.get("telephone")));
        customer.setRemark(String.valueOf(fieldMap.get("remark")));
        customers.add(customer);
        return true;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        for (Customer customer : customers) {
            if (id == customer.getId()) {
                customer.setContact(String.valueOf(fieldMap.get("contact")));
                customer.setName(String.valueOf(fieldMap.get("name")));
                customer.setEmail(String.valueOf(fieldMap.get("email")));
                customer.setTelephone(String.valueOf(fieldMap.get("telephone")));
                customer.setRemark(String.valueOf(fieldMap.get("remark")));
                break;
            }
        }
        return true;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
        for (Customer customer : customers) {
            if (id == customer.getId()) {
                customers.remove(customer);
            }
        }
        return true;
    }
}
