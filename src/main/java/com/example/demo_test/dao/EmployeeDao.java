package com.example.demo_test.dao;

import com.example.demo_test.pojo.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yonrun
 * @Title: EmployeeDao
 * @ProjectName demo_test
 * @Description: TODO
 * @date 2019/10/8 20:02
 */
@Repository
public interface EmployeeDao {

    List<Employee> selectAllEmployee();

    int insertEmployee(Employee employee);

    Employee selectEmployeeById(@Param("id") Integer id);

    int deleteEmployeeById(@Param("id") Integer id);

    int updateEmployee(Employee employee);
}
