package com.example.courseMania.Service;

import com.example.courseMania.Entity.Course;
import com.example.courseMania.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CourseServiceImplementation implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course addCourse(Course course) {

        return courseRepository.save(course); // This save() function adds the course
    }

    @Override
    public Course getCourse(int courseId) {
        Optional<Course> course = courseRepository.findById(courseId); // This findById() function returns a single course whose id is given
        return course.get();
    }

    @Override
    public Course updateCourse(Course course) {

        return courseRepository.save(course); // This save() function also works as an updater. If a course is present in database then it simply updates the details or  if a course is not present in database then it simply adds a new course
    }

    @Override
    public String deleteCourse(int courseId) {
        Optional<Course> course = courseRepository.findById(courseId); // Gets the course whose id is given
        courseRepository.delete(course.get()); // This delete() function deletes the course
        return "Course have been deleted";
    }

    @Override
    public List<Course> getCourses() {

        return courseRepository.findAll(); // This findAll() function returns list of all courses present in database
    }
}




