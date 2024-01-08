package com.alamincse.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alamincse.main.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
