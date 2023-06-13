package org.shchavan.learn.newConcepts.service;

import lombok.Data;
import org.shchavan.learn.newConcepts.entity.Employee;
import org.shchavan.learn.newConcepts.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class EmpService {

    @Autowired
    public EmpRepo empRepo;

    public List<Employee> getAllEmp(){
        return empRepo.findAll();
    }

}
