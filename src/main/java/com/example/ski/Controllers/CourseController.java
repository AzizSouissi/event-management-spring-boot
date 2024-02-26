package com.example.ski.Controllers;

import com.example.ski.Entities.Course;
import com.example.ski.Services.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
@RequiredArgsConstructor
public class CourseController {
    private final ICourseService iCourseService;

    @GetMapping
    public List<Course> getAll() {
        return iCourseService.getAll();
    }

    @GetMapping("{id}")
    public Course getId(@PathVariable long id) {
        return iCourseService.getId(id);
    }

    @PutMapping
    public Course updateCourse(@RequestBody Course c) {
        return iCourseService.updateCourse(c);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course c) {
        return iCourseService.addCourse(c);
    }
    @DeleteMapping("{id}")
    public Boolean deleteById(@PathVariable long id) {
        return iCourseService.deleteById(id);
    }
}