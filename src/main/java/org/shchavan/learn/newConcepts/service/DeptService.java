package org.shchavan.learn.newConcepts.service;

import lombok.Data;
import org.shchavan.learn.newConcepts.entity.DeptSummary;
import org.shchavan.learn.newConcepts.repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class DeptService {

    @Autowired
    private DeptRepo deptRepo;

    public List<DeptSummary> getEmpCount(){
        return deptRepo.getDeptSummary();
    }

}
