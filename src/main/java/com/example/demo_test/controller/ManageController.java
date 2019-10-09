package com.example.demo_test.controller;/**
 * @author yonrun
 * @Title: TestController
 * @ProjectName demo_test
 * @Description: TODO
 * @date 2019/10/8 17:22
 */

import com.example.demo_test.pojo.Employee;
import com.example.demo_test.service.EmployeeService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity getAllEmployeeInfo(){
        List<Employee> employeeList = employeeService.queryAllEmployee();
        JSONArray jsonArray= JSONArray.fromObject(employeeList);
        return ResponseEntity.ok(jsonArray);
    }

    @CrossOrigin
    @RequestMapping("api/addEmployee")
    public ResponseEntity AddEmployeeInfo(@RequestBody Employee employee){
        System.out.println(employee.toString());
        if (employee == null){
            return ResponseEntity.badRequest().build();
        }
        boolean result = employeeService.insertEmployee(employee);
        if(!result){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }

    @CrossOrigin
    @RequestMapping("api/employee")
    public ResponseEntity getEmployeeInfoById(Integer id){
        System.out.println("id："+id);
        if(id == null){
            return ResponseEntity.badRequest().build();
        }
        Employee employee = employeeService.queryEmployeeInfoById(id);
        return ResponseEntity.ok(employee);
    }

    @CrossOrigin
    @RequestMapping("api/deleteEmployee")
    public ResponseEntity deleteEmployee(Integer id){
        System.out.println("id："+id);
        if(id == null){
            return ResponseEntity.badRequest().build();
        }
        Boolean result = employeeService.deleteEmployeeById(id);
        if(!result){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }


    @CrossOrigin
    @RequestMapping("api/editEmployee")
    public ResponseEntity editEmployee(@RequestBody Employee employee){
        System.out.println(employee.toString());
        if(employee == null){
            return ResponseEntity.badRequest().build();
        }
        Boolean result = employeeService.updateEmployeeById(employee);
        if(!result){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }
}
