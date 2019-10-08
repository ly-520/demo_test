package com.example.demo_test.pojo;/**
 * @author yonrun
 * @Title: Employee
 * @ProjectName demo_test
 * @Description: TODO
 * @date 2019/10/8 19:54
 */

import lombok.Data;

/**
 * @author
 * @description
 * @date 2019/10/8
 */
@Data
public class Employee {
    private Integer id;
    private String name;
    private String phone;
    private String email;
    private Integer age;
    private String company;
}
