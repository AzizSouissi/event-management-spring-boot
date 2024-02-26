package com.example.ski.Services;

import com.example.ski.Entities.Course;
import com.example.ski.Entities.Skieur;
import com.example.ski.Repositories.CourseRep;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ICourseServiceImp implements ICourseService{
    private final CourseRep courseRep;
    @Override
    public Course addCourse(Course c) {
        return courseRep.save(c);
    }

    @Override
    public Course updateCourse(Course c) {
        return courseRep.save(c);
    }

    @Override
    public List<Course> getAll() {
        return (List<Course>) courseRep.findAll();
    }

    @Override
    public Course getId(long id) {
        return courseRep.findById(id).orElseThrow(() -> new IllegalArgumentException("No course found by this id"+id));
    }

    @Override
    public Boolean deleteById(long id) {
        courseRep.deleteById(id);
        return !courseRep.existsById(id);
    }
}
