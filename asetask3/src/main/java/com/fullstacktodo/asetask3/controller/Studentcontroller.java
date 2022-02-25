package com.fullstacktodo.asetask3.controller;

import com.fullstacktodo.asetask3.model.Student;
import com.fullstacktodo.asetask3.service.Studentservice;

import com.fullstacktodo.asetask3.service.Studentserviceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin

public class Studentcontroller {
    @Autowired
    private Studentserviceimplementation studentserviceimplementation;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
       studentserviceimplementation.saveStudent(student);
       return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllstudents(){
    return studentserviceimplementation.getAllstudents();
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id)
    {
        return studentserviceimplementation.deleteUserById(id);
    }
    @PutMapping("/updateuser")
    public String updateUser(@RequestBody Student student)
    {
        studentserviceimplementation.updateUser(student);
        return "student got Updated";
    }
}

