package com.example.courseMania.Repository;

import com.example.courseMania.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    // No need to write anything here, jpa repository do all works
}
