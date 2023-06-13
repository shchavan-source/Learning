package org.shchavan.learn.newConcepts.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class DeptSummary extends Department{
    private Long count;

    DeptSummary(Long id, String name, Long count){
        this.setId(id);
        this.setName(name);
        this.count = count;
    }
}
