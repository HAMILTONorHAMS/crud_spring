package com.hamilton.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamilton.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
     
}
