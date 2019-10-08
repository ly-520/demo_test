package com.example.demo_test.service;/**
 * @author yonrun
 * @Title: EmployeeService
 * @ProjectName demo_test
 * @Description: TODO
 * @date 2019/10/8 19:58
 */

import com.example.demo_test.pojo.Employee;

import java.util.List;

/**
 * @author
 * @description
 * @date 2019/10/8
 */
public interface EmployeeService {

    List<Employee> queryAllEmployee();
}
