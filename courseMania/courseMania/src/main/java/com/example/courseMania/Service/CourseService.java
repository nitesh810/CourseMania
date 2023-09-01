package com.example.courseMania.Service;

import com.example.courseMania.Entity.Course;

import java.util.List;
import java.util.Optional;


public interface CourseService {

    public Course addCourse(Course course);

    public Course getCourse(int courseId);

    public Course updateCourse(Course course);

    public String deleteCourse(int courseId);

    public List<Course> getCourses();
}
