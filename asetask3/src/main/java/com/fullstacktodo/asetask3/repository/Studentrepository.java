package com.fullstacktodo.asetask3.repository;

import com.fullstacktodo.asetask3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Student,Integer> {
}
