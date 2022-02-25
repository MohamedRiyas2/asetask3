package com.fullstacktodo.asetask3.service;

import com.fullstacktodo.asetask3.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface Studentservice {
    public Student saveStudent(Student student);
    public List<Student> getAllstudents();
    public String deleteUserById(int id);
    public Student updateUser(Student student);
}
