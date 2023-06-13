package org.shchavan.learn.newConcepts.controller;

import org.shchavan.learn.newConcepts.entity.DeptSummary;
import org.shchavan.learn.newConcepts.entity.Employee;
import org.shchavan.learn.newConcepts.service.DeptService;
import org.shchavan.learn.newConcepts.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @Autowired
    private DeptService deptService;

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello World";
    }

    @GetMapping()
    public List<Employee> getEmps(){
        return empService.getAllEmp();
    }

    @GetMapping("/empCount")
    public List<DeptSummary> getEmpCount(){
       return deptService.getEmpCount();
    }

}
