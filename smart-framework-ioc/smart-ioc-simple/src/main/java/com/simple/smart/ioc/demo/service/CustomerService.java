package com.simple.smart.ioc.demo.service;


import com.simple.smart.ioc.annotation.Service;
import com.simple.smart.ioc.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
        String[] a = (String[]) fieldMap.get("");
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID().hashCode());
        customer.setContact(fieldMap.get("contact") instanceof String[] ? ((String[]) fieldMap.get("contact"))[0] : (String) fieldMap.get("contact"));
        customer.setName(fieldMap.get("name") instanceof String[] ? ((String[]) fieldMap.get("name"))[0] : (String) fieldMap.get("name"));
        customer.setEmail(fieldMap.get("email") instanceof String[] ? ((String[]) fieldMap.get("email"))[0] : (String) fieldMap.get("email"));
        customer.setTelephone(fieldMap.get("telephone") instanceof String[] ? ((String[]) fieldMap.get("telephone"))[0] : (String) fieldMap.get("telephone"));
        customer.setRemark(fieldMap.get("remark") instanceof String[] ? ((String[]) fieldMap.get("remark"))[0] : (String) fieldMap.get("remark"));
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
