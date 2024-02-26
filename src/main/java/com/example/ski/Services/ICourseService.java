package com.example.ski.Services;

import com.example.ski.Entities.Course;
import com.example.ski.Entities.Skieur;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course c);
    Course updateCourse(Course c);
    List<Course> getAll();
    Course getId(long id);
    Boolean deleteById(long id);
}
