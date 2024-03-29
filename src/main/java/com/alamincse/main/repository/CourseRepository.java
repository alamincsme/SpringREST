package com.alamincse.main.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alamincse.main.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
