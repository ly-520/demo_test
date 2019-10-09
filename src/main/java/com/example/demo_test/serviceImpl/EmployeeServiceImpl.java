package com.example.demo_test.serviceImpl;/**
 * @author yonrun
 * @Title: EmployeeServiceImpl
 * @ProjectName demo_test
 * @Description: TODO
 * @date 2019/10/8 19:59
 */

import com.example.demo_test.dao.EmployeeDao;
import com.example.demo_test.pojo.Employee;
import com.example.demo_test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @description
 * @date 2019/10/8
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<Employee> queryAllEmployee() {
        return employeeDao.selectAllEmployee();
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        return employeeDao.insertEmployee(employee) > 0;
    }

    @Override
    public Employee queryEmployeeInfoById(Integer id) {
        return employeeDao.selectEmployeeById(id);
    }

    @Override
    public boolean deleteEmployeeById(Integer id) {
        return employeeDao.deleteEmployeeById(id) > 0;
    }

    @Override
    public boolean updateEmployeeById(Employee employee) {
        return employeeDao.updateEmployee(employee) > 0;
    }
}
