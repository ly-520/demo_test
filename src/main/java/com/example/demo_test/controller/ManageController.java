package com.example.demo_test.controller;/**
 * @author yonrun
 * @Title: TestController
 * @ProjectName demo_test
 * @Description: TODO
 * @date 2019/10/8 17:22
 */

import com.example.demo_test.common.JsonResult;
import com.example.demo_test.pojo.Employee;
import com.example.demo_test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @description
 * @date 2019/10/8
 */
@RestController
public class ManageController {

    @Autowired
    private EmployeeService employeeService;

/*    @CrossOrigin
    @RequestMapping("api/index")
    public JsonResult EmployeeInfo(){
        JsonResult jsonResult=new JsonResult();
        List<Employee> employeeList = employeeService.queryAllEmployee();
        return jsonResult.success(employeeList);
    }*/

    @CrossOrigin
    @RequestMapping("api/index")
    public ResponseEntity EmployeeInfo(){
        JsonResult jsonResult=new JsonResult();
        List<Employee> employeeList = employeeService.queryAllEmployee();
        /*  //https://blog.csdn.net/sinat_23490433/article/details/78789362
         *JSONArray jsonArray= JSONArray.
        return ResponseEntity.ok(JSON.toJSON(employeeList));*/
        return ResponseEntity.ok().build();
    }
}
