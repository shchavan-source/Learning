package org.shchavan.learn.newConcepts.repository;

import org.shchavan.learn.newConcepts.entity.Department;
import org.shchavan.learn.newConcepts.entity.DeptSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface DeptRepo extends JpaRepository<Department, Long> {

    @Query("SELECT new org.shchavan.learn.newConcepts.entity.DeptSummary(d.id as id, d.name as name, COUNT(e.id) as count) " +
            "FROM Department d LEFT JOIN Employee e ON d.id = e.department.id " +
            "GROUP BY d.id, d.name"
    )
    List<DeptSummary> getDeptSummary();
}
