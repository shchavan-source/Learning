package org.shchavan.learn.newConcepts.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @GetMapping()
    public String getHelloWorld(){
        return "Hello World";
    }
}
