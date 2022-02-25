package com.fullstacktodo.asetask3.service;

import com.fullstacktodo.asetask3.model.Student;
import com.fullstacktodo.asetask3.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class Studentserviceimplementation implements Studentservice {
    @Autowired
    private Studentrepository studentrepository;

    @Override

    public Student saveStudent(Student student) {
        return studentrepository.save(student);

    }

    @Override
    public List<Student> getAllstudents() {
        return studentrepository.findAll();
    }

    @Override
    public String deleteUserById(@PathVariable int id) {
        studentrepository.deleteById(id);
        return "User got Deleted";

    }

    @Override
    public Student updateUser(@RequestBody Student student) {
        Student oldUser = null;
        Optional<Student> optionalUser = studentrepository.findById(student.getId());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setName(student.getName());
            oldUser.setAddress(student.getAddress());
            return studentrepository.save(oldUser);

        } else {
            return new Student();
        }
    }
}




