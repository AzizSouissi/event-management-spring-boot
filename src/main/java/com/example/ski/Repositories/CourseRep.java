package com.example.ski.Repositories;

import com.example.ski.Entities.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRep extends CrudRepository<Course, Long> {
    @Query("SELECT c " +
            "FROM Course c " +
            "JOIN Moniteur m ON c member m.courses " +
            "WHERE m.nomM = :nameMoniteur ")
    List<Course> GetCourseByMoniteur(@Param("nameMoniteur") String nameMoniteur);
}
