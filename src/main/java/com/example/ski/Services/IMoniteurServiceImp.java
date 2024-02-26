package com.example.ski.Services;

import com.example.ski.Entities.Course;
import com.example.ski.Entities.Moniteur;
import com.example.ski.Entities.Piste;
import com.example.ski.Repositories.CourseRep;
import com.example.ski.Repositories.MoniteurRep;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class IMoniteurServiceImp implements IMoniteurService {
    private final MoniteurRep moniteurRep;
    private final CourseRep courseRep;

    @Override
    public Moniteur addMoniteur(Moniteur m) {
        return moniteurRep.save(m);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur m) {
        return moniteurRep.save(m);
    }

    @Override
    public List<Moniteur> getAll() {
        return (List<Moniteur>) moniteurRep.findAll();
    }

    @Override
    public Moniteur getMoniteurById(long id) {
        return moniteurRep.findById(id).orElse(null);
    }

    @Override
    public Boolean deleteMoniteurById(long id) {
        moniteurRep.deleteById(id);
        return !moniteurRep.existsById(id);
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, long numCourse) {
        Course course = courseRep.findById(numCourse).orElse(null);
        Set<Course> courses = new HashSet<>();
        courses.add(course);
        moniteur.setCourses(courses);
        return moniteurRep.save(moniteur);
    }
}
