package org.shchavan.learn.newConcepts.repository;

import org.shchavan.learn.newConcepts.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmpRepo extends JpaRepository<Employee, Long> {
}
