package com.bajaj.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student postOperation(@RequestBody RequestDto data) {
        return studentService.postOperation(data);
    }

    @GetMapping
    public ResponseDto getOperation() {
        return new ResponseDto(Integer.parseInt("1"));
    }
}
