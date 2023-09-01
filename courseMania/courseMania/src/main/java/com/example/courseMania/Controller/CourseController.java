package com.example.courseMania.Controller;


import com.example.courseMania.Entity.Course;
import com.example.courseMania.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Course")
public class CourseController {

    @Autowired // This annotation creates automatically an object of CourseService and injects it into courseService
    // Declaring a variable of type CourseService because CourseService is the parent class of CourseServiceImplementation
    CourseService courseService;

    @PostMapping("/add") // PostMapping annotation is used to add or map something new
    public Course addCourse(@RequestBody Course course) {

        return courseService.addCourse(course);
    }

    @GetMapping("/get/{courseId}") // This bracket takes a dynamic value
    public Course getCourse(@PathVariable int courseId) { // This function will gives only one course

        return courseService.getCourse(courseId);
    }

    @PutMapping("/update") // PutMapping annotation is used to add new course if course is not present in database or update existing course
    public Course updateCourse(@RequestBody Course course) {

        return courseService.updateCourse(course);
    }

    @DeleteMapping("/delete{id}") // DeleteMapping annotation is used to remove or delete something
    public String deleteCourse(@RequestParam("id") int id) { // This function will delete the course whose course id is given

        return courseService.deleteCourse(id);
    }

    @GetMapping("/get_courses") // GetMapping annotation maps the getCourses function with "/get_courses"
    public List<Course> getCourses() { // This function will give's you all courses

        return courseService.getCourses(); // This calls getCourses function from CourseServiceImplementation
    }
}
